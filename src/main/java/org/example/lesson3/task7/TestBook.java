package org.example.lesson3.task7;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("Пушкин", "Евгений Онегин", 1833);
        System.out.println(book.getAuthor());
        System.out.println(book.getName());
        System.out.println(book.getYear());
        book.setName("Война и мир");
        book.setAuthor("Толстой");
        book.setYear(1865);
        System.out.println(book);
    }
}
