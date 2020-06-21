package models.dao;

import models.DepartmentNews;
import models.GeneralNews;
import models.News;

import org.sql2o.Connection;
import java.util.List;

public class Sql2oNewsDao implements NewsDao {
    //GeneralNews news1;
    //DepartmentNews departmentNews;

    @Override
    public void addGeneralNews(GeneralNews news) {
        String sql = "INSERT INTO general_news(id, title, content, posted_by) VALUES(:id, :title, :content, :posted_by)";
        try (Connection con = DB.sql2o.open()) {
             con.createQuery(sql)
                    .bind(news)
                    .executeUpdate();

        }
    }

    @Override
    public List<GeneralNews> allGeneralNews() {
        String sql = "SELECT * FROM general_news";
        try (Connection con = DB.sql2o.open()) {
            return con.createQuery(sql)
                    .executeAndFetch(GeneralNews.class);
        }
    }

    @Override
    public void addDepartmentNews(DepartmentNews news) {
        String sql = "INSERT INTO department_news(title, content, department_id, posted_by) VALUES(:title, :content, :department_id, :posted_by)";
        try (Connection con = DB.sql2o.open()) {
             con.createQuery(sql)
                    .bind(news)
                    .executeUpdate();
        }
    }
        @Override
        public List<DepartmentNews> allDepartmentNews () {
            String sql = "SELECT * FROM department_news";
            try (Connection con = DB.sql2o.open()) {
                return con.createQuery(sql)
                        .executeAndFetch(DepartmentNews.class);
            }
        }

        @Override
        public List<DepartmentNews> departmentNews ( int department_id){
            String sql = "SELECT * FROM department_news WHERE department_id=:department_id";
            try (Connection con = DB.sql2o.open()) {
                return con.createQuery(sql)
                        .addParameter("department_id", department_id)
                        .executeAndFetch(DepartmentNews.class);
            }
        }

    }
