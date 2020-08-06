package repository.dao;

import pojo.User;

public interface UserDao {
    User getUserByLogin(String login);

    boolean addUser(User user);
}
