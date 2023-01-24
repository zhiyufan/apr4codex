package com.codex;

import java.util.*;

public class Solution {
public static int smallestChair(int[][] times, int targetFriend) {
        

        int len = times.length;
        
        int[] arr = new int[len];
       // int[] arr = new int[len*5];
        
        for (int i = 0; i < len; i++) {
            int arrival = times[i][0]; int leaving = times[i][1];
            arr[arrival]++; arr[leaving]--;
        } 
        
        /*
        for (int i = 0; i < len; i++) {
            int arrival = times[i][0];
            int leaving = times[i][1];
            for (int j = arrival; j < leaving; j++) {
                arr[j]++;
            }
        }
        */
        
        int cnt = 0;
        for (int i = 0; i < len; i++) {
            cnt += arr[i];
            /*
            if (cnt == targetFriend)
                return i;
            */
                
            if (cnt == targetFriend)
                return i;
        }
        
        return 0;
}
}