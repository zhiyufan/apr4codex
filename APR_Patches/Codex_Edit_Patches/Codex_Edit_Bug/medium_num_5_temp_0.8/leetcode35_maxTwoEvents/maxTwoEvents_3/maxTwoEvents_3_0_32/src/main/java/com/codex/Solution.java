package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        
        int n = events.length;
        Arrays.sort(events, (a,b) -> a[1] - b[1]);
        int count = 0;
        int last = Integer.MIN_VALUE;
        for(int[] e : events) {
          if(count == 2)
            break;
          if(e[0] < last){
            continue;
          }
          last = e[1];
          count++;
        } 
        return count;
    }

    
}