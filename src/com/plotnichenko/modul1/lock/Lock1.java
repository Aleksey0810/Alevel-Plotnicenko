package com.plotnichenko.modul1.lock;

public class Lock1 {
    private int[] array;

    public Lock1(int[] array) {
        this.array = array.clone();
    }

    public int[] getArray() {
        return array == null ? null : array.clone();
    }
}
