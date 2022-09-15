package org.example.lesson2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ThirdTask {
    static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static void from10ToAny(double n, int base){
        int intPart = (int) (n);
        double fracPart = n - (int)n;
        var newIntPart = new ArrayList<Integer>();
        var newFracPart = new ArrayList<Integer>();
        while(intPart != 0) {
            newIntPart.add(intPart % base);
            intPart /= base;
        }
        Collections.reverse(newIntPart);
        for(Integer i : newIntPart) {
            if (i >= 10) System.out.print(alphabet.charAt(i - 10));
            else System.out.print(i);
        }
        System.out.print(",");
        for(int i = 0; i < 3; i++) {
            newFracPart.add((int)(fracPart * base));
            fracPart = (fracPart * base) - (int)(fracPart * base);
        }
        for(Integer i : newFracPart) {
            if (i >= 10) System.out.print(alphabet.charAt(i - 10));
            else System.out.print(i);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        int base = scanner.nextInt();
        from10ToAny(n, base);
        from10ToAny(n, 2);
        from10ToAny(n, 16);

    }
}

