package spring.db.dao;

import spring.db.pojo.Student;

import java.util.List;

public interface StudentDao {

    List<Student> getStudentList();

    void addStudent(Student student);

    Student getStudent(Integer id);

    void deleteStudent(Integer id);

    void update(Integer id, Integer age, String name, String familyName);

}
