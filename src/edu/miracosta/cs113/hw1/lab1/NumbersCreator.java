package edu.miracosta.cs113.hw1.lab1;

import java.util.ArrayList;

/**
 * @author Zepline (Vladislav Aleksandrovich Beldymenko)
 *
 * The purpose of this class is to create an arrayList of integers from 1 to 100 (Ascending Order).
 */
public class NumbersCreator {

    //constant provides the maximum amount of values that the arrayList will have.
    private final static Integer MAX_INTEGERS = 100;

    //arrayList is established here and set to public so that it may be called by other classes.
    public static ArrayList<Integer> oneHundredDigits = new ArrayList<>(MAX_INTEGERS);

    /**
     * main executes a single method.
     *
     * @param args receives String array input.
     */
    public static void main(String[] args) {

        numberCreation();
    }

    /**
     * method adds digits from 1 to the MAX set digits to an arrayList.
     *
     * @return updated Integer arrayList.
     */
    private static ArrayList<Integer> numberCreation() {

        //loop adds digits to arrayList.
        for (int i = 0; i <= MAX_INTEGERS; i++) {

            oneHundredDigits.add(i);
        }

        //updated arrayList is returned.
        return(oneHundredDigits);
    }

    /**
     * method simples returns the Integer arrayList.
     *
     * it is used as a get method in other classes.
     *
     * @return Integer arrayList to be retrieved in other classes.
     */
    public static ArrayList<Integer> getIntegerArrayList() {

        //creator method is executed each time.
        numberCreation();

        //arrayList is returned to other classes.
        return(oneHundredDigits);
    }
}
