package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void iterating_1() {
        assertEquals("fizz", Main.iterating(5));
    }
    @Test
    void iterating_2() {
        assertEquals("buzz", Main.iterating(7));
    }
    @Test
    void iterating_3() {
        assertEquals("fizzbuzz", Main.iterating(35));
    }
    @Test
    void iterating_4() {
        assertEquals("6", Main.iterating(6));
    }

    @Test
    void reverse_1() {
        String not_reverse_word = "make install";
        int lenght = not_reverse_word.length();
        assertEquals("llatsni ekam", Main.reverse(not_reverse_word, lenght));
    }
    @Test
    void reverse_2() {
        String not_reverse_word = "Oppenheimer";
        int lenght = not_reverse_word.length();
        assertEquals("remiehneppO", Main.reverse(not_reverse_word, lenght));
    }

    @Test
    void quadratic_1() {
        int a = 5; int b = 3; int c = -26;
        double[] expRoots = new double[]{-2.6,2.0};
        double[] actRoots = Main.quadratic(a,b,c);
        assertEquals(expRoots[0],actRoots[0]);
        assertEquals(expRoots[1],actRoots[1]);
    }
    @Test
    void quadratic_2() {
        int a = -1; int b = 7; int c = -10;
        double[] expRoots = new double[]{5.0,2.0};
        double[] actRoots = Main.quadratic(a,b,c);
        assertEquals(expRoots[0],actRoots[0]);
        assertEquals(expRoots[1],actRoots[1]);
    }

    @Test
    void summary() {
        double minSum = 1.0/(2*2+2-2);
        double maxSum = 11.0/18;
        double sum = Main.summary(1e-14);
        assertTrue(sum>=minSum && sum<=maxSum);
    }

    @Test
    void Palindrome(){
        String s = "qweAWAewq";
        boolean actualRes = Main.Palindrome(s);
        assertTrue(actualRes);
    }
}