package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] L) {
        
        int count = 0;
        for (int i = 0; i < L.length - 1; i++) {
            if (L[i] % 2 == 0 && L[i] == L[i + 1]) {
                count++;
            }
        }
        return count;                     //return the number of int to be deleted
    }

    
}