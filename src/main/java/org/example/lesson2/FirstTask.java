package org.example.lesson2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class FirstTask
{
    public static int fibonacci(int n){
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int startNum = scanner.nextInt();
        for (int i = startNum; i < startNum + len; i++){
            System.out.println(fibonacci(i));
        }
    }
}
