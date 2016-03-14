package com.example.user.models;

import java.io.Serializable;

/**
 * Wietske Dotinga - 10781889
 * Object for a single to do item.
 */
public class TodoItem implements Serializable{

    // fields
    private String title;
    private boolean completed;

    // constructor
    private TodoItem(){
        title = "no title yet";
        completed = false;
    }

    // methods to return the title and completed values
    public void isCompleted(){
        completed = true;
    }

    public Boolean getCompleted(){
        return completed;
    }

    public void setString(String titleArg){
        title = titleArg;
    }

    public String getString(){
        return title;
    }
}
