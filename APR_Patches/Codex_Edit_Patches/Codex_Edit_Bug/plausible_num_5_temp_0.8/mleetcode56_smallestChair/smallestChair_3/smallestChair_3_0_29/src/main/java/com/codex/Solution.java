package com.codex;

import java.util.*;

public class Solution {
public static int smallestChair(int[][] times, int targetFriend) {
        boolean[] chairs = new boolean[times.length + 2];

        for (int[] time : times) {
            chairs[time[0]] = true;
            if (i == 0) {
                continue;
            }
            chairs[time[1] + 1] = false;
        }

        for (int i = 0; i < chairs.length; i++) {
            if (chairs[i]) {
                targetFriend -= chairs[i - 1] ? 0 : 1;
            }
            if (targetFriend <= 0) {
                return i - 1;
            }
        }
        return 0;
}
}