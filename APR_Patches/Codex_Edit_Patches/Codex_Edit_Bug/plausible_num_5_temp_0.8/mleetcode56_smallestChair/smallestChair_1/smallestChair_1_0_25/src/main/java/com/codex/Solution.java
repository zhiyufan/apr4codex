package com.codex;

import java.util.*;

public class Solution {
   public static int smallestChair(int[][] times, int targetFriend) {
        int[] guests = new int[11];
        int max = 0;
        for (int[] time : times) {
            guests[time[0]]++;
            guests[time[1]]--;
            max = Math.max(max, time[1]);
        }


        int cnt = 1;
        for (int i = 1; i <= max; i++) {
            guests[i] += guests[i - 1];
            if (guests[i] == targetFriend) return i;
            if (guests[i] > targetFriend) return i + 1;
        }

        return max + 1;
    }
}
}