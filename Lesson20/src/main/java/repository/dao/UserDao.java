package repository.dao;

import pojo.User;

public interface UserDao {
    User getUserByLogin(String login);
}
