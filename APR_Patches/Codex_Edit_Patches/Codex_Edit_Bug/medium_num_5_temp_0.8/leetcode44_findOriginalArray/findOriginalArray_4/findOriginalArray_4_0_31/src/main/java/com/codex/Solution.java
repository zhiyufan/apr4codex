package com.codex;

import java.util.*;

public class Solution {
    public static int[] findOriginalArray(int[] changed) {
        
        int[] original = new int[changed.length/2];
        int k = original.length-1;
        for (int i = changed.length-1; i >= 0; i--) {
            if (changed[i] % 2 == 0)
                original[k] = changed[i]/2; 
            else
                original[k] = changed[i];
                k++;
        }
        return original;
    }


    
}