package org.example.todolist.Entities;

import lombok.Data;


import java.util.Date;


public class ToDo {
    private long id;
    private String toDoTitle;
    private String toDoContent;

    public ToDo() {
        this.id = System.currentTimeMillis();
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getToDoContent() {
        return toDoContent;
    }
    public void setToDoContent(String toDoContent) {
        this.toDoContent = toDoContent;
    }

    public String getToDoTitle() {
        return toDoTitle;
    }
    public void setToDoTitle(String toDoTitle) {
        this.toDoTitle = toDoTitle;
    }





    @Override
    public String toString() {
        return "ToDo{" +
                "toDoTitle='" + toDoTitle + '\'' +
                ", toDoContent='" + toDoContent + '\'' +
                '}';
    }
}

