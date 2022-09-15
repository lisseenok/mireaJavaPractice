package org.example.lesson3.task1;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.next();
        System.out.println("Введите почту:");
        String email = scanner.next();
        System.out.println("Введите пол м/ж: ");
        char gender = scanner.next().charAt(0);

        Author author = new Author(name, email, gender);
        System.out.println(author);

        System.out.println("Старое имя: " + author.getName());
        System.out.println("Введите новое имя: ");
        author.setName(scanner.next());
        System.out.println(author);

        System.out.println("Старая почта: " + author.getEmail());
        System.out.println("Введите новую почту: ");
        author.setEmail(scanner.next());
        System.out.println(author);

        System.out.println("Пол: " + author.getGender());

    }
}
