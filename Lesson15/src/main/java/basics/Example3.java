package basics;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static java.sql.DriverManager.getConnection;

public class Example3 {
    public static void main(String[] args) {
        try (Connection connection = getConnection("jdbc:postgresql://localhost:5432/students",
                "postgres",
                "postgres");
             PreparedStatement preparedStatement = connection.prepareStatement("UPDATE students  set name ='Lolosha' where students.group=?");
        ) {
            for (String str: args){
                preparedStatement.setInt(1,Integer.parseInt(str));
                preparedStatement.addBatch();
            }
            preparedStatement.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}