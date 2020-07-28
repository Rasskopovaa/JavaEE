package repository.connectionManager;

import java.sql.Connection;

public interface ConnectionManager {
    Connection getConnection();
}
