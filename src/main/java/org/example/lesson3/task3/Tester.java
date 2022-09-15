package org.example.lesson3.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester {
    private static int n;
    private static List<Circle> circleList;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество кругов:");
        n = scanner.nextInt();
        circleList = new ArrayList<>();
        for (int i = 0; i < n; i++){
            System.out.println("Введите через пробел координаты центра и радиус для " + (i + 1) + "-го круга");
            circleList.add(new Circle(new Point(scanner.nextDouble(), scanner.nextDouble()), scanner.nextDouble()));
        }

        System.out.println("Итоговый список: ");
        for (int i = 0; i < n; i++){
            System.out.println(circleList.get(i));
        }
    }
}
