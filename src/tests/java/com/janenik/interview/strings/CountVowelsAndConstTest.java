package com.janenik.interview.strings;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by jane on 10/7/17.
 */
public class CountVowelsAndConstTest {

    @Test
    public void testVowels() {
        assertTrue(CountVowelsAndConst.isVowel('a'));
        assertTrue(CountVowelsAndConst.isVowel('e'));
        assertTrue(CountVowelsAndConst.isVowel('u'));
        assertTrue(CountVowelsAndConst.isVowel('i'));
        assertTrue(CountVowelsAndConst.isVowel('o'));
        assertFalse(CountVowelsAndConst.isVowel('c'));
        assertFalse(CountVowelsAndConst.isVowel('!'));
    }

    @Test
    public void testConsonants() {
        assertTrue(CountVowelsAndConst.isConsonant('q'));
        assertTrue(CountVowelsAndConst.isConsonant('w'));
        assertTrue(CountVowelsAndConst.isConsonant('r'));
        assertFalse(CountVowelsAndConst.isConsonant('i'));
        assertFalse(CountVowelsAndConst.isConsonant('o'));
        assertFalse(CountVowelsAndConst.isConsonant(' '));
        assertFalse(CountVowelsAndConst.isConsonant('!'));
    }

    @Test
    public void testCount() {
        Map<String, Integer> map = new HashMap<>();
        map.put("vowels", 0);
        map.put("consonants", 0);

        assertEquals(map, CountVowelsAndConst.countVowelsAndConsonants("12345!"));

        map.put("vowels", 2);
        map.put("consonants", 3);
        assertEquals(map, CountVowelsAndConst.countVowelsAndConsonants("b mama"));
        assertNotEquals(map, CountVowelsAndConst.countVowelsAndConsonants("privet"));

    }

    @Test
    public void testCountV3() {
        CountVowelsAndConst.TextCharacters result =
                CountVowelsAndConst.countVowelsAndConsonantsV3("12345!");

        assertEquals(0, result.consonants);
        assertEquals(0, result.vowels);


        result = CountVowelsAndConst.countVowelsAndConsonantsV3("b mama");
        assertEquals(3, result.consonants);
        assertEquals(2, result.vowels);

        result = CountVowelsAndConst.countVowelsAndConsonantsV3("privetiki");
        assertEquals(5, result.consonants);
        assertEquals(4, result.vowels);

    }
}
