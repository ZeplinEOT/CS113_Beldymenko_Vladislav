package edu.miracosta.cs113.hw1.lab1;

/**
 * @author Zepline (Vladislav Aleksandrovich Beldymenko)
 *
 * 'FizzBuzz' is a main class of the 'lab1' assignment...
 *
 * This class calls and executes the methods 'NumbersCreator' & 'NumbersAssigner'.
 */
public class FizzBuzz extends NumbersAssigner {

    /**
     * main method executes methods from other classes and finalizes the entire program.
     *
     * @param args receives String array input.
     */
    public static void main(String[] args) {

        //print statement explains the goal of the program.
        System.out.println("\n******************************\n* Numbers 1 through 100:\n*\n* Multiples of 3 = 'Fizz' \n* Multiples of 5 = 'Buzz' \n* Multiples of 15 = 'FizzBuzz'\n******************************");

        //arrayList of integers is received and converted to Strings.
        arrayListToString();

        //method assigns "Fizz", "Buzz", and "FizzBuzz" (To the multiples of 3, 5, and 15).
        fizzBuzzAssigner(arrayListOfStrings);

        //loop traverses the arrayList and prints the Strings.
        for (String stringNumber : arrayListOfStrings) {

            System.out.println(stringNumber);
        }
    }
}
