package spring.db.dao.mapper;

import org.springframework.jdbc.core.RowMapper;
import spring.db.pojo.Student;

import java.sql.ResultSet;
import java.sql.SQLException;


public class StudentMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setName(rs.getString("name"));
        student.setFamilyName(rs.getString("surname"));
        student.setAge(rs.getInt("age"));
        student.setGroup(rs.getString("contact"));
        return student;

    }
}
