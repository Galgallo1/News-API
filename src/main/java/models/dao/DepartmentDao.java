package models.dao;

import models.Department;

import java.util.List;

public interface DepartmentDao {
    //create department
    void add(Department department);

    //fetch departments
    List<Department> getDepartments();
}