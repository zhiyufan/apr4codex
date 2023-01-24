package com.codex;

import java.util.*;

public class Solution {
public static String maximumNumber(String num, int[] change) {
    char[] output = num.toCharArray();
    for (int i = 0; i < change.length; i++) {
        int max = i;
        for (int j = i + 1; j <= change[i]; j++) {
            if (output[max] <= output[j]) {
                max = j;
            }
        } 
        char temp = output[i];
        output[i] = output[max];
        output[max] = temp;
    } 
    return new String(output);
}


    
}