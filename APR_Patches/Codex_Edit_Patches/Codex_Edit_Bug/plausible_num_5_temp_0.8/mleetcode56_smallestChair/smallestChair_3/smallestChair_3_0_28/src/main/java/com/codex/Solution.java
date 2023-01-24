package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {

        boolean[] chairs = new boolean[times.length + 2];
        int count = 0;
        for (int[] time : times) {
            chairs[time[0]] = true;
            chairs[time[1]] = false;
        }

        for (int i = 0; i < chairs.length; i++) {
            if (chairs[i]) {
                count++;
            }
            else count--;

            if (count - 1 == targetFriend) {
                return i;
            }
        }
        return -1;
    }
}