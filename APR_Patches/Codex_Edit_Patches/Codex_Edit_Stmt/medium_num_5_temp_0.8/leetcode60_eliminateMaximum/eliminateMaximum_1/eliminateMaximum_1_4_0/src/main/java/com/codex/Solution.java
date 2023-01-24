package com.codex;

import java.util.*;

public class Solution {
    public static int eliminateMaximum(int[] arr) {
        int[] a = arr.clone();
        Arrays.sort(a);
        int min = Integer.MAX_VALUE;
        int index = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] < 0) {
                continue;
            }
            if(a[i] <= min) {
                min = a[i];
                index = i;
            }
            else break;
                
        }
        return maxIndex;
    }

    
}