package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors, int m) {
        

        int n = m;
        int maxDist = 0;
        int lastColor = -1;
        int lastColorPos = -1;
        for (int i = 0; i < n; i++) {
            if(color[i] > color[i + 1])
            {
                maxDist = color[i] +  color[i + 1];
            }  
        }
        return maxDist;
    }

    
}