package com.bridgelabz.findmaximumtest;

import java.util.Arrays;

public class FindMax
{
    public static void main(String[] args) {
        System.out.println("***** Welcome to arithmetic number computation ****");
    }


    public <T extends Comparable<T>> T findMaxValue(T[] inputArray )
    {
        int size = inputArray.length;
        Arrays.sort(inputArray);
        printMax(inputArray[size-1]);
        return inputArray[size-1];
    }

    public <T> void printMax(T max) {
        System.out.println("Maximum number is  = " + max);
    }
}
