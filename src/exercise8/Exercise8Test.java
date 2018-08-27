package exercise8;

import org.junit.jupiter.api.Test;

import static exercise8.Exercise8.correctWord;
import static org.junit.jupiter.api.Assertions.*;

class Exercise8Test {

    @Test
    void fizzBuzzTest() {
        assertEquals("Fizz", correctWord(3));
        assertEquals("Buzz", correctWord(5));
        assertEquals("FizzBuzz", correctWord(15));
        assertEquals("1", correctWord(1));
    }
}