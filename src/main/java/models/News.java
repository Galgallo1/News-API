package models;

import java.util.Objects;

public abstract class News {
    public String title;
    public String content;
    public int department_id;
    public String posted_by;
    public String type;
    public int id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getPosted_by() {
        return posted_by;
    }

    public void setPosted_by(String posted_by) {
        this.posted_by = posted_by;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        News news = (News) o;
        return department_id == news.department_id &&
                id == news.id &&
                Objects.equals(title, news.title) &&
                Objects.equals(content, news.content) &&
                Objects.equals(posted_by, news.posted_by) &&
                Objects.equals(type, news.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, content, department_id, posted_by, type, id);
    }
}
