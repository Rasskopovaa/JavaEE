package service;

import pojo.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    boolean addStudent(Student student);
}
