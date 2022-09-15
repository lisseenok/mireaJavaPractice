package org.example.lesson3.task10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        var res = s.split(" ");
        System.out.println(res.length);
    }
}
