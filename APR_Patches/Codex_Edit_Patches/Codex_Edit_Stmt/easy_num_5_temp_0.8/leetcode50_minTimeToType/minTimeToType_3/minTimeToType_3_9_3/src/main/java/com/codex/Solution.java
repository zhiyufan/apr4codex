package com.codex;

import java.util.*;

public class Solution {
    public static int minimumSwaps(int[] arr) {
        int swap = 0;
        boolean visited[] = new boolean[arr.length];
 
        for (int i = 0; i < arr.length; i++) {
            int j = i, cycle = 0;
 
            while (!visited[j]) {
                visited[j] = true;
 
                j = arr[j] - 1;
                cycle++;
            }
 
            if (cycle != 0) {
                swap += (cycle - 1);
            }
        }
 
        return swap;

    }}
    
    
}