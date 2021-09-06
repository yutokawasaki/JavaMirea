package practice1;

import java.lang.*;

public class Book {
    private String author;
    private String name;

    public Book(String a, String n) {
        author = a;
        name = n;
    }

    public Book(String a) {
        author = a;
        name = "not specified";
    }

    public Book() {
        author = "not specified";
        name = "not specified";
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "This book is called " + this.name + ", it was written by " + this.author;
    }
}