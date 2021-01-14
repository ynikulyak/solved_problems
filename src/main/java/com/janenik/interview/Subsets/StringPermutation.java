package com.janenik.interview.Subsets;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jane on 12/16/20.
 */
public class StringPermutation {
    public static List<String> permutations(String word){
        List<String> perm = new ArrayList<>();

        perm.add("");

        for(int i = 0; i < word.length(); i++){
            int size = perm.size();

            for(int j = 0; j < size; j++){
                String copy = perm.get(j);
                if(Character.isLetter(word.charAt(i))){
                    perm.add(new String(copy + Character.toLowerCase(word.charAt(i))));
                    perm.add(new String(copy + Character.toUpperCase(word.charAt(i))));
                }else {
                    perm.add(new String(copy + word.charAt(i)));
                }
            }
            while(size > 0){
                size--;
                perm.remove(0);
            }
        }
        return perm;
    }

    public static void main(String[] args){
        List<String> perm = permutations("ad52");
        System.out.println(perm);

        List<String> list = permutations("ab7c");
        System.out.println(list);
    }
}
