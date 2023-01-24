package com.codex;

import java.util.*;

public class Solution {
import java.util.HashMap;

public class TargetFriend {

    public static void main(String[] args) {
        int[][] times = {{2, 3}, {1, 7}, {1, 5}, {9, 11}};
        TargetFriend tf = new TargetFriend();
        int targetFriend = tf.smallestChair(times, 2);
        System.out.println(targetFriend);
    }

    public int smallestChair(int[][] times, int targetFriend) {
        int maxTime = 0;
        for (int[] time : times)
            maxTime = Math.max(maxTime, Math.max(time[0], time[1]));
        int[] chairs = new int[maxTime + 1];
        for (int[] time : times) {
            for (int i = time[0]; i <= time[1]; i++)
                chairs[i]++;
        }

        for (int i = 0; i < chairs.length; i++) {
            if (chairs[i] == targetFriend)
                return i;
        }
        return -1;
    }
}
}