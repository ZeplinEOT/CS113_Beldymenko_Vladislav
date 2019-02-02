package edu.miracosta.cs113.hw1.lab2;

import java.util.Scanner;

public class Main extends PowerVerifier{

    public static void main(String[] args) {

        System.out.println("\nThis algorithm will verify if a 'natural number' is a power of two.");
        System.out.println("*******************************************************************\n\n");

        Scanner powerReader = new Scanner(System.in);

        System.out.println("Please enter a 'natural number': ");

        int userInput = powerReader.nextInt();

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

        powerReader.close();
    }
}
