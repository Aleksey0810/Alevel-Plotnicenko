package com.plotnichenko.hw15.task3;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("Level");
        strings.add("School");
        System.out.println(Words.stringIntegerMap(strings));
    }
}
