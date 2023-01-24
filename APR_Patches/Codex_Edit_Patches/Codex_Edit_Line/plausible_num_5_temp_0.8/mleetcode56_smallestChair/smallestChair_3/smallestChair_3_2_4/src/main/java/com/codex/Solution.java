package com.codex;

import java.util.*;

public class Solution {
方法2：

    int smallestChair(int[][] times, int targetFriend) {
        
        boolean[] chairs = new boolean[times.length + 2];

        for (int[] time : times) {
            chairs[time[0]] = true;
            chairs[time[1]] = false;
        }

        for (int i = 0; i < times.length; i++) {
            if (chairs[times[i][0]]) {
                targetFriend--;
            }
            if (targetFriend < 0) {
                return times[i][0];
            }
        }
        return -1;
    }

方法1：

    int smallestChair(int[][] times, int targetFriend) {
        
        boolean[] chairs = new boolean[times.length];

        for (int[] time : times) {
            chairs[time[0] - 1] = true;
            chairs[time[1] - 1] = false;
        }

        for (int i = 0; i < times.length; i++) {
            if (chairs[times[i][0] - 1]) {
                targetFriend--;
            }
            if (targetFriend < 0) {
                return times[i][0];
            }
        }
        return -1;
    }
}