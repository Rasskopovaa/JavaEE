package service;

import pojo.Student;

import java.util.List;

public interface TeacherService {
    boolean addStudent(Student student);

    boolean addMarks(int mark);

    List<Student> getAllStudents();

}
