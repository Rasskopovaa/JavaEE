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
            String name = req.getParameter("name");
            String surname = req.getParameter("surname");
            int age = Integer.parseInt(req.getParameter("age"));
            String contact = req.getParameter("contact");
            int city = Integer.parseInt(req.getParameter("city"));
            Student student = new Student(name, surname, age, contact, city);
            studentService.addStudent(student);
            resp.sendRedirect("/students");
        } catch (Exception ex) {

            req.getRequestDispatcher("/students.jsp").forward(req, resp);
        }
    }

}
