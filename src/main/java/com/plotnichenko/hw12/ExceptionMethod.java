package com.plotnichenko.hw12;

public class ExceptionMethod {
        public static void main(String[] args) throws Exception {
            ExceptionMethod ExceptionMethod = new ExceptionMethod();
            try { ExceptionMethod.throwAllThree();
            } catch (IllArgExc | NumbFormExc | RuntimeExc exception) {
                exception.printStackTrace();
            }
        }

        public void illArgExc() throws IllegalArgumentException {
            throw new IllArgExc();
        }

        public void numbFormExc() throws NumberFormatException {
            throw new NumbFormExc();
        }

        public void runtimeExc() throws RuntimeException {
            throw new RuntimeExc();
        }

        public void throwAllThree() {
            illArgExc();
            numbFormExc();
            runtimeExc();
        }
    }
