package com.plotnichenko.hw10;

public abstract class Car {
    final String series;
    final int year;
    final int fuelConsumption = 10;
    String color;
    int fuel;
    int moveCount = 0;
    boolean isNotEmptyGas = true;

    public Car(String series, int year, String color) {
        this.series = series;
        this.year = year;
        this.color = color;
        this.fuel = 100;
    }

    public void addFuel(int fuel) {
        this.fuel += fuel;
        isNotEmptyGas = this.fuel >= fuelConsumption;
    }

    public void move() {
        if (isNotEmptyGas) {
            addFuel( - fuelConsumption);
            ++moveCount;
            System.out.println("Можно ехать");
        }
        else {
            System.out.println("заправить машину");
        }
    }

    public abstract void showStatistic();
}
