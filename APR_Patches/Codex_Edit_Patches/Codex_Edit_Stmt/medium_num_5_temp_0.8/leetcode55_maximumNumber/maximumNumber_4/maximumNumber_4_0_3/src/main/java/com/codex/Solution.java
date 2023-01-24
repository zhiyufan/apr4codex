package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        char[] output = num.toCharArray();
        Arrays.sort(output);
        StringBuilder sb = new StringBuilder(output.length);
        for (int i = output.length - 1; i >= 0; i--) {
            sb.append(String.valueOf(output[i]));
            for (int j = 0; j < change.length; j++) {
                if (change[j] == 0) {
                    sb.append(output[i]);
                } else {
                    change[j]--;
                }
            }
        }
        return new String(output);
    }


    
}