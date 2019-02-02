package edu.miracosta.cs113.hw1.lab1;

import java.util.ArrayList;

/**
 * The purpose of this class is to create an array of integers from 1 to 100 (Ascending Order).
 */

public class NumbersCreator {

    static Integer MAX_INTEGERS = 100;

    public static ArrayList<Integer> oneHundredDigits = new ArrayList<>(MAX_INTEGERS);

    public static void main(String[] args) {

        numberCreation();

        System.out.println(getIntegerArrayList());
    }

    private static ArrayList<Integer> numberCreation() {

        for (int i = 0; i <= MAX_INTEGERS; i++) {

            oneHundredDigits.add(i);
        }

        return(oneHundredDigits);
    }

    public static ArrayList<Integer> getIntegerArrayList() {

        numberCreation();

        return(oneHundredDigits);
    }
}
