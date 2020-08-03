package controllers;

import pojo.Student;
import service.TeacherService;
import service.TeacherServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class TeacherServlet extends HttpServlet {
    private TeacherService teacherService;

    @Override
    public void init() throws ServletException {
        super.init();
        teacherService = new TeacherServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> list = teacherService.getAllStudents();
        req.setAttribute("list", list);
        req.getRequestDispatcher("/students.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String name = req.getParameter("name");
            String surname = req.getParameter("surname");
            int mark = Integer.parseInt(req.getParameter("mark"));
            String subject = req.getParameter("subject");
            Student student = new Student(name, surname, mark, subject);
            teacherService.addMarks(mark);
            resp.sendRedirect("/students");
        } catch (Exception ex) {

            req.getRequestDispatcher("/students.jsp").forward(req, resp);
        }
    }
}
