package controllers;

import pojo.Marks;
import pojo.Student;
import repository.dao.UserDao;
import repository.dao.UserDaoImpl;
import service.MarksService;
import service.StudentService;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DashboardController extends HttpServlet {
    UserService userService;
    UserDao userDao = new UserDaoImpl();
    private StudentService studentService;
    private MarksService marksService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String role = (String) req.getSession().getAttribute("login");
        req.getRequestDispatcher("/dashboard.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            String name = req.getParameter("name");
            String surname = req.getParameter("surname");
            int age = Integer.parseInt(req.getParameter("age"));
            String contact = req.getParameter("contact");
            int city = Integer.parseInt(req.getParameter("city"));
            Student student = new Student(name, surname, age, contact, city);
            studentService.addStudent(student);
            resp.sendRedirect("/inner/dashboard");
        } catch (Exception ex) {

            req.getRequestDispatcher("/dashboard.jsp").forward(req, resp);

        }
        try {
            int id = Integer.parseInt(req.getParameter("id"));
            String subject = req.getParameter("subject");
            int marks = Integer.parseInt(req.getParameter("marks"));
            Marks mark = new Marks(id, subject, marks);
            marksService.addMarks(mark);
            resp.sendRedirect("/inner/dashboard");
        } catch (Exception ex) {

            req.getRequestDispatcher("/dashboard.jsp").forward(req, resp);


        }
    }
}
