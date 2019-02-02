package edu.miracosta.cs113.hw1.lab1;

import java.util.ArrayList;

public class NumbersAssigner extends NumbersCreator {

    final static public ArrayList<String> arrayListOfStrings = new ArrayList<>();

    public static void main(String[] args) {

        arrayListToString();
        fizzBuzzAssigner(arrayListOfStrings);
    }

    public static ArrayList<String> arrayListToString() {

        getIntegerArrayList();

        for (Integer integerOfArrayList : oneHundredDigits) {

            arrayListOfStrings.add(String.valueOf(integerOfArrayList));
        }

        return(arrayListOfStrings);
    }

    public static ArrayList<String> fizzBuzzAssigner(final ArrayList<String> arrayListOfStrings) {

        for (int index = 0; index < arrayListOfStrings.size(); ++index) {

            arrayListOfStrings.get(index);

            if (index != 0) {

                if (index % 15 == 0) {

                    arrayListOfStrings.set(index, "FizzBuzz");
                }
                else if (index % 3 == 0) {

                    arrayListOfStrings.set(index, "Fizz");
                }
                else if (index % 5 == 0) {

                    arrayListOfStrings.set(index, "Buzz");
                }
                else {

                    index = index;
                }

            }
        }

        arrayListOfStrings.remove(0);

        return(arrayListOfStrings);
    }
}
