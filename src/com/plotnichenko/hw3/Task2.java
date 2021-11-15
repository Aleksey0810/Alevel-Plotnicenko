package com.plotnichenko.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        char mean;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter operator (+, -, *, /): ");
            char operation = scanner.next().charAt(0);
            mean = operation;
            if (operation != '0') {
                System.out.println("Enter first number: ");
                double x = scanner.nextDouble();
                System.out.println("Enter second number: ");
                double y = scanner.nextDouble();
                switch (operation) {
                    case '+':
                        System.out.println(x + y);
                        break;
                    case '-':
                        System.out.println(x - y);
                        break;
                    case '/':
                        if (y != 0) {
                            System.out.println(x / y);
                        } else {
                            System.out.println("Error! Wrong symbol");
                        }
                        break;
                    case '*':
                        System.out.println(x * y);
                        break;
                }
            } else {
                System.out.println(" Calculation finished ");
            }
        } while (mean != '0') ;
    }
}
