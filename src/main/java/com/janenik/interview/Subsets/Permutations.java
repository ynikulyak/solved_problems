package com.janenik.interview.Subsets;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jane on 12/14/20.
 */
public class Permutations {
    public static List<List<Integer>> permutations(int[] nums){

        List<List<Integer>> sets = new ArrayList<>();
        sets.add(new ArrayList<>());
        if(nums.length == 0){
            return  sets;
        }

        for(int i = 0; i < nums.length; i++){
            int setsSize = sets.size();
            for(int k = 0; k < setsSize; k++){
                List<Integer> list = sets.get(k);
                int size = list.size();
                for(int j = 0; j <= size; j++) {
                    List<Integer> copy = new ArrayList<>(list);
                    copy.add(j, nums[i]);
                    sets.add(copy);
                }
            }
            while(setsSize > 0){
                sets.remove(0);
                setsSize--;
            }
        }


        return sets;
    }

    public static void main(String[] args){
        List<List<Integer>> result = permutations(new int[]{1, 3, 5});
        System.out.print(result);
    }
}
