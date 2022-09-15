package org.example.lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SecondTask {
    public static void printArray(List<Integer> list){
        System.out.println("Исходный массив: ");
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("Кол-во элементов: " + list.size());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>(n);

        for (int i = 0; i < n; i++){
            list.add(new Random().nextInt(0, 101) % 100);
        }

        printArray(list);

        System.out.println("Введите число, которое необходимо удалить: ");
        int numToRemove = scanner.nextInt();

        list.removeIf(t -> t.equals(numToRemove));

        printArray(list);

        System.out.println("Введите число: ");
        int m = scanner.nextInt();
        list.removeIf(t -> t % 10 == m);

        printArray(list);

    }
}
