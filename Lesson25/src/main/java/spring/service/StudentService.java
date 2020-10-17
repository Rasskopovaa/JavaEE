package spring.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.data.StudentDao;
import spring.data.pojo.Student;

@Service
public class StudentService {

    StudentDao studentDao;

    @Autowired
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public Student getStudentById(Integer id) {
        return studentDao.getStudent(id);
    }
}
