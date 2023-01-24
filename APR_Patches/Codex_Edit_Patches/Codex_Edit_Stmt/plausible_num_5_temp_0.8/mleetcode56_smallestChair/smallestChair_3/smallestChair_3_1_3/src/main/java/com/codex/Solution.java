package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        
        boolean[] chairs = new boolean[times.length + 2];

        for (int[] time : times) {
            for (int i = time[0]; i < time[1]; i++) {
                chairs[i] = true;
            }
        }

        for (int i = 0; i < chairs.length; i++) {
            if (chairs[i]) {
                targetFriend--;
            }
            if (targetFriend < 0) {
                return i;
            }
        }
        return -1;
    }





    
}