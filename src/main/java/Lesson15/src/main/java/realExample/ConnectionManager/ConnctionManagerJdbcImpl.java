package Lesson15.src.main.java.realExample.ConnectionManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnctionManagerJdbcImpl implements ConnectionManager {
    private static ConnectionManager connectionManager;

    public static ConnectionManager getInstance(){
        if(connectionManager==null){
            connectionManager= new ConnctionManagerJdbcImpl();

        }
        return connectionManager;
    }

    private ConnctionManagerJdbcImpl(){}

    @Override
    public Connection getConnection() {
        Connection connection=null;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/students","postgres","postgres");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
