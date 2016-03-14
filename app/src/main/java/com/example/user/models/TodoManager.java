package com.example.user.models;

import android.content.Context;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Wietske Dotinga - 10781889
 * This java class manages the lists using todoitem and todolist objects.
 */
public class TodoManager{

    ArrayList<TodoList> listsArraylist;

    public void saveTodos(String fileNameArg) throws IOException {
        // Try to create and write to the file
        try {
            PrintStream out = new PrintStream(openFileOutput("lists.txt", Context.MODE_PRIVATE));

            // Write every line to the file
            for (int i = 0; i < listsArraylist.size(); i++) {
                out.println(listsArraylist.get(i));
            }
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void readTodod(String fileNameArg) throws IOException {
        // Try to open the file
        try {
            Scanner scan = new Scanner(openFileInput("lists.txt"));
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                listsArraylist.add(new TodoList(line));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
