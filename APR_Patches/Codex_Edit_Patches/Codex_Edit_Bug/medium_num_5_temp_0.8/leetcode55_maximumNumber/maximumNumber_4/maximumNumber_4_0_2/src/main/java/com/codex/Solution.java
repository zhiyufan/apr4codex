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
        for (int i = 0; i < output.length; i++) {
            for (int j = i + 1; j < output.length; j++) {
                if (!(j == i + 1 && j == output.length - 1)) {
                    if (output[i] < output[j]) {
                        char temp = output[j];
                        output[j] = output[i];
                        output[i] = temp;
                    }
                }
            }
        }
        return new String(output);
    }


    
}