package com.plotnichenko.hw1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Alex Plotnichenko");
        String str = "Alex";
        int count = 0;
        for (int j = 0; j < str.length(); j++) {
            count ++;
        }
        System.out.println (str + count);
        if (count > 7) {
            System.out.println( "more than 7");
        } else if (count < 7) {
            System.out.println("less than 7");
        }

    }

}
class Task2 {
    public static void main(String[] args) {
        int i = 0;
        int j = 5;
        do {
            System.out.println(" step " + i + " mean " + j );
            i++;
            j+=2;
        } while ( i < 11);

    }
}
