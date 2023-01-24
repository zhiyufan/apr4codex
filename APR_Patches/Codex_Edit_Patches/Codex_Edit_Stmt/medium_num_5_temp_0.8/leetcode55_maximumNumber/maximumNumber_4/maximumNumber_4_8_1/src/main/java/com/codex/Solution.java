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
        for (int j = 0; j < output.length - 1; j++) {
            for (int i = 0; i < output.length; i++) {
                if (output[i] < output[i + 1]) {
                    char temp = output[i];
                    output[i] = output[i + 1];
                    output[i + 1] = temp;
                }
            }
        }
        return new String(output);
    }


    
}