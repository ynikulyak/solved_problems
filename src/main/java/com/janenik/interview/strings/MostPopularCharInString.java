package com.janenik.interview.strings;

import com.google.common.base.Preconditions;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jane on 10/10/17.
 */
public class MostPopularCharInString {
    
    public static char popular(String str){
        Preconditions.checkNotNull(str);

        if(str.isEmpty()){
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            Integer existing = map.get(c);
            map.put(c, existing != null ? existing + 1 : 1);
        }

        char popular = 0;
        int max = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                popular = entry.getKey();
                max = entry.getValue();
            }
        }
        return popular;
    }
}
