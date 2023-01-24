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
        for (int i = 0; i < output.length - 1; i++) {
            for (int j = i + 1; j < output.length; j++) {
                if (output[i] < output[j]) {
                    char temp = output[i];
                    output[i] = output[j];
                    output[j] = temp;
                }
            }
        }
        return new String(output);
    }


    
}