package com.codex;

import java.util.*;

public class Solution {
    public static int eliminateMaximum(int[] dist) {
        Arrays.sort(dist);
        int indexLen = 0;
        for(int i = 0; i < dist.length; i++) {
            if(dist[i] < 0) {
                indexLen++;
            }
        }
        return indexLen;
    }

    
}