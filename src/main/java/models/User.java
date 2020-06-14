package models;

import java.util.Objects;

public class User {
    private String username;
    private String department;
    private String role;
    private String position_occupy;
    private int department_id;
    private int id;

    public User(String username, String department, String position_occupy, int department_id, int id) {
        this.username = username;
        this.department = department;
        this.role = role;
        this.position_occupy = position_occupy;
        this.department_id = department_id;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPosition_occupy() {
        return position_occupy;
    }

    public void setPosition_occupy(String position_occupy) {
        this.position_occupy = position_occupy;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return department_id == user.department_id &&
                id == user.id &&
                Objects.equals(username, user.username) &&
                Objects.equals(department, user.department) &&
                Objects.equals(role, user.role) &&
                Objects.equals(position_occupy, user.position_occupy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, department, role, position_occupy, department_id, id);
    }
}
