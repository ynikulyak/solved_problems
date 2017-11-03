package com.janenik.interview.strings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by jane on 7/24/17.
 */
public class PalindromeTest {

    @Test
    public void testPalindrome(){

        assertTrue(Palindrome.isPalindrome("abcba"));
        assertTrue(Palindrome.isPalindrome("a"));
        assertTrue(Palindrome.isPalindrome(""));
        assertFalse(Palindrome.isPalindrome("abcabc"));
        assertTrue(Palindrome.isPalindrome("abba"));

        assertTrue(Palindrome.isPalindrom2("abcba"));
        assertTrue(Palindrome.isPalindrom2("a"));
        assertFalse(Palindrome.isPalindrom2(""));
        assertFalse(Palindrome.isPalindrom2("abcabc"));
        assertTrue(Palindrome.isPalindrom2("abba"));
    }

    @Test(expected = NullPointerException.class)
    public void testNull(){
        Palindrome.isPalindrom2(null);
    }
}
