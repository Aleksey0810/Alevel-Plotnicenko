package com.plotnichenko.modul1.lock;

    import java.util.*;

    public class Main {
        public static void main(String[] args) {
            Lock1 lock = new Lock1(new int[]{1, 2, 3, 4});

            System.out.println(Arrays.toString(lock.getArray()));
            for (int i = 2; i < lock.getArray().length; i += 3) {
                lock.getArray()[i] = (int) Math.pow(lock.getArray()[i], 3);
            }
            System.out.println(Arrays.toString(lock.getArray()));
        }
    }
