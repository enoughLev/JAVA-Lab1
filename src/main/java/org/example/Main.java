package org.example;

public class Main {
    public static void main(String[] args) {

        int variable_1 = 1;
        while (variable_1 <= 500) {
            System.out.println(iterating(variable_1));
            variable_1 += 1;
        }


    }

    public static String iterating(int i) {
        if (i % 5 == 0 & i % 7 == 0) {
            return "fizzbuzz";
        } else if (i % 5 == 0) {
            return "fizz";
        } else if (i % 7 == 0) {
            return "buzz";
        } else {
            return (String.valueOf(i));
        }
    }

}

