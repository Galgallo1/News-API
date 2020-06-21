package models.dao;

import models.DepartmentNews;
import models.GeneralNews;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class Sql2oNewsDaoTest {
    Sql2oNewsDao news1 = new Sql2oNewsDao();

    @Rule
    public DatabaseRule database = new DatabaseRule();

    @Test
    public void addGeneralNews() {
        GeneralNews generalNews = new GeneralNews(1,"Emergency", "Police chopper crash", "Gaalo");
        news1.addGeneralNews(generalNews);
        //assertEquals(1, news1.allGeneralNews().size());
        //assertTrue(generalNews.equals(news1.allGeneralNews().get(0)));
        //assertEquals(generalNews, news1.allGeneralNews().get(0));
        System.out.println(generalNews);

        //575cd6bf
    }

    @Test
    public void addDepartmentNews() {
        DepartmentNews departmentNews = new DepartmentNews("Emergency", "Police chopper crash",1,"Gaalo");
        news1.addDepartmentNews(departmentNews);
        assertEquals(departmentNews, news1.allDepartmentNews().get(0));
    }

    @Test
    public void departmentNews() {
        DepartmentNews departmentNews = new DepartmentNews("Emergency", "Police chopper crash",1,"Gaalo");
        news1.addDepartmentNews(departmentNews);
        assertEquals(departmentNews,news1.departmentNews(1).get(0));
    }
}