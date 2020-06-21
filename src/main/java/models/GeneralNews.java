package models;

import java.util.Objects;

public class GeneralNews {
    public String title;
    public String content;
    public String posted_by;
    public String type;
    public int id;
    public static final String NEWS_TYPE = "general";

    public GeneralNews(int id,String title, String content, String posted_by) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.posted_by = posted_by;
        this.type = NEWS_TYPE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeneralNews that = (GeneralNews) o;
        return id == that.id &&
                Objects.equals(title, that.title) &&
                Objects.equals(content, that.content) &&
                Objects.equals(posted_by, that.posted_by) &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, content, posted_by, type, id);
    }
}
