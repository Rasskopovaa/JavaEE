package service;

import repository.dao.StudentDao;
import repository.dao.StudentDaoImpl;
import servlets_pojo.Student;

import java.util.List;

public class StudentServerImpl implements StudentService {
    private StudentDao studentDao;

    public StudentServerImpl() {
        studentDao = new StudentDaoImpl();
    }

    public StudentServerImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }
}
