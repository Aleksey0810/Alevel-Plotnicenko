package com.plotnichenko.hw2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x =  10, y = 20, z = 30;
        double p = (x + y + z)/ 2.0;
        double s = Math.sqrt(p*(p-x)*(p-y)*(p-z));
        System.out.println("S - " + s );
    }
}
class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt();
        System.out.println("Mean 1 = " + a);
        int c = random.nextInt();
        System.out.println("Mean 2 = " + c);
        int j = random.nextInt();
        System.out.println("Mean 3 = " + j);
        if (a < c && a < j) {
            System.out.println("Smallest = " + a);
        } else if (c < j && c < a) {
            System.out.println("Smallest = " + c);
        } else {
            System.out.println("Smallest = " + c);
        }
    }
}

class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt();
        System.out.println("Generated number = " + a);
        if (a % 2 == 0 )
            System.out.println(a + " = is even");
        else
            System.out.println(a + " = is uneven");
    }
}

class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number;
        number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Enter positive number");
        } else {
            System.out.print("Binary = " + Integer.toBinaryString(number));
        }
    }
}
