package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        
        if (num.length() == 1) {
            return num;
        }
        char[] output = new char[num.length()];
        for (int i = 0; i < output.length; i++) {
            output[i] = num.charAt(i);
        }

        for (int i = 0; i < change.length; i++) {
            for (int j = 0; j < output.length; j++) {
                if (output[change[i]] < output[j]) {
                    char tmp = output[change[i]];
                    output[change[i]] = output[j];
                    output[j] = tmp;
                }
            }
        }
        return new String(output);
    }
}