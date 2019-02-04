package edu.miracosta.cs113.hw1.lab2;

import java.util.Scanner;

/**
 * @author Zepline (Vladislav Aleksandrovich Beldymenko)
 *
 * 'PowerOfAll' is a main class of the 'lab2' assignment...
 *
 * This class extends and executes the method 'PowerVerifier'.
 *
 * The goal is to tell the user whether their number input is a power of two.
 */
public class PowerOfAll extends PowerVerifier {

    public static void main(String[] args) {

        //explanation comment for the user.
        System.out.println("\nThis algorithm will verify if a 'natural number' is a power of two.");
        System.out.println("*******************************************************************\n\n");

        //scanner creation.
        Scanner powerReader = new Scanner(System.in);

        //user is asked for number input.
        System.out.println("Please enter a 'natural number': ");

        //input read.
        int userInput = powerReader.nextInt();

        //if and else statements verify input and print the appropriate output.
        if (userInput == 1) {

            System.out.println("\n|Verified|: Every number to the power of ZERO is equal to ONE.");
        }
        else if (userInput == 0) {

            System.out.println("\n" + userInput + " is not a natural number.");
        }
        else if (powerOfTwo(userInput)) {

            System.out.println("\n|Verified|: " + userInput + " is a power of two.");
        }
        else {

            System.out.println("\n|Verified|: " + userInput + " is NOT a power of two.");
        }

        //scanner is closed.
        powerReader.close();
    }
}
