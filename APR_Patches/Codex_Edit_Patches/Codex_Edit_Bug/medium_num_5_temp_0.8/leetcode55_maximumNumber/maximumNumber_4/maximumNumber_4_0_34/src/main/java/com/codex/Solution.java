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
        int[] countArray = new int[10];
        for (int i = 0; i < change.length; i++) {
            countArray[change[i]]++;
        }
        int startPos = 0;
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < countArray[i]; j++) {
                output[startPos] = (char) ('0' + i);
                startPos++;
            }
        }
        return new String(output);
    }

    
}