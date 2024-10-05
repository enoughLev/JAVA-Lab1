package org.example;

import javax.xml.transform.sax.SAXSource;
import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

/// 1
        System.out.println("First function: ");
        int variable_1 = 1;
        while (variable_1 <= 500) {
            System.out.println(iterating(variable_1));
            variable_1 += 1;
        }

/// 2
        System.out.println("\nSecond function: ");
        String not_reverse_word = "make install";
        int lenght = not_reverse_word.length();
        System.out.println(reverse(not_reverse_word, lenght));

/// 3
        System.out.println("\nThird function: ");
        int a = 5; int b = 3; int c = -26;
        System.out.println(Arrays.toString(quadratic(a, b, c)));

/// 4
        System.out.println("\nFourth function: ");
        double Sum = 0.000001;
        System.out.println(summary(Sum));


///5
        System.out.println("\nFifth function: ");
        String word = "polop";
        System.out.print("Word is palindrome - ");
        System.out.println(Palindrome(word));
    }



/// 1
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

/// 2
    public static String reverse(String word, int len){
        String new_value = "";
        while (len-1 >= 0) {
            new_value = new_value + word.charAt(len-1);
            len = len - 1;
        }
        return (new_value);

    }

/// 3
    public static double[] quadratic(int a, int b, int c) {
        double[] roots;
        double D = b*b - (4*a*c);
        if (D<0) {
            roots = new double[0];
        }
        else if (D==0) {
            roots = new double[1];
            double x = ((double) -b/(2*a));
            roots[0] = x;
        }
        else {
            roots = new double[2];
            double DD = Math.sqrt(D);
            double x1 = (-b - DD) / (2*a);
            double x2 = (-b + DD) / (2*a);
            roots[0] = x1;
            roots[1] = x2;
        }

        return roots;
    }

    ///4
    public static double summary(double min){
        int n = 2;
        double part = 1/(Math.pow(n,2)+n-2);
        double summ=0;
        if (min <= 0) min = 1;
        if (min > 0 && min < 1e-15) min = 1e-15;

        while (part > min){
            part = 1/(Math.pow(n,2)+n-2);
            summ += part;
            n++;
        }
        return summ;
    }

/// 5
    public static boolean Palindrome(String str){
        int length = str.length();
        if (length < 2) return true;
        for(int i=0; i<length/2; i++){
            if(str.charAt(i) != str.charAt(length-i-1)) return false;
        }
        return true;
    }
}

