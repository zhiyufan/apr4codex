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
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output.length - 1; j++) {
                if (output[j] < output[j + 1]) {
                    char temp = output[j];
                    output[j] = output[j + 1];
                    output[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < change.length; i++) {
            for (int j = 0; j < change.length - 1; j++) {
                if (change[j] > change[j + 1]) {
                    int temp = change[j];
                    change[j] = change[j + 1];
                    change[j + 1] = temp;
                }
            }
        }
        return new String(output);
    }


    
}