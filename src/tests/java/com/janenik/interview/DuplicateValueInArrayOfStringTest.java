package com.janenik.interview;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by jane on 9/21/17.
 */
public class DuplicateValueInArrayOfStringTest {

    String[] arr = {"mama", "papa", "mama", "cool", "papa", "DASHA", "snoew", "dasha"};

    String[] arrExpected = {"mama", "papa", "dasha"};
    List list = Arrays.asList(arrExpected);


    @Test
    public void testDuplicates(){
        assertEquals(list, DuplicateValueInArrayOfString.duplicates(arr));
    }
}
