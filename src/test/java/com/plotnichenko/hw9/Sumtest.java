package com.plotnichenko.hw9;

import com.plotnichenko.hw3.task1.Sum;
import com.plotnichenko.hw3.task1.UserInput;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class Sumtest {private UserInput userInputMock;
    Sum sum = new Sum();

    @Before
    public void setUp() {
        userInputMock = Mockito.mock(UserInput.class);
    }

    @Test
    public void sumPos() {
        Mockito.when(userInputMock.getNumber()).thenReturn(179);
        int actual = sum.retSum(userInputMock);
        int expected = 17;
        assertEquals(expected, actual);
    }
    @Test
    public void sumNeg() {
        Mockito.when(userInputMock.getNumber()).thenReturn(-3);
        int actual = sum.retSum(userInputMock);
        int expected = -7;
        assertEquals(expected, actual);
    }
}

