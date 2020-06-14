package models;

import java.util.Objects;

public class Department {
    private String department_name;
    private int number_of_employees;
    private String description;
    private int id;

    public Department(String department_name, int number_of_employees, String description, int id) {
        this.department_name = department_name;
        this.number_of_employees = number_of_employees;
        this.description = description;
        this.id = id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public int getNumber_of_employees() {
        return number_of_employees;
    }

    public void setNumber_of_employees(int number_of_employees) {
        this.number_of_employees = number_of_employees;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        Department that = (Department) o;
        return number_of_employees == that.number_of_employees &&
                id == that.id &&
                Objects.equals(department_name, that.department_name) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(department_name, number_of_employees, description, id);
    }
}
