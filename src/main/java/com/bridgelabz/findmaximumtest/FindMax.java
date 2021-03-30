package com.bridgelabz.findmaximumtest;

public class FindMax {
    public static void main(String[] args)
    {
        System.out.println("***** Welcome to arithmetic number computation ****");
    }

    public <T extends Integer> Integer findMaxValueInteger(T firstNumber, T secondNumber, T thirdNumber)
    {
        Integer max = firstNumber;
        if (secondNumber.compareTo(max) > 0) {
            max = secondNumber;
        }
        if (thirdNumber.compareTo(max) > 0) {
            max = thirdNumber;
        }
        printMax(max);
        return max;
    }
    public <T extends Float> Float findMaxValueFloat(T firstNumber, T secondNumber, T thirdNumber)
    {
        Float max = firstNumber;
        if (secondNumber.compareTo(max) > 0) {
            max = secondNumber;
        }
        if (thirdNumber.compareTo(max) > 0) {
            max = thirdNumber;
        }
        printMax(max);
        return max;
    }
   public <T extends Integer> void printMax(T max)
    {
        System.out.println("Maximum number is  = " + max);
    }
    public <T extends  Float> void printMax(T max)
    {
        System.out.println("Maximum from float = " + max);
    }
}
