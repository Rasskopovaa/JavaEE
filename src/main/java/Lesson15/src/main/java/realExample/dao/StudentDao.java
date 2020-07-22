package Lesson15.src.main.java.realExample.dao;

import Lesson15.src.main.java.realExample.pojo.Student;

public interface StudentDao {
    boolean addStudent(Student student);
    Student getStudentById(int id);
    boolean updateStudent(Student student);
    boolean deleteStudentById(int id);
    boolean deleteStudentByName(String name);

}
