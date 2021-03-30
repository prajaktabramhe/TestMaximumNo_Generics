package com.bridgelabz.findmaximumtest;

public class FindMax
{
    public static void main(String[] args)
    {
        System.out.println("***** Welcome to arithmetic number computation ****");
    }


    //for Integer, Float, String
    public  <T extends Comparable<T>> T findMaxValue(T firstNumber, T secondNumber, T thirdNumber)

    {
        T max = firstNumber;
        if (secondNumber.compareTo(max) > 0) {
            max = secondNumber;
        }
        if (thirdNumber.compareTo(max) > 0) {
            max = thirdNumber;
        }
        printMax(max);
        return max;
    }

    public <T> void printMax(T max)
    {
        System.out.println("Maximum number is  = " + max);
    }


}
