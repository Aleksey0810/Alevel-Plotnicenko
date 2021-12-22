package com.plotnichenko.hw9;

import com.plotnichenko.hw3.task2.Calculator;
import com.plotnichenko.hw3.task2.UserInput;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class CalculatorTest {
    private UserInput userInputMock;
    private Calculator calculator = new Calculator();

    @Before
    public void setUp() {
        userInputMock = Mockito.mock(UserInput.class);
    }
    @Test
    public void getResSum() {
        Mockito.when(userInputMock.getSymbol()).thenReturn('+');
        Mockito.when(userInputMock.getNum1()).thenReturn(6);
        Mockito.when(userInputMock.getNum2()).thenReturn(8);
        int act = calculator.getResult(userInputMock);
        int expected = 10;
        assertEquals(expected,act);
    }
    @Test
    public void getResMin() {
        Mockito.when(userInputMock.getSymbol()).thenReturn('-');
        Mockito.when(userInputMock.getNum1()).thenReturn(5);
        Mockito.when(userInputMock.getNum2()).thenReturn(3);
        int act = calculator.getResult(userInputMock);
        int expected = 2;
        assertEquals(expected,act);
    }
    @Test
    public void getResMultiply() {
        Mockito.when(userInputMock.getSymbol()).thenReturn('*');
        Mockito.when(userInputMock.getNum1()).thenReturn(2);
        Mockito.when(userInputMock.getNum2()).thenReturn(2);
        int act = calculator.getResult(userInputMock);
        int expected = 4;
        assertEquals(expected,act);
    }
    @Test
    public void getResDiv() {
        Mockito.when(userInputMock.getSymbol()).thenReturn('/');
        Mockito.when(userInputMock.getNum1()).thenReturn(2);
        Mockito.when(userInputMock.getNum2()).thenReturn(0);
        int act = calculator.getResult(userInputMock);
        int expected = -53;
        assertEquals(expected,act);
    }
}