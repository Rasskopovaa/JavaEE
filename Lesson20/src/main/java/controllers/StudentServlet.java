package controllers;


import pojo.Student;
import service.StudentService;
import service.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class StudentServlet extends HttpServlet {
    private StudentService studentService;
    private Student student;

    @Override
    public void init() throws ServletException {
        super.init();
        studentService = new StudentServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> list = studentService.getAllStudents();
        req.setAttribute("list", list);
        req.getRequestDispatcher("/students.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(req.getParameter("id"));
            String name = req.getParameter("name");
            String surname = req.getParameter("surname");
            String contact = req.getParameter("contact");
            int age = Integer.parseInt(req.getParameter("age"));
            int city = Integer.parseInt(req.getParameter("city"));
            Student student = new Student(id, name, surname, age, contact, city);

            resp.sendRedirect(req.getContextPath() + "/students.jsp");
        } catch (Exception ex) {

            getServletContext().getRequestDispatcher("/students.jsp").forward(req, resp);
        }
    }

}
