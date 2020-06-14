package models.dao;

import models.User;

import org.sql2o.Connection;
import java.util.List;

public class Sql2oUserDao implements UserDao {

    @Override
    public void addUser(User user) {
        String sql = "INSERT INTO users(username, department, position_occupy, department_id, id) VALUES (:username, :department, :position_occupy, :department_id, :id)";
        try(Connection con = DB.sql2o.open()){
            con.createQuery(sql)
                    .bind(user)
                    .executeUpdate();

        }
    }
//String username, String department, String role, String position_occupy, int department_id, int id
    @Override
    public User findUserById(int id) {
        try (Connection con = DB.sql2o.open()){
            return con.createQuery("SELECT * FROM users WHERE id = :id")
                    .addParameter("id",id)
                    .executeAndFetchFirst(User.class);
        }
    }

    @Override
    public List<User> allUsers() {
        String sql = "SELECT * FROM users";
        try(Connection con = DB.sql2o.open()){
            return con.createQuery(sql)
                    .executeAndFetch(User.class);
        }

    }

    @Override
    public List<User> getUsersBydepartment(int department_id) {
        String sql = "SELECT * FROM users WHERE department_id = :department_id";
        try (Connection con = DB.sql2o.open()){
            return con.createQuery(sql)
                    .addParameter("department_id",department_id)
                    .executeAndFetch(User.class);
        }
    }
}
