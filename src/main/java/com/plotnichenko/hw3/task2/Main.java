package com.plotnichenko.hw3.task2;

public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        Calculator calculator = new Calculator();
        System.out.println(calculator.getResult(userInput));
    }
}
