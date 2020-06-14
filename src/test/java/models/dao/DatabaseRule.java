package models.dao;

import org.junit.rules.ExternalResource;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class DatabaseRule extends ExternalResource {
    @Override
    protected void before() {
        DB.sql2o = new Sql2o("jdbc:postgresql://localhost:5432/news_api_test", "gaalo", "1234");
    }

    @Override
    protected void after() {
        try(Connection con = DB.sql2o.open()) {
            String deletegeneralNews = "DELETE FROM general_news *";
            String deleteDepartmentNews = "DELETE FROM department_news *";
            String deleteUsers = "DELETE FROM users *";
            String deleteDepartments = "DELETE FROM departments *";
            con.createQuery(deletegeneralNews).executeUpdate();
            con.createQuery(deleteDepartmentNews).executeUpdate();
            con.createQuery(deleteDepartments).executeUpdate();
            con.createQuery(deleteUsers).executeUpdate();


        }
    }

}
