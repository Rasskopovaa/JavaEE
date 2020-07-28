package repository.dao;


import pojo.Student;

import java.util.List;

public interface StudentDao {
    boolean addStudent(Student student);

    Student getStudentById(int id);

    boolean update(Student student);

    boolean deleteStudentById(int id);

    boolean deleteStudentByName(Student student);

    List<Student> getAllStudents();
}
