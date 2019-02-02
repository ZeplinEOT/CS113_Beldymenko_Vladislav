package edu.miracosta.cs113.hw1.lab2;

public class PowerVerifier {

    public static void main(String[] args) {


    }
    public static boolean powerOfTwo(int userInput) {

        boolean accepted = true;
        boolean denied = false;

        if (userInput == 1) {

            return true;
        }
        else if (userInput % 2 != 0) {

            userInput = userInput / 2;
        }
        else {

            for (int power = 0; power <= userInput; ++power) {

                if (Math.pow(2, power) == userInput)

                    return accepted;
            }
        }
        return denied;
    }

    public static boolean naturalNumber(String userInput) {

        try {

            int naturalNumber = Integer.parseInt(userInput);
        }

        catch (NumberFormatException numberVerifier) {

            System.out.println("Input is not a valid integer");

            return false;
        }

        return true;
    }
}

