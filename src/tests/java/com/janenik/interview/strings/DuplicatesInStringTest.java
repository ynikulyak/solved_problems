package com.janenik.interview.strings;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotSame;

/**
 * Created by jane on 10/2/17.
 */
public class DuplicatesInStringTest {

    @Test
    public void testDuplicatesWithCount(){

        Map<Character, Integer> expected = new HashMap<>();
        assertEquals(expected, DuplicatesInString.duplicatesWithCount("1234567890"));
        assertEquals(expected, DuplicatesInString.duplicatesWithCount("abcde-123"));
        assertEquals(expected, DuplicatesInString.duplicatesWithCount(""));
      //  assertEquals(expected, DuplicatesInString.duplicatesWithCount(null));

        // 5
        expected.clear();
        expected.put('m', 2);
        expected.put('a', 2);
        assertEquals(expected, DuplicatesInString.duplicatesWithCount("privet, mama"));
       // assertEquals(expected, DuplicatesInString.duplicatesChar("privet, mama"));

        // 6
        expected.clear();
        expected.put('p', 3);
        expected.put('a', 2);
        assertEquals(expected, DuplicatesInString.duplicatesWithCount("privet, papa"));
    }

    @Test
    public void testDuplicates(){

        List<Character> list = new ArrayList<>();

        assertEquals(list, DuplicatesInString.duplicates("1234567890"));
        assertEquals(list, DuplicatesInString.duplicates("abcde-123"));
        assertEquals(list, DuplicatesInString.duplicates(""));

        list.add('m');
        list.add('a');
        assertEquals(list, DuplicatesInString.duplicates("privet, mama"));

        list.clear();

        list.add('p');
        list.add('a');
        assertEquals(list, DuplicatesInString.duplicates("privet, papa"));
        assertNotSame(list, DuplicatesInString.duplicates("privet, papat"));
    }
}
