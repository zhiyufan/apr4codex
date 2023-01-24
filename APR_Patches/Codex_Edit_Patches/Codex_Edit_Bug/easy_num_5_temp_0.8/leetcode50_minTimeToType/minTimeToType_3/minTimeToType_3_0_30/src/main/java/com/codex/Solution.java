package com.codex;

import java.util.*;

public class Solution {
    public static int minTimeToType(String word) {
        

        if(word.length() == 0) {
            return 0;
        }
        
        int[][] graph = new int[27][27];
        for(int i = 0; i< 27; i++) {
            for(int j = 0; j< 27; j++) {
                graph[i][j] = Math.min(Math.abs(i - j), 26 - Math.abs(i - j));
            }
        }

        int[] distance = new int[27];
        Arrays.fill(distance, Integer.MAX_VALUE);

        int start = word.charAt(0) - 'a' + 1;
        int end = word.charAt(word.length() - 1) - 'a' + 1;
        distance[start] = 0;

        for(int i = 0; i < 26; i++) {
            for(int j = 1; j < 27; j++) {
                for(int k = 1; k < 27; k++) {
                    if(distance[j] != Integer.MAX_VALUE && graph[j][k] != Integer.MAX_VALUE) {
                        distance[k] = Math.min(distance[j] + graph[j][k], distance[k]);
                    }
                }
            }
        }

        return distance[end];
    }

    
}