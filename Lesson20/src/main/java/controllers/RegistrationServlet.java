package controllers;

import pojo.User;
import service.UserService;
import service.UserServiceImpl;
import service.utils.HashUtil;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegistrationServlet extends HttpServlet {
    boolean successRegister;
    private UserService userService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init();
        userService = new UserServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().setAttribute("successRegister", successRegister);
        String login = req.getParameter("login");
        req.getSession().setAttribute("login", login);
        req.getRequestDispatcher("/registration.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String password2 = req.getParameter("password2");
        String role = req.getParameter("role");

        if (password.equals(password2)) {
            int roleBD = role.equals("teach") ? 3 : 4;

            User user = new User(login, HashUtil.stringToMD5(password), roleBD);
            successRegister = userService.addUser(user);
            req.getSession().setAttribute("successRegister", successRegister);
            if (user.getRole() == 3) {
                req.getSession().setAttribute("role", "teach");
            } else if (user.getRole() == 4) {
                req.getSession().setAttribute("role", "stud");
            }
            doGet(req, resp);
            resp.sendRedirect("/inner/dashboard");

        }

    }
}
