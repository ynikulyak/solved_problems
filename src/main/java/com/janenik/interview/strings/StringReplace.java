package com.janenik.interview.strings;

/**
 * Created by jane on 10/7/17.
 */
public class StringReplace {
    public static void main(String[] args){
        String str = "Mama mila \t\n\rramu";
        str = str.replaceAll("\\s", "%20");
        System.out.println(str);
    }

}
