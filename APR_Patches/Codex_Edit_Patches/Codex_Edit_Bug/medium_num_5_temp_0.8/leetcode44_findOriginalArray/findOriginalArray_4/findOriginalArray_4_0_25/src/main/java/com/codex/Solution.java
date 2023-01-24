package com.codex;

import java.util.*;

public class Solution {
    public static int[] findOriginalArray(int[] changed) {
        
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < changed.length; i++) {
            if (changed[i] % 2 == 0) {
                evenCount++;
            }
            else {
                oddCount++;
            }
        }
        
        if (evenCount > oddCount) {
            return new int[0];
        }
        int k = 0;
        for (int i = 0; i < changed.length; i++) {
            if (changed[i] % 2 == 0) {
                original[k] = changed[i]/2;
                k++;
            }
        }
        return original;
    }


    
}