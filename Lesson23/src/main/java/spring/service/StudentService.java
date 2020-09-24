package spring.service;

import spring.db.pojo.Student;

import java.util.List;

public interface StudentService {

    List<Student> getStudentList();

    void addStudent(String name, String familyName, String age, String group);
}
