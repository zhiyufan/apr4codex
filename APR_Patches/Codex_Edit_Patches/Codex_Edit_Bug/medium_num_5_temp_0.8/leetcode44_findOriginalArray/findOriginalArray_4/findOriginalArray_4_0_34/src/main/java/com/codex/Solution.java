package com.codex;

import java.util.*;

public class Solution {
public class Program {
     public static int[] findOriginalArray(int[] changed) {
        
        int c[] = new int[changed.length];
        int k = 0;
        for (int i = 1; i <= changed.length; i++) {
            int count = 0;
            for (int j = 0; j < changed.length; j++) {
                if (changed[j] == i) {
                    count ++;
                }
            }
            if (count % 2 != 0) {
                if (count == 1) {
                    c[k] = i;
                    k++;
                } else {
                    return new int[]{};
                }
            }
        }   
        for (int i = 0; i < c.length; i++) {
            if (c[i] % 2 != 0) return new int[]{};
        } 
        return c;
    }

 }
}