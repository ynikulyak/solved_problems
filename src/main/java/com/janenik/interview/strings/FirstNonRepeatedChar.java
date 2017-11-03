package com.janenik.interview.strings;

import com.google.common.base.Preconditions;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by jane on 10/4/17.
 */
public class FirstNonRepeatedChar {

    public static char firstNonRepeated(String str) {
        Preconditions.checkNotNull(str);
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Your string is empty");
        }

        char first = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            char character = str.charAt(i);
            boolean found = true;

            for (int j = str.length() - 1; j > i; j--) {
                if (character == str.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                first = str.charAt(i);
                break;
            }
        }
        return first;
    }

    public static char firstWithHash(String str) {
        Preconditions.checkNotNull(str);

        if (str.isEmpty()) {
            throw new IllegalArgumentException("Your string is empty");
        }

        char first = 0;

        Map<Character, Integer> map = new LinkedHashMap<>(str.length());

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            //map.put(character, map.containsKey(character) ? map.get(character)+1 : 1);
            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                first = entry.getKey();
            }
        }
        return first;
    }

}
