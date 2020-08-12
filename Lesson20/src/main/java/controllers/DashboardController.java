package controllers;

import pojo.Marks;
import pojo.Student;
import repository.dao.*;
import service.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class DashboardController extends HttpServlet {
    UserService userService;
    StudentDao studentDao = new StudentDaoImpl();
    UserDao userDao = new UserDaoImpl();
    MarksDao marksDao = new MarksDaoImpl();
    private StudentService studentService;
    private MarksService marksService;


    @Override
    public void init() throws ServletException {
        super.init();
        marksService = new MarksServiceImpl();
        studentService = new StudentServiceImpl();

    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String role = (String) req.getSession().getAttribute("role");

        if (role.equals("teach")) {
            List<Student> allStudents = studentService.getAllStudents();
            req.getSession().setAttribute("studentList", allStudents);
        }

        List<Marks> allMarks = marksService.getAllMarks();
        req.getSession().setAttribute("markList", allMarks);
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

        } catch (NumberFormatException ex) {
            req.getRequestDispatcher("/dashboard.jsp").forward(req, resp);
        }
        try {
            String nameStud = req.getParameter("nameStud");
            String surnameStud = req.getParameter("surnameStud");
            String subject = req.getParameter("subject");
            int marks = Integer.parseInt(req.getParameter("marks"));
            Marks mark = new Marks(nameStud, surnameStud, subject, marks);
            marksService.addMarks(mark);
            resp.sendRedirect("/inner/dashboard");
        } catch (NumberFormatException ex) {
            req.getRequestDispatcher("/dashboard.jsp").forward(req, resp);
        }


    }
}
