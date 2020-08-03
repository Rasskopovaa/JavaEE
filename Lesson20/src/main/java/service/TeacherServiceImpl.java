package service;

import pojo.Student;
import repository.dao.StudentDao;
import repository.dao.TeacherDao;

import java.util.List;

public class TeacherServiceImpl implements TeacherService {
    private TeacherDao teacherDao;
    private StudentDao studentDao;

    @Override
    public boolean addStudent(Student student) {
        return teacherDao.addStudent(student);
    }

    @Override
    public boolean addMarks(int mark) {
        return teacherDao.addMark(mark);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

}
