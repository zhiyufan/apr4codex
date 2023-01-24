package com.codex;

import java.util.*;

public class Solution {
static void minimumBribes(int[] q) {
        int n = q.length;
        for (int i = 0; i < n; i++) {
            if (q[i] - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            int count = 0;
            for (int j = i + 1; j < n; j++) {
                if (q[i] > q[j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }    
}