package com.janenik.interview.strings;

import com.google.common.base.Preconditions;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jane on 10/7/17.
 */
public class CountVowelsAndConst {

    public static void vowels(String str) {

        Preconditions.checkNotNull(str);
        int vowels = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'e' || c == 'u' || c == 'i' || c == 'o' || c == 'a') {
                vowels++;
            }
        }

        int consonants = str.length() - 1 - vowels;
    }

    public static boolean isVowel(Character c) {
        if (c == 'e' || c == 'u' || c == 'i' || c == 'o' || c == 'a') {
            return true;
        }
        return false;
    }

    public static boolean isConsonant(Character c) {

        if (Character.isLetter(c) && !isVowel(c)) {
            return true;
        }
        return false;
    }

    public static Map<String, Integer> countVowelsAndConsonants(String str) {
        Preconditions.checkNotNull(str);

        Map<String, Integer> map = new HashMap<>();
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isVowel(c)) {
                vowels++;
            }
            if (isConsonant(c)) {
                consonants++;
            }
        }
        map.put("vowels", vowels);
        map.put("consonants", consonants);
        return map;
    }

    public static final class TextCharacters {
        public final int consonants;
        public final int vowels;

        public TextCharacters(int consonants, int vowels) {
            this.consonants = consonants;
            this.vowels = vowels;
        }
    }

    public static TextCharacters countVowelsAndConsonantsV3(String str) {
        Preconditions.checkNotNull(str);

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isVowel(c)) {
                vowels++;
            }
            if (isConsonant(c)) {
                consonants++;
            }
        }
        return new TextCharacters(consonants, vowels);
    }
}
