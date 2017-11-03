package com.janenik.interview.strings;

import com.google.common.base.Preconditions;

/**
 * Created by jane on 10/11/17.
 */
public class ShuffleString {

    public static boolean isShuffle(String first, String second, String result){

        Preconditions.checkNotNull(first);
        Preconditions.checkNotNull(second);
        Preconditions.checkNotNull(result);

        if(first.isEmpty() || second.isEmpty() || result.isEmpty() || first.length() != second.length()){
            return false;
        }
        return false;
    }
}
