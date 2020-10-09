package repository.dao;

import pojo.Student;
import repository.connectionManager.ConnectionManager;
import repository.connectionManager.ConnectionManagerJdbcImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private static ConnectionManager connectionManager = ConnectionManagerJdbcImpl.getInstance();

    @Override
    public boolean addStudent(Student student) {
        Connection connection = connectionManager.getConnection();
        try (PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO students_info VALUES ( ?, ?, ?,DEFAULT, ?, ?)");
        ) {
            statement.setString(1, student.getName());
            statement.setString(2, student.getSurname());
            statement.setInt(3, student.getAge());
            statement.setString(4, student.getContact());
            statement.setInt(5, student.getCity());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Student getStudentById(int id) {
        Connection connection = connectionManager.getConnection();
        Student student = null;
        try (PreparedStatement statement = connection.prepareStatement(
                "SELECT * from students_info WHERE id = ?");
        ) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    student = new Student(resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getString("surname"),
                            resultSet.getInt("age"),
                            resultSet.getString("contact"),
                            resultSet.getInt("city"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return student;
    }

    @Override
    public boolean update(Student student) {
        if (student.getId() != 0) {
            Connection connection = connectionManager.getConnection();
            try (PreparedStatement statement = connection.prepareStatement(
                    "UPDATE students_info SET name=?, familyName=?, age=?, contact=?, city=? WHERE id=?");
            ) {
                statement.setString(1, student.getName());
                statement.setString(2, student.getSurname());
                statement.setInt(3, student.getAge());
                statement.setString(4, student.getContact());
                statement.setInt(5, student.getCity());
                statement.setInt(6, student.getId());
                statement.execute();
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteStudentById(int id) {
        Connection connection = connectionManager.getConnection();
        Student student = null;
        try (PreparedStatement statement = connection.prepareStatement(
                "DELETE FROM students_info WHERE id=?");
        ) {
            statement.setInt(1, id);
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteStudentByName(Student student) {
        {
            Connection connection = connectionManager.getConnection();
            try (PreparedStatement statement = connection.prepareStatement(
                    "delete from students_info where name = ?");) {
                statement.setString(1, student.getName());
                statement.execute();

            } catch (SQLException e) {
                e.printStackTrace();
            }
            return true;
        }
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> result = new ArrayList<>();
        Connection connection = connectionManager.getConnection();
        Student student = null;
        try (PreparedStatement statement = connection.prepareStatement(
                "SELECT * from students_info");
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                result.add(new Student(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getInt("age"),
                        resultSet.getString("contact"),
                        resultSet.getInt("city")));
            }
        } catch (SQLException e) {
            e.getMessage();
            return null;
        }
        return result;
    }

}