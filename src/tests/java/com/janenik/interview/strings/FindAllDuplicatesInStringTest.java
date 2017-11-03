package com.janenik.interview.strings;

import org.junit.Test;

import java.util.LinkedHashSet;
import java.util.Set;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by jane on 10/10/17.
 */
public class FindAllDuplicatesInStringTest {

    @Test(expected = NullPointerException.class)
    public void testNull(){
        FindAllDuplicatesInString.duplicates(null);
    }

    @Test
    public void testDuplicates(){

        assertEquals(null, FindAllDuplicatesInString.duplicates(""));

        Set<String> set = new LinkedHashSet<>();
        set.add("mama");
        set.add("papa");
        set.add("Dasha");
        set.add("Jack");

        assertEquals(set, FindAllDuplicatesInString.duplicates("Dasha and mama, papa, Jack hava a huge; house: mama; papa Dasha Jack"));
        assertNotEquals(set, FindAllDuplicatesInString.duplicates("Dasha and mama and papa and Jack have a huge house mama papa Dasha Jack"));

    }
}
