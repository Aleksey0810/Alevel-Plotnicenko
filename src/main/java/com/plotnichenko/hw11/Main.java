package com.plotnichenko.hw11;

public class Main {
    public static void main(String[] args) {

        RotaryPhone rotaryPhone = new RotaryPhone(Colour.RED, Years.Y2000);
        CellularPhone cellularPhone = new CellularPhone(Colour.WHITE, Years.Y2010);
        Smartphone smartphone = new Smartphone(Colour.YELLOW, Years.Y2020);
        Service service = new Service();
        service.testPhone(rotaryPhone);
        service.testPhone(cellularPhone);
        service.testPhone(smartphone);

        int smart = smartphone.hashCode();
        int cell = cellularPhone.hashCode();
        if (smart != cell) {
            System.out.println("false");
        }
        else {
            System.out.println(cellularPhone.equals(smartphone));
        }
    }
}
