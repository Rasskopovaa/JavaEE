package repository.dao;

import pojo.Student;

public interface TeacherDao {
    boolean addStudent(Student student);

    boolean addMark(int mark);
}
