package com.plotnichenko.hw12;

import java.io.IOException;

public class Task2 {
    public static void main(String[] args) throws Exception {
        try {
            g();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void f() throws Exception {
        try {
            g();
        } catch (IOException e) {
            throw new Exception("f() method exc");
        }
    }

    public static void g() throws IOException {
        throw new IOException("g() method exc");
    }
}
