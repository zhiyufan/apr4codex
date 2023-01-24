package com.codex;

import java.util.*;

public class Solution {
public static String maximumNumber(String num, int[] change) {
        
        if (num.length() == 1) {
            return num;
        }
        int[] output = new int[num.length()];
        for (int i = 0; i < output.length; i++) {
            output[i] = Integer.parseInt(num.substring(i, i+1));
        }
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output.length - 1; j++) {
                if (output[j] < output[j + 1]) {
                    int temp = output[j];
                    output[j] = output[j + 1];
                    output[j + 1] = temp;
                }
            }
        }
        StringBuilder res = new StringBuilder();
        for (int k = 0; k < output.length; k++) {
            res.append(output[k]);
        }
        return res.toString();
    }
}