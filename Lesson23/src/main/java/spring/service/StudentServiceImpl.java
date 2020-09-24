package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.db.dao.StudentDao;
import spring.db.pojo.Student;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;


    @Autowired
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> getStudentList() {
        return studentDao.getStudentList();
    }

    @Override
    public void addStudent(String name, String familyName, String age, String group) {
        Student student = new Student(
                name,
                familyName,
                Integer.valueOf(age),
                group
        );
        studentDao.addStudent(student);
    }
}

