package com.bridgelabz.findmaximumtest;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;


public class FindMaxTest
{
    FindMax findMax = new FindMax();

 //for Integer Number
    @Test
    public void givenFirstNumberAsLarge_ShouldReturn_FirstNumberAsMax() {
        Integer max = findMax.findMaxValue(300, 25, 105);
        Assertions.assertEquals((Integer) 300, max);
    }

    @Test
    public void givenSecondNumberAsMaximum_ShouldReturn_SecondNumberAsMaximum() {
        Integer max = findMax.findMaxValue(20, 500, 104);
        Assertions.assertEquals((Integer) 500, max);
    }

    @Test
    public void givenThirdNumberAsMaximum_ShouldReturnThirdNumberAsMaximum() {
        Integer max = findMax.findMaxValue(10,20,100);
        Assertions.assertEquals((Integer) 100,max);
    }

    //for Float Number
    @Test
    public void givenFirstFloatAsMaximum_ShouldReturnFirstFloatAsMaximum() {
        Float max1 = findMax.findMaxValue(20f, 15f, 10f);
        Assertions.assertEquals((Float) 20f, max1);
    }

    @Test
    public void givenSecondFloatAsMaximum_ShouldReturnSecondFloatAsMaximum() {
        Float max1 = findMax.findMaxValue(22f, 30f, 10f);
        Assertions.assertEquals((Float) 30f, max1);
    }

    @Test
    public void givenThirdFloatAsMaximum_ShouldReturnThirdFloatAsMaximum() {
        Float max1 = findMax.findMaxValue(20f, 30f, 40f);
        Assertions.assertEquals((Float) 40f, max1);
    }
}

