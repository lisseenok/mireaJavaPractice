package org.example.lesson1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        generate();
    }

    // массив целых чисел вывести отсортировать вывести 10 элеметнов 1. Random 2. Math.random
    public static void generate(){
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            list.add(random.nextInt(10));
        }
        System.out.println("Исходный массив:");
        for (int i = 0; i < 10; i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n");
        Collections.sort(list);
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < 10; i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n");

        int a = 0;
        int b = 10;

        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            list1.add(a + (int) (Math.random() * b));
        }
        System.out.println("Исходный массив:");
        for (int i = 0; i < 10; i++){
            System.out.print(list1.get(i) + " ");
        }
        System.out.println("\n");
        Collections.sort(list1);
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < 10; i++){
            System.out.print(list1.get(i) + " ");
        }
    }

    public static void harmonic(){
        double sum = 0;
        for (int i = 1; i <= 10; i++){
            double n = 1.0 / i;
            System.out.print(i + "-ый член гармонического ряда: ");
            System.out.printf("%.2f \n", n);
            sum += n;
        }
        System.out.println("\nСумма первых 10 членов гармонического ряда: " + sum);
    }

    private static void listSum() {
        var scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Введите размер массива: ");
        int n = scanner.nextInt();
        System.out.println("Введите значения элементов массива: ");
        for (int i = 0; i < n; i++){
            list.add(scanner.nextInt());
        }

        // сумма с for
        int sum1 = 0;
        for (int i = 0; i < n; i++){
            sum1 += list.get(i);
        }
        System.out.println("Сумма с циклом for: " + sum1);

        // сумма с while
        int j = 0;
        int sum2 = 0;
        while (j < list.size()){
            sum2 += list.get(j);
            j++;
        }
        System.out.println("Сумма с циклом while: " + sum2);

        // сумма с do while
        int k = 0;
        int sum3 = 0;
        do {
            sum3 += list.get(k);
            k++;
        } while (k < list.size());
        System.out.println("Сумма с циклом do while: " + sum3);
    }
}
