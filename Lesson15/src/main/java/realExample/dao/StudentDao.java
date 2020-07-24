package realExample.dao;

import realExample.pojo.Student;

public interface StudentDao {
    boolean addStudent(Student student);
    Student getStudentById(int id);
    boolean updateStudent(Student student);
    boolean deleteStudentById(int id);
    boolean deleteStudentByName(String name);

}
