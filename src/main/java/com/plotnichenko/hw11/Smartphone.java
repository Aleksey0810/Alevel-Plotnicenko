package com.plotnichenko.hw11;

import java.util.Scanner;

public class Smartphone extends Phone {
    protected Scanner scanner = new Scanner(System.in);

    public Smartphone(Colour colour, Years years) {
        super(colour, years);
    }

    @Override
    public String call() {
        System.out.println("Press 1 for video call and 2 for voice call");
        int b = scanner.nextInt();
        String a = "\n" +
                "audio" + inquiry();
        String c = "video" + inquiry();
        return b == 1 ? a : c;
    }

    public String sms() {
        String a = inquiry();
        System.out.println( "Enter your message" );
        String d = scanner.nextLine() + a;
        return d;
    }

    public String inquiry() {
        System.out.println( "Enter the subscriber number or your request" );
        String a = scanner.nextLine();
        return a;
    }

    public void serfInternet() {
        String a = inquiry();
        System.out.println("Tag requests: " + a);
    }

    @Override
    public void menu() {
        System.out.println("Select menu item 1 - sms, 2 - call");
        int b = scanner.nextInt();
        switch (b) {
            case (1):
                call();
                break;
            case (2):
                System.out.println(sms());
                break;
            case (3):
                serfInternet();
                break;
            default:
                System.out.println("You have entered an invalid character");
        }
    }

    @Override
    public void app() {
        System.out.println("App running");
    }
}

