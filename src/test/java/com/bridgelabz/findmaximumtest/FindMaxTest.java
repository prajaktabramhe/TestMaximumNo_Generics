package com.bridgelabz.findmaximumtest;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;


public class FindMaxTest
{
    FindMax findMax = new FindMax();


    @Test
    public void givenFirstNumberAsLarge_ShouldReturn_FirstNumberAsMax() {
        Integer max = findMax.findMaxValue(200, 25, 105);
        Assertions.assertEquals((Integer) 200, max);
    }

    @Test
    public void givenSecondNumberAsMaximum_ShouldReturn_SecondNumberAsMaximum() {
        Integer max = findMax.findMaxValue(20, 400, 104);
        Assertions.assertEquals((Integer) 400, max);
    }

    @Test
    public void givenThirdNumberAsMaximum_ShouldReturnThirdNumberAsMaximum() {
        Integer max = findMax.findMaxValue(10,20,90);
        Assertions.assertEquals((Integer) 90,max);
    }
}

