package practice2;

import java.lang.*;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Пушкин А. С.", "pushkin@mirea.ru",'M');
        System.out.println(author);
        author.setEmail("pushkin@ranepa.ru");
        System.out.println(author.getEmail());
    }
}
