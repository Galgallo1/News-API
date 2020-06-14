package models.dao;

import models.User;

import java.util.List;

public interface UserDao {
    //create user
    void addUser(User user);

    //read individual user
    User findUserById(int id);
    List<User> allUsers();

    //read user by id'
    List<User>getUsersBydepartment(int department_id);

}
