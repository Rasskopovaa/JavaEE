package repository.dao;

import pojo.Marks;
import repository.connectionManager.ConnectionManager;
import repository.connectionManager.ConnectionManagerJdbcImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MarksDaoImpl implements MarksDao {
    private static ConnectionManager connectionManager = ConnectionManagerJdbcImpl.getInstance();

    @Override
    public boolean addMark(Marks mark) {
        Connection connection = connectionManager.getConnection();
        try (PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO marks VALUES ( ?, ?, ?, ?,DEFAULT )");
        ) {
            statement.setString(1, mark.getNameStud());
            statement.setString(2, mark.getSurnameStud());
            statement.setInt(3, mark.getMarks());
            statement.setString(4, mark.getSubject());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }


    @Override
    public List<Marks> getAllMarks() {
        List<Marks> result = new ArrayList<>();
        Connection connection = connectionManager.getConnection();
        Marks marks = null;
        try (PreparedStatement statement = connection.prepareStatement(
                "SELECT * from marks");
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                result.add(new Marks(
                        resultSet.getString("nameStud"),
                        resultSet.getString("surnameStud"),
                        resultSet.getString("subject"),
                        resultSet.getInt("marks")
                ));
            }
        } catch (SQLException e) {
            e.getMessage();
            return null;
        }
        return result;

    }
}
