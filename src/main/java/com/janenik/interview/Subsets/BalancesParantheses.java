package com.janenik.interview.Subsets;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jane on 12/18/20.
 */
public class BalancesParantheses {
    public static List<String> generateParanthese(int num){
        List<String> result = new ArrayList<>();
        if(num == 0){
            return result;
        }

        result.add("");
        for(int i = 0; i < num; i++){
            String str = result.get(0);
            result.add(str + "(");
            result.remove(0);
        }

        for(int i = 0; i < num; i++){
            String str = result.get(0);
            result.add(str + ")");
            result.remove(0);
        }

        return result;
    }

    public static void main(String[] args){
        List<String> list = generateParanthese(2);
        System.out.print(list);
    }
}
