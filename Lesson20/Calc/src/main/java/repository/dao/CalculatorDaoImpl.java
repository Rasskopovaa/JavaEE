package repository.dao;

import pojo.Calculator;
import repository.connectionManager.ConnectionManager;
import repository.connectionManager.ConnectionManagerJdbcImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CalculatorDaoImpl implements CalculatorDao {
    private static ConnectionManager connectionManager = ConnectionManagerJdbcImpl.getInstance();

    @Override
    public boolean addResult(Calculator calculator) {
        Connection connection = connectionManager.getConnection();
        try (PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO calculator VALUES ( ?, ?, ?,DEFAULT,?)");
        ) {
            statement.setDouble(1, calculator.getNumber1());
            statement.setDouble(2, calculator.getNumber2());
            statement.setString(3, calculator.getSign());
            statement.setDouble(4, calculator.getResult());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public List<Calculator> getAllResults() {
        List<Calculator> result = new ArrayList<>();

        Connection connection = connectionManager.getConnection();
        try (PreparedStatement statement = connection.prepareStatement(
                "SELECT * from calculator");
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                result.add(new Calculator(
                        resultSet.getInt("id"),
                        resultSet.getDouble("number1"),
                        resultSet.getDouble("number2"),
                        resultSet.getString("sign"),
                        resultSet.getDouble("result")
                ));
            }
        } catch (SQLException e) {
            e.getMessage();
            return null;
        }
        return result;
    }
}
