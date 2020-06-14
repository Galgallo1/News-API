package models.dao;

import models.DepartmentNews;
import models.GeneralNews;
import models.News;

import java.util.List;

public interface NewsDao {

    //create general news
    void addGeneralNews(GeneralNews news);

    //get general news
    List<GeneralNews> allGeneralNews();

    //create department
    void addDepartmentNews(DepartmentNews news);

    //get department news
    List<DepartmentNews> allDepartmentNews();

    //get specific department new
    List<DepartmentNews>departmentNews(int department_id);
}