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
        int counter = 0;
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output.length - 1 - i; j++) {
                if (output[j] < output[j + 1]) {
                    char temp = output[j];
                    output[j] = output[j + 1];
                    output[j + 1] = temp;
                    counter++;
                    if (counter == change.length) return new String(output);
                }
            }
            counter = 0;
        }
        return new String(output);
    }


    
}