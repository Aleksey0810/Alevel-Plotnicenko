package com.plotnichenko.hw11;

import java.util.Scanner;

class CellularPhone extends Phone {
    protected Scanner scanner = new Scanner(System.in);

    public CellularPhone(Colour colour, Years years) {
        super(colour, years);
    }

    @Override
    public String call() {
        System.out.println("Dial the number to call");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    @Override
    public String sms() {
        return null;
    }

    @Override
    public void menu() {
        System.out.println("Select menu item 1 - sms, 2 - call");
        int b = scanner.nextInt();
        switch (b) {
            case (1) -> call();
            case (2) -> System.out.println(sms());
            default -> System.out.println("You have entered an invalid character");
        }
    }

    public void calculator() {
        int a = 2;
        int b = 3;
        System.out.println(a + b);
    }

    @Override
    public void app() {
        System.out.println("Run App");
    }
}
