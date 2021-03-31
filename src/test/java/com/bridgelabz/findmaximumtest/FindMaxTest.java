package com.bridgelabz.findmaximumtest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMaxTest
{

        FindMax findMax = new FindMax();

        //for Integer Number
      @Test
        public void givenFirstNumberAsLarge_ShouldReturn_FirstNumberAsMax()
        {
            Integer[] intArray = { 10, 2, 3, 4, 5 };
            Integer max = findMax.findMaxValue(intArray);
            findMax.printMax(max);
            Assertions.assertEquals((Integer) 10, max);
        }

        @Test
        public void givenSecondNumberAsMaximum_ShouldReturn_SecondNumberAsMaximum()
        {
            Integer[] intArray = { 20, 500, 104};
            Integer max = findMax.findMaxValue(intArray);
            findMax.printMax(max);
            Assertions.assertEquals((Integer) 500, max);
        }

        @Test
        public void givenThirdNumberAsMaximum_ShouldReturnThirdNumberAsMaximum()
        {
            Integer[] intArray = { 10,20,100};
            Integer max = findMax.findMaxValue(intArray);
            findMax.printMax(max);
            Assertions.assertEquals((Integer) 100,max);
        }


        //for Float Number
        @Test
        public void givenFirstFloatAsMaximum_ShouldReturnFirstFloatAsMaximum()
        {
            Float[] floatArray = { 4.8f, 2.2f, 3.3f, 4.4f };
            Float max1 = findMax.findMaxValue(floatArray);
            findMax.printMax(max1);
            Assertions.assertEquals((Float) 4.8f, max1);
        }

        @Test
        public void givenSecondFloatAsMaximum_ShouldReturnSecondFloatAsMaximum()
        {
            Float[] floatArray = { 1.1f, 8.6f, 3.3f, 4.4f };
            Float max1 = findMax.findMaxValue(floatArray);
            findMax.printMax(max1);
            Assertions.assertEquals((Float) 8.6f, max1);
        }

        @Test
        public void givenThirdFloatAsMaximum_ShouldReturnThirdFloatAsMaximum()
        {
            Float[] floatArray = { 1.1f, 2.2f, 6.3f, 4.4f };
            Float max1 = findMax.findMaxValue(floatArray);
            findMax.printMax(max1);
            Assertions.assertEquals((Float) 6.3f, max1);
        }



        //for string
        @Test
        public void givenFirstLetterAsMaximum_ShouldReturnFirstLetterAsMaximum()
        {
            String[] stringArray = { "zebra", "vibrate", "don" };
            String max2 = findMax.findMaxValue(stringArray);
            findMax.printMax(max2);
            Assertions.assertEquals((String) "zebra", max2);
        }

        @Test
        public void givenSecondLetterAsMaximum_ShouldReturnSecondLetterAsMaximum()
        {
            String[] stringArray = { "vibrate", "zebra", "don" };
            String max2 = findMax.findMaxValue(stringArray);
            findMax.printMax(max2);
            Assertions.assertEquals((String) "zebra", max2);
        }

        @Test
        public void givenThirdLetterAsMaximum_ShouldReturnThirdLetterAsMaximum()
        {
            String[] stringArray = { "vibrate", "zebra", "zebra" };
            String max2 = findMax.findMaxValue(stringArray);
            findMax.printMax(max2);
            Assertions.assertEquals((String) "zebra", max2);
        }
}

