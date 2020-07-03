package basics;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;

    public class Example1 {
        public static void main(String[] args) {

            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            try (Connection connection =getConnection("jdbc:postgresql://localhost:5432/students",
                    "postgres",
                    "postgres");
                // Statement statement = connection.createStatement();
                 ResultSet resultSet = connection.createStatement().executeQuery("" +
                         "SELECT * FROM students");) {


                while(resultSet.next()) {
                    System.out.print(resultSet.getInt("id_student") + ":");
                    System.out.print(resultSet.getString("name") + ":");
                    System.out.println(resultSet.getString("surname") + ":");

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

