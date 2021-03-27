package com.bridgelabz.findmaximumtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMax<E extends Comparable<E>>
{
    //Array of Generic values
    E[] values;
    //List of Generic Values
    List<E> listValues = new ArrayList<>();

    //Constructor to Initialize Generic Array
    public FindMax(E[] values) {
        this.values = values;
    }

    //Constructor to Initialize Generic List
    public FindMax(List<E> listValues) {
        this.listValues = listValues;
    }

    //Method to Find  Max Value From List
    public E findMax() {
        return Collections.max(listValues);
    }

    //Method to Find Max Value Form Array
    public E findMaxValue() {
        if (values[0].compareTo(values[1]) > 0 && values[0].compareTo(values[2]) > 0) {
            return values[0];
        } else if (values[1].compareTo(values[0]) > 0 && values[1].compareTo(values[2]) > 0) {
            return values[1];
        } else {
            return values[2];
        }
    }
}
