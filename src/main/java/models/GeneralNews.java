package models;

public class GeneralNews extends News {
    public static final String NEWS_TYPE = "general";

    public GeneralNews(int id,String title, String content, String posted_by) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.posted_by = posted_by;
        this.type = NEWS_TYPE;
    }
}
