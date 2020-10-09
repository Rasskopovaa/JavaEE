package spring.db.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import spring.db.dao.mapper.StudentMapper;
import spring.db.pojo.Student;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    public StudentDaoImpl() {

       /* students.add(new Student(1, "Mikhail", "Kirkiv", 23, "AP-827"));
        students.add(new Student(1, "Andrey", "Lelkov", 21, "AP-827"));
        students.add(new Student(1, "Olesya", "Kekova", 22, "AP-827"));
        students.add(new Student(1, "Anna", "Lolova", 23, "AP-827"));*/
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Student> getStudentList() {
        String getStudentsQuerry = "select * from students_info";
        return jdbcTemplate.query(getStudentsQuerry, new StudentMapper());

    }

    @Override
    public void addStudent(Student student) {
        String addStudentQuery = " insert into students_info (name, surname,age,contact)" +
                "values (?,?,?,?)";
        jdbcTemplate.update(addStudentQuery, student.getName(), student.getFamilyName(), student.getAge(), student.getGroup());
    }

    @Override
    public Student getStudent(Integer id) {
        String getStudentQuery = "select * from students_info where id=?";
        return jdbcTemplate.queryForObject(getStudentQuery, new Object[]{id}, new StudentMapper());
    }

    @Override
    public void deleteStudent(Integer id) {
        String deleteStudentQuery = "delete from students_info where id=?";
    }

    @Override
    public void update(Integer id, Integer age, String name, String familyName) {

        String updateStudentQuery = " update students_info set name=? , surname=? ,age=?" +
                "where id=?";
        jdbcTemplate.update(updateStudentQuery, name, familyName, age, id);
    }

}
