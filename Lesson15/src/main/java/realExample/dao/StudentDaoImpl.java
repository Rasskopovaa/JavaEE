package realExample.dao;

import realExample.ConnectionManager.ConnctionManagerJdbcImpl;
import realExample.ConnectionManager.ConnectionManager;
import realExample.pojo.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static java.sql.DriverManager.getConnection;
import static java.sql.DriverManager.setLoginTimeout;

public class StudentDaoImpl implements StudentDao {
    private static ConnectionManager connectionManager = ConnctionManagerJdbcImpl.getInstance();

    @Override
    public boolean addStudent(Student student) {
        Connection connection = connectionManager.getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO students_info VALUES (?,?,?,DEFAULT,?,?)");
        ) {
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getSurname());
            preparedStatement.setInt(3, student.getAge());
            preparedStatement.setString(4, student.getContact());
            preparedStatement.setInt(5, student.getCity());
            preparedStatement.execute();

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
        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM students_info WHERE id=?");
        ) {

            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    student = new Student(resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getString("surname"),
                            resultSet.getInt("age"),
                            resultSet.getInt("city"),
                            resultSet.getString("contact"));
                }

            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return student;
    }

    @Override
    public boolean updateStudent(Student student) {
        if (student.getId() != 0) {
            Connection connection = connectionManager.getConnection();
            try (PreparedStatement preparedStatement = connection.prepareStatement("UPDATE students_info SET name=?,surname=?,age=? ,contact=?,city=? WHERE id=?");
            ) {

                preparedStatement.setString(1, student.getName());
                preparedStatement.setString(2, student.getSurname());
                preparedStatement.setInt(3, student.getAge());
                preparedStatement.setString(4, student.getContact());
                preparedStatement.setInt(5, student.getCity());
                preparedStatement.setInt(6, student.getId());
                preparedStatement.execute();
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }

        }return true;
    }

    @Override
    public boolean deleteStudentById(int id) {
        Connection connection = connectionManager.getConnection();
        Student student = null;
        try (PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM students_info WHERE id=?");
        ) {

            preparedStatement.setInt(1, id);
           preparedStatement.execute();
            } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
return true;
    }


    @Override
    public boolean deleteStudentByName(String name) {
        Connection connection = connectionManager.getConnection();
        Student student = null;
        try (PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM students_info WHERE name=?");
        ) {

            preparedStatement.setString(1,name);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
