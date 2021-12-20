package com.plotnichenko.hw11;

import java.util.Scanner;

public class RotaryPhone extends Phone {
    public RotaryPhone(Colour colour, Years years) {
        super(colour, years);
    }

    @Override
    public String call() {
        System.out.println( "Dial the number" );
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    @Override
    public String sms() {
        return "no sms";
    }

    @Override
    public void menu() {
        System.out.println("Numbers from 0 to 9");
    }

    @Override
    public void app() {
    }
}
