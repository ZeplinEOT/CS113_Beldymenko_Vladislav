package edu.miracosta.cs113.hw1.lab1;

public class Main extends NumbersAssigner {

    public static void main(String[] args) {

        System.out.println("\n******************************\n* Numbers 1 through 100:\n*\n* Multiples of 3 = 'Fizz' \n* Multiples of 5 = 'Buzz' \n* Multiples of 15 = 'FizzBuzz'\n******************************");

        arrayListToString();
        fizzBuzzAssigner(arrayListOfStrings);

        for (String stringNumber : arrayListOfStrings) {

            System.out.println(stringNumber);
        }
    }
}
