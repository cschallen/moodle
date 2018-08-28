package exercise9;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static exercise9.Exercise9.generate;
import static exercise9.Exercise9.isPrimeNumber;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise9Test {

    @Test
    void generateTest() {
        ArrayList<Integer> emptyArray= new ArrayList<Integer>();
        ArrayList<Integer> filledArray = new ArrayList<Integer>();

        filledArray.add(2);
        filledArray.add(3);
        filledArray.add(5);

        assertEquals(emptyArray, generate(1));
        assertEquals(filledArray, generate(30));
    }

    @Test
    void isPrimeNumberTest() {
        assertEquals(true, isPrimeNumber(5));
        assertEquals(true, isPrimeNumber(7));
        assertEquals(true, isPrimeNumber(11));
        assertEquals(false, isPrimeNumber(4));
        assertEquals(false, isPrimeNumber(1));
        assertEquals(false, isPrimeNumber(0));
        assertEquals(false, isPrimeNumber(8));
        assertEquals(false, isPrimeNumber(15));
    }
}