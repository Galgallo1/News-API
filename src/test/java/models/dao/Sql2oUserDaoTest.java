package models.dao;

import models.User;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class Sql2oUserDaoTest {
    Sql2oUserDao user = new Sql2oUserDao();

    @Rule
    public DatabaseRule database = new DatabaseRule();


    @Test
    public void addUser() {
        User testUser = new User("Gaalo","CID", "Senior Agent",1,1);
        user.addUser(testUser);
        assertEquals(testUser,user.allUsers().get(0));
    }

    @Test
    public void allUsers() {
        User testUser = new User("Gaalo","CID", "Senior Agent",1,1);
        user.addUser(testUser);
        assertEquals(testUser,user.allUsers().get(0));
    }

    @Test
    public void findUserById() {
        User testUser = new User("Gaalo","CID", "Senior Agent",5,1);
        user.addUser(testUser);
        assertEquals(testUser, user.findUserById(1));
    }

    @Test
    public void getUsersBydepartment() {
        User testUser = new User("Gaalo","CID", "Senior Agent",5,1);
        user.addUser(testUser);
        assertEquals(testUser, user.getUsersBydepartment(5).get(0));
    }
}