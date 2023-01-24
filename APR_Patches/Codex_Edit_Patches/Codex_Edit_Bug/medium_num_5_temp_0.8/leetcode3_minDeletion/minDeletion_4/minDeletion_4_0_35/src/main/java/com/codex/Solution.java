package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] num) {
        
        int count = 0;
        for (int i = 0; i < num.length - 1; i += 2) {
            if (num[i] == num[i + 1]) {
                count++;
            }
        }
        if (num.length % 2 == 1) {
            for (int i = 0; i < num.length - 1; i++) {
                if (num[i] == num[i + 1]) {
                    count++;
                }
            }
        }
        return count;
    }

    
}