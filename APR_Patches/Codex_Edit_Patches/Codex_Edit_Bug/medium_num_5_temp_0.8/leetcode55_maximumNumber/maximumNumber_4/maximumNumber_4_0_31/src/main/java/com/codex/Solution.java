package com.codex;

import java.util.*;

public class Solution {
    import java.util.Arrays;

    public static String maximumNumber(String num, int[] change) {
        
        if (num.length() == 1) {
            return num;
        }

        char[] output = num.toCharArray();
        
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output.length - 1; j++) {
                if (Character.getNumericValue(output[j]) < Character.getNumericValue(output[j + 1])) {
                    char temp = output[j];
                    output[j] = output[j + 1];
                    output[j + 1] = temp;
                }
            }
        }
        return new String(output);
    }


    
}