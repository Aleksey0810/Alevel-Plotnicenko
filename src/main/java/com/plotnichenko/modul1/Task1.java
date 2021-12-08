package com.plotnichenko.modul1;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int temp;
        do {
            System.out.println("Введите число >= 10");
            MyArray array = new MyArray();
            temp = array.getInput();
            if (array.getInput() >= 10) {
                System.out.println(Arrays.toString(array.getArr()));
                array.sortArray();
                array.cube();
            } else {
                System.out.println("Ошибка!!!, повторить снова");
            }
        } while (temp < 10);
    }
}

