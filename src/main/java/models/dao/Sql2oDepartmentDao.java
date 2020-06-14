package models.dao;

import models.Department;
import org.sql2o.Connection;

import java.util.List;

public class Sql2oDepartmentDao implements DepartmentDao {
    @Override
    public void add(Department department) {
        String sql = "INSERT INTO departments(department_name, number_of_employees, description, id) VALUES(:department_name, :number_of_employees, :description, :id)";
        try (Connection con = DB.sql2o.open()) {
            int id = (int)con.createQuery(sql,true)
                    .bind(department)
                    .executeUpdate()
                    .getKey();
            department.setId(id);
        }
    }

    @Override
    public List<Department> getDepartments() {
        String sql = "SELECT * FROM departments";
        try (Connection con = DB.sql2o.open()) {
            return con.createQuery(sql)
                    .executeAndFetch(Department.class);
        }
    }
}
