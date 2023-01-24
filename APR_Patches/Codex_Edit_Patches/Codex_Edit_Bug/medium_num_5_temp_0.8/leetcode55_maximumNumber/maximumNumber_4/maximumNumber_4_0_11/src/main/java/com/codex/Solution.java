package com.codex;

import java.util.*;

public class Solution {
public class Program {
    public static String maximumNumber(String num, int[] change) {
        char[] output = num.toCharArray();
        for (int i = 0; i < change.length; i++) {
            int pos = change[i];
            char max = output[pos];
            int max_pos = 0;
            for (int j = pos + 1; j < output.length; j++) {
                if (output[j] > max) {
                    max = output[j];
                    max_pos = j;
                }
            }
        }
        return new String(output);
    }


    
}