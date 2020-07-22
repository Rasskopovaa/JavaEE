package Lesson15.src.main.java.basics;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static java.sql.DriverManager.getConnection;

public class Example2 {
    public static void main(String[] args) {
       /* try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        */
        try (Connection connection = getConnection("jdbc:postgresql://localhost:5432/students",
                "postgres",
                "postgres");
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * from students where name =? and students.group>=?");
        ) {
            preparedStatement.setString(1,"Alex");
            preparedStatement.setInt(2, 2);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    System.out.print(resultSet.getString("name") + ":");
                    System.out.println(resultSet.getString("surname") + ":");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}