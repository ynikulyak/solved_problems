package com.janenik.interview.numbers;

import com.janenik.interview.PalindromNumber;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by jane on 10/25/17.
 */
public class PalindromeNumberTest {

    @Test
    public void testPalindrome(){

        assertTrue(PalindromeNumber.isPalindrome(121));
        assertFalse(PalindromeNumber.isPalindrome(123));
        assertTrue(PalindromeNumber.isPalindrome(22));
        assertFalse(PalindromeNumber.isPalindrome(2));
    }
}
