package com.plotnichenko.hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");

        int input = 0;

        while (input <= 3) {
            if(sc.hasNextInt()){
                input = sc.nextInt();
                if(input <= 3){
                    System.out.println("Введенное число должно быть больше 3. Повторите ввод:");
                }
            } else {
                System.out.println("Вы ввели не число. Повторите ввод:");
                sc.next();
            }
        }
        int [] mas1 = new int[input];
        int evenNums = 0;

        for (int i = 0; i < input; i++) {
            mas1[i] = (int)(Math.random()*(input+1));
            if(mas1[i]%2 == 0){
                evenNums++;
            }
        }

        System.out.println(Arrays.toString(mas1));
        int [] mas2 = new int[evenNums];
        int index = 0;
        for (int i = 0; i < input; i++) {
            if(mas1[i]%2 == 0){
                mas2[index] = mas1[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(mas2));
    }
}
