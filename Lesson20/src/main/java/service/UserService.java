package service;

import pojo.User;

public interface UserService {
    int getRole(String login);
    boolean checkAuth(String login, String password);

    boolean addUser(User user);
}


