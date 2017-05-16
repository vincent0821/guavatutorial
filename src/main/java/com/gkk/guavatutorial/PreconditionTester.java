package com.gkk.guavatutorial;

import com.google.common.base.Preconditions;

/**
 * Created by za-gongkuaikuai on 2017/4/25.
 */
public class PreconditionTester {
    public static void main(String args[]) {
        PreconditionTester preconditionTester = new PreconditionTester();

        try {
            System.out.println(preconditionTester.sqrt(-3.0));
        }catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(preconditionTester.sum(null,3));
        }catch(NullPointerException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(preconditionTester.getValue(6));
        }catch(IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    private int getValue(int input) {
        int[] data = {1,2,3,4,5};
        Preconditions.checkElementIndex(input,data.length,"Illegal Argument passed:Invalid index.");
        return 0;
    }

    private double sum(Integer a, Integer b) {
        Preconditions.checkNotNull(a,"Illegal Argument passed: First parameter is null.");
        Preconditions.checkNotNull(b,"Illegal Argument passed: Second parameter is null.");
        return a + b;
    }

    private double sqrt(double input) {
        Preconditions.checkArgument(input>0.0,"Illegal Augument passed:Neagetive value %s",input);
        return Math.sqrt(input);
    }
}
