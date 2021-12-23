package com.example.wordcounter;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.wordcounter.utils.TextCounter;

public class ExampleUnitTest {
    //Testing of words counter
    @Test
    public void wordsCountIsCorrect1() {
        String inputString = "";

        int expectedValue = 0;
        int actualValue = TextCounter.countWords(inputString);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void wordsCountIsCorrect2() {
        String inputString = "hello, can you count the words correctly?";

        int expectedValue = 7;
        int actualValue = TextCounter.countWords(inputString);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void wordsCountIsCorrect3() {
        String inputString = "     ";

        int expectedValue = 0;
        int actualValue = TextCounter.countWords(inputString);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void wordsCountIsCorrect4() {
        String inputString = "hello";

        int expectedValue = 1;
        int actualValue = TextCounter.countWords(inputString);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void wordsCountIsCorrect5() {
        String inputString = ", . ? !";

        int expectedValue = 0;
        int actualValue = TextCounter.countWords(inputString);

        assertEquals(expectedValue, actualValue);
    }

    //Testing of chars counter

    @Test
    public void charsCountIsCorrect1() {
        String inputString = "";

        int expectedValue = 0;
        int actualValue = TextCounter.getCharsCount(inputString);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void charsCountIsCorrect2() {
        String inputString = "  "; //two spaces

        int expectedValue = 2;
        int actualValue = TextCounter.getCharsCount(inputString);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void charsCountIsCorrect3() {
        String inputString = "      "; //two tabs

        int expectedValue = 6;
        int actualValue = TextCounter.getCharsCount(inputString);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void charsCountIsCorrect4() {
        String inputString = "hello,!?";

        int expectedValue = 8;
        int actualValue = TextCounter.getCharsCount(inputString);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void charsCountIsCorrect5() {
        String inputString = ",.!&&64";

        int expectedValue = 7;
        int actualValue = TextCounter.getCharsCount(inputString);

        assertEquals(expectedValue, actualValue);
    }
}
