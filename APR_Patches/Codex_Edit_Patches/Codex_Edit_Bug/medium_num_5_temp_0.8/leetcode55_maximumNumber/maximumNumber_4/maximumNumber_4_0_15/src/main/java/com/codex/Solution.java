package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        
        if (change.length == 1) {
            return insertChar(num, change[0], '0');
        }
        if (num.length() == 1) {
            return sort(num);
        }

        String output = null;
        String temp = null;
        String max = null;

        for (int i = 0; i < change.length; i++) {
            max = sort(num);
            temp = insertChar(num, change[i], '9');
            if (max.compareTo(temp) < 0) {
                max = temp;
            }
        }
        return max;
    }


    
}