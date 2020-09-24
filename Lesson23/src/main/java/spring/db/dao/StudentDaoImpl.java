package spring.db.dao;

import org.springframework.stereotype.Repository;
import spring.db.pojo.Student;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {
    private List<Student> students = new ArrayList();

    public StudentDaoImpl() {

        students.add(new Student(1, "Mikhail", "Kirkiv", 23, "AP-827"));
        students.add(new Student(1, "Andrey", "Lelkov", 21, "AP-827"));
        students.add(new Student(1, "Olesya", "Kekova", 22, "AP-827"));
        students.add(new Student(1, "Anna", "Lolova", 23, "AP-827"));
    }


    @Override
    public List<Student> getStudentList() {
        return students;
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

}
