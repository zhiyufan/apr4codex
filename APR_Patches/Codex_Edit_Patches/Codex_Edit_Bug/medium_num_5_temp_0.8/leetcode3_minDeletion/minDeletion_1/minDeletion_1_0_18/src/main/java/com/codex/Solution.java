package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] a) {
        

        int count = 0;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] % 2 == 0) {
                if (a[i] == a[i+1]) {
                    count++;
                }
            } else {
                if (a[i] != a[i+1]) {
                    count++;
                }
            }
        }
        return count;
    }

    
}