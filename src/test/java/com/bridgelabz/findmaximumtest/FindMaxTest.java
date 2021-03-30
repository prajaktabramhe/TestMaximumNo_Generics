package com.bridgelabz.findmaximumtest;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;


public class FindMaxTest
{
    FindMax findMax = new FindMax();


    @Test
    public void givenFirstNumberAsLarge_ShouldReturn_FirstNumberAsMax()
    {
        Integer max = findMax.findMaxValue(300, 25, 105);
        Assertions.assertEquals((Integer) 300, max);
    }

    @Test
    public void givenSecondNumberAsMaximum_ShouldReturn_SecondNumberAsMaximum()
    {
        Integer max = findMax.findMaxValue(20, 500, 104);
        Assertions.assertEquals((Integer) 500, max);
    }

    @Test
    public void givenThirdNumberAsMaximum_ShouldReturnThirdNumberAsMaximum()
    {
        Integer max = findMax.findMaxValue(10,20,100);
        Assertions.assertEquals((Integer) 100,max);
    }
}

