package models;

public class DepartmentNews extends News{
    public static final String NEWS_TYPE = "department";

    public DepartmentNews(String title, String content,int department_id, String posted_by) {
        this.title = title;
        this.content = content;
        this.posted_by = posted_by;
        this.department_id = department_id;
        this.type = NEWS_TYPE;
    }
}
