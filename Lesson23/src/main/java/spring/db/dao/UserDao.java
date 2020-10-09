package spring.db.dao;

public interface UserDao {

    void addUser(String login, String passwordHash);
}
