package com.plotnichenko.hw10;

public class Main {
        public static void main(String[] args) {
            UserAction userAction = new UserAction();
            userAction.gettingTypeCar();

            Recoverable recoverable = new Recoverable() {
                @Override
                public void refuel () {
                    System.out.println("Заправка");
                }
            };
            recoverable.refuel();
        }
    }

