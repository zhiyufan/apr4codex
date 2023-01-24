package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        for (int i = 0; i < times.length; i++) {// O(n)
            if (times[i][0] <= targetFriend && times[i][1] >= targetFriend) {
                return i;//O(1)
            }
        }
        return -1;//O(1)
    }

    
}