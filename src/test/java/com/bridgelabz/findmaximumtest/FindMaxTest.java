package com.bridgelabz.findmaximumtest;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class FindMaxTest
{

    /* Test Cases For Integer Array */
    @Test
    public void givenFirstIntegerNumberAsLarge_ShouldReturn_FirstNumberAsMax() {
        Integer[] integerValues = {200, 15, 100};
        Integer max = new FindMax<>(integerValues).findMaxValue();
        Assertions.assertEquals((Integer) 200, max);
    }

    @Test
    public void givenSecondIntegerNumberAsLarge_ShouldReturn_SecondNumberAsMax() {
        Integer[] integerValues = {20, 150, 100};
        Integer max = new FindMax<>(integerValues).findMaxValue();
        Assertions.assertEquals((Integer) 150, max);
    }

    @Test
    public void givenThirdIntegerNumberAsLarge_ShouldReturn_ThirdNumberAsMax() {
        Integer[] integerValues = {200, 15, 1000};
        Integer max = new FindMax<>(integerValues).findMaxValue();
        Assertions.assertEquals((Integer) 1000, max);
    }

    /* Test Cases For Float Array */
    @Test
    public void givenFirstFloatNumberAsLarge_ShouldReturn_FirstNumberAsMax() {
        Float[] floatValues = {200f, 15f, 100f};
        Float max = new FindMax<>(floatValues).findMaxValue();
        Assertions.assertEquals((Float) 200f, max);
    }

    @Test
    public void givenSecondFloatNumberAsLarge_ShouldReturn_SecondNumberAsMax() {
        Float[] floatValues = {20f, 150f, 100f};
        Float max = new FindMax<>(floatValues).findMaxValue();
        Assertions.assertEquals((Float) 150f, max);
    }

    @Test
    public void givenThirdFloatNumberAsLarge_ShouldReturn_ThirdNumberAsMax() {
        Float[] floatValues = {200F, 15F, 1000F};
        Float max = new FindMax<>(floatValues).findMaxValue();
        Assertions.assertEquals((Float) 1000f, max);
    }

    /* Test Cases For String Array */
    @Test
    public void givenFirstStringAsLarge_ShouldReturn_FirstStringAsMax() {
        String[] stringValues = new String[]{"Morning", "Hello", "GM"};
        String max = new FindMax<>(stringValues).findMaxValue();
        Assertions.assertEquals("Morning", max);
    }

    @Test
    public void givenSecondStringAsLarge_ShouldReturn_SecondStringAsMax() {
        String[] stringValues = {"Good", "Morning", "All"};
        String max = new FindMax<>(stringValues).findMaxValue();
        Assertions.assertEquals("Morning", max);
    }

    @Test
    public void givenThirdStringAsLarge_ShouldReturn_ThirdStringAsMax() {
        String[] stringValues = {"All", "Good", "Morning"};
        String max = new FindMax<>(stringValues).findMaxValue();
        Assertions.assertEquals("Morning", max);
    }

    /* Test Cases For Integer List */
    @Test
    public void givenListOfIntegers_ShouldReturn_MaxValue() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(50);
        integerList.add(60);
        integerList.add(20);
        integerList.add(80);
        Object max = new FindMax<>(integerList).findMax();
        Assertions.assertEquals(80, max);
    }

    /* Test Cases For Float List */
    @Test
    public void givenListOfFloats_ShouldReturn_MaxValue() {
        List<Float> floatList = new ArrayList<>();
        floatList.add(50f);
        floatList.add(60f);
        floatList.add(20f);
        floatList.add(80f);
        Object max = new FindMax<>(floatList).findMax();
        Assertions.assertEquals(80f, max);
    }

    /* Test Cases For String List */
    @Test
    public void givenListOfStrings_ShouldReturn_MaxValue() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Good");
        stringList.add("Morning");
        stringList.add("All");
        stringList.add("To");
        Object max = new FindMax<>(stringList).findMax();
        Assertions.assertEquals("To", max);
    }
}

