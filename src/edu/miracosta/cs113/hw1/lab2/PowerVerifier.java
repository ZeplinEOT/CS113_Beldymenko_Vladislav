package edu.miracosta.cs113.hw1.lab2;

public class PowerVerifier {

    /**
     * @author Zepline (Vladislav Aleksandrovich Beldymenko)
     *
     * 'PowerOfTwo' is a subclass to powerVerifier...
     *
     * Its only goal is to verify whether an input is a power of two.
     */
    public static boolean powerOfTwo(int userInput) {

        //true & false booleans created.
        boolean accepted = true;
        boolean denied = false;

        //input is verified by if and else statements.
        if (userInput == 1) {

            return true;
        }
        else if (userInput % 2 != 0) {

            userInput = userInput / 2;
        }
        else {

            //power finder formula.
            for (int power = 0; power <= userInput; ++power) {

                if (Math.pow(2, power) == userInput)

                    //if input is a power of two, true is returned.
                    return accepted;
            }
        }

        //false is returned if input is not a power of two.
        return denied;
    }
}

