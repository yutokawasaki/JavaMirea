package Lab2;

import java.lang.*;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("Пушкин А. С", "Капитанская дочка");
        Book book2 = new Book();
        Book book3 = new Book("Тургенев И. С");
        book3.setName("Отцы и дети");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}