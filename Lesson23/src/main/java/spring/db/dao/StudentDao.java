package spring.db.dao;

import spring.db.pojo.Student;

import java.util.List;

public interface StudentDao {

    List<Student> getStudentList();

    void addStudent(Student student);

}
