package edu.miracosta.cs113.hw1.lab1;

import java.util.ArrayList;

/**
 * @author Zepline (Vladislav Aleksandrovich Beldymenko)
 *
 * 'NumbersAssigner' receives and traverses an arrayList of integers for multiples,
 * and assigns the proper Strings to those multiples.
 *
 * Executes methods from 'NumbersCreator'.
 */
public class NumbersAssigner extends NumbersCreator {

    //arrayList will contain integers as Strings.
    final static public ArrayList<String> arrayListOfStrings = new ArrayList<>();

    /**
     * Executes two methods:
     *
     * String converter method (arrayListToString) and assigner method (fizzBuzzAssigner).
     *
     * @param args receives String array input.
     */
    public static void main(String[] args) {

        arrayListToString();
        fizzBuzzAssigner(arrayListOfStrings);
    }

    /**
     * Method calls Integer arrayList from 'NumbersCreator' class and converts the values into strings.
     *
     * It then adds those values into a String arrayList.
     *
     * @return returns updated arrayList of strings 1 to 100.
     */
    public static ArrayList<String> arrayListToString() {

        //get method retrieves arrayList from 'NumbersCreator' class.
        getIntegerArrayList();

        //loop converts integers to strings and adds them to a String arrayList.
        for (Integer integerOfArrayList : oneHundredDigits) {

            arrayListOfStrings.add(String.valueOf(integerOfArrayList));
        }

        //String arrayList is returned.
        return(arrayListOfStrings);
    }

    /**
     * Method searches arrayList for multiples of 3, 5, and 15 (3 and 5).
     *
     * It then assigns "Fizz", "Buzz", and "FizzBuzz" to those multiples. (Replaces with these strings)
     *
     * @param arrayListOfStrings receives an arrayList of strings input.
     * @return updated arrayList of strings is returned.
     */
    public static ArrayList<String> fizzBuzzAssigner(final ArrayList<String> arrayListOfStrings) {

        //loop goes through the entire arrayList.
        for (int index = 0; index < arrayListOfStrings.size(); ++index) {

            //each index is retrieved.
            arrayListOfStrings.get(index);

            //if statements verify if index is a zero or multiple of certain numbers.
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

        //the zero index is removed to bypass a solution error.
        arrayListOfStrings.remove(0);

        //updated arrayList is returned.
        return(arrayListOfStrings);
    }
}
