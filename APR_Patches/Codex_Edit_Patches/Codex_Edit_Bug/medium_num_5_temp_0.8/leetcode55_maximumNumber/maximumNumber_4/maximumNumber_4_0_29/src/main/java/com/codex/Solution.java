package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        
        if (num.length() == 1) {
            return num;
        }
        char[] output = new char[num.length()];
        int count = 0;
        for (int i = 0; i < output.length; i++) {
            output[i] = num.charAt(i);
        }
        for (int i = 0; i < change.length; i++) {
            count++;
            for (int j = 0; j < output.length - 1 - i; j++) {
                if (output[j] >= output[j + 1]) {
                    continue;
                } else {
                    char temp = output[j + 1];
                    output[j + 1] = output[j];
                    output[j] = temp;
                }
            }
        }

        return new String(output);
    }


    
}