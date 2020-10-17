package spring.data;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import spring.data.mapper.StudentMapper;
import spring.data.pojo.Student;

import java.util.List;

@Repository
@Transactional
public class StudentDaoImpl extends JdbcDaoSupport implements StudentDao {
    @Autowired
    public StudentDaoImpl(JdbcTemplate jdbcTemplate) {
        this.setJdbcTemplate(jdbcTemplate);
    }

    public StudentDaoImpl() {
    }

    @Override
    public List<Student> getStudentsList() {
        String getStudentsQuery = "select * from students_info";
        return super.getJdbcTemplate().query(getStudentsQuery, new StudentMapper());
    }

    @Override
    public void addStudent(Student student) {
        String addStudentQuery = "insert into students_info (name, surname, age, contact)" +
                " values (?,?,?,?)";
        super.getJdbcTemplate().update(addStudentQuery, student.getName(), student.getSurname(),
                student.getAge(), student.getGroup());
    }

    @Override
    public Student getStudent(Integer id) {
        String getStudentQuery = "select * from students_info where id=?";
        return super.getJdbcTemplate().queryForObject(getStudentQuery,
                new Object[]{id}, new StudentMapper());
    }

    @Override
    public void deleteStudent(Integer id) {
        String deleteStudentQuery = "delete from students_info where id=?";
        super.getJdbcTemplate().update(deleteStudentQuery, id);
    }

    @Override
    public void update(Integer id, Integer age, String name, String surname) {
        String updateStudentQuery = "update students_info set name=?, surname=?, age=? " +
                "where id=?";
        super.getJdbcTemplate().update(updateStudentQuery, name, surname, age, id);
    }
}
