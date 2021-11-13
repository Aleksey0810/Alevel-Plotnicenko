package com.plotnichenko.hw6;

public enum Manufacturer {
    BMW ("БМВ"), LANOS("Ланос");

    private final String russianName;

    Manufacturer (String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }
}

