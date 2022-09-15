package org.example.lesson3.task8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Введите кол-во слов:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            list.add(scanner.next());
        }
        Collections.reverse(list);
        list.stream().forEach(s -> System.out.println(s));
    }
}
