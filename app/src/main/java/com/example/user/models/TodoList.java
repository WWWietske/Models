package com.example.user.models;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Wietske Dotinga - 10781889
 * Object for to do list information.
 */
public class TodoList implements Serializable{

    // fields
    private String title;
    private ArrayList<TodoItem> todoList; //van de todoitems

    // constructor
    private TodoList(String titleArg){
        title = titleArg;
        todoList = new ArrayList<TodoItem>();
    }

    // methods
    public String getTitle(){
        return title;
    }

    public ArrayList getTodoList(){
        return todoList;
    }

    public newTodo(TodoItem item){
        todoList.add(item);
    }

    public deleteTodo(TodoItem item){
        todoList.remove(item);
    }
}
