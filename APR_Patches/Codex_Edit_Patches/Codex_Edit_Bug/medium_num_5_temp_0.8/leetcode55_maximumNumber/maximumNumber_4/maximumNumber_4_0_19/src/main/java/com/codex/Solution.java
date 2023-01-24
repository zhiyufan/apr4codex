package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        int min = Integer.MAX_VALUE;
        if (num.length() == 1) {
            return num;
        }
        if (change.length == 0)
            return num;
        char[] output = new char[num.length()];
        for (int i = 0; i < output.length; i++) {
            output[i] = num.charAt(i);
        }
        int i = 0;
        while (i < change.length) {
            for (int j = 0; j < output.length; j++) {
                if (change[i] == j) {
                    int max = Integer.MIN_VALUE;
                    for (int k = j; k < output.length; k++) {
                        if (max < Character.getNumericValue(output[k])) {
                            max = Character.getNumericValue(output[k]);
                            min = k;
                        }
                    }
                    char temp = output[min];
                    output[min] = output[j];
                    output[j] = temp;
                    i++;
                }
            }
        }
        return new String(output);
    }
}