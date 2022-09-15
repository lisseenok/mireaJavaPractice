package org.example.lesson3.task2;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты через пробел:");
        Ball ball = new Ball(scanner.nextDouble(), scanner.nextDouble());
        System.out.println(ball);
        System.out.println("Введите новый х");
        ball.setX(scanner.nextDouble());
        System.out.println(ball.getX());
        System.out.println("Введите новый у");
        ball.setY(scanner.nextDouble());
        System.out.println(ball.getY());
        System.out.println("введите новые х и у через пробел");
        ball.setXY(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Введите сдвги через пробел");
        ball.move(scanner.nextDouble(), scanner.nextDouble());
        System.out.println(ball);
    }
}
