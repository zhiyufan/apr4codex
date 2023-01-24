package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        
        if (num.length() == 1) {
            return num;
        }
        int[] output = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            output[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        for (int i = 0; i < change.length; i++) {
            for (int j = 0; j < output.length - 1; j++) {
                if (output[j] < output[j + 1]) {
                    char temp = output[j];
                    output[j] = output[j+1];
                    output[j + 1] = temp;
                }
            }
        }
        return Arrays.toString(output);
    }


    
}