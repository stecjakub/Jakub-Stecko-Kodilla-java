package com.kodilla.kodillahibernate.tasklist;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class TaskList {
    private int id;
    private String listName;
    private String description;

    public TaskList() {
    }

    public TaskList(String description, String listName) {
        this.listName = listName;
        this.description = description;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }
    @Column
    public String getListName() {
        return listName;
    }
    @Column
    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
