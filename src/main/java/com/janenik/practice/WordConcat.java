package com.janenik.practice;

/**
 * Created by jane on 10/6/20.
 */
    import java.util.*;

    class WordConcat {
        public static void main(String[] args){
            List<Integer> result = WordConcat.findWordConcatenation("catfoxcat", new String[] { "cat", "fox" });
            System.out.println(result);
            result = WordConcat.findWordConcatenation("catcatfoxfox", new String[] { "cat", "fox" });
            System.out.println(result);
        }

        public static List<Integer> findWordConcatenation(String str, String[] words) {
            if(str == null || str.length() == 0 || str.length() < words.length || words.length == 0){
                throw new IllegalArgumentException();
            }
            List<Integer> resultIndices = new ArrayList<Integer>();
            Map<String, Integer> map = new HashMap<>();
            for(String s : words){
                map.put(s, map.containsKey(s) ? map.get(s)+1 : 1);
            }
            Map<String, Integer> result = new HashMap<>();
            int windowStart = 0;
            int wordsLength = words.length;
            int matched = 0;
            int index = -1;
            int length = words[0].length();
            for(int i = 0; i <= str.length()-3;){
                String sub = str.substring(i, i+length);
                if(map.containsKey(sub)){
                    result.put(sub, result.containsKey(sub) ? result.get(sub) +1 : 1);
                    if(result.get(sub) <= map.get(sub)){
                        matched++;
                        if(matched == wordsLength){
                            index = windowStart;
                            resultIndices.add(index);
                            String left = str.substring(windowStart, windowStart+length);
                            result.put(left, result.get(left)-1);
                            if(result.get(left) == 0){
                                result.remove(left);
                            }
                            matched--;
                            windowStart += length;
                        }
                        i += length;

                    }else if(result.get(sub) > map.get(sub)){
                        windowStart = i;
                        result.clear();
                        matched = 0;
                    }
                }else{
                    i += length;
                    windowStart = i;
                    result.clear();
                    matched = 0;
                }
            }
            // TODO: Write your code here
            return resultIndices;
        }
    }


