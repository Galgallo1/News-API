package models.dao;

import models.Department;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class Sql2oDepartmentDaoTest {
    Sql2oDepartmentDao departments = new Sql2oDepartmentDao();
    @Rule
    public DatabaseRule database = new DatabaseRule();
    @Test
    public void add() {
        Department department = new Department("Marketing",6,"Outreach",1);
        departments.add(department);
        assertEquals(department, departments.getDepartments().get(0));
    }


    @Test
    public void getDepartments() {
        Department department = new Department("Marketing",6,"Outreach",1);
        departments.add(department);
        assertEquals(department, departments.getDepartments().get(0));
    }
}