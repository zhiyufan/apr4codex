package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

    public static int smallestChair(int[][] times, int targetFriend) {

        boolean[] chairs = new boolean[times.length + 2];

        for (int[] time : times) {
            if (time[0] > time[1]) {
                chairs[time[1]] = true;
                chairs[time[0]] = false;
            } else {
                chairs[time[0]] = true;
                chairs[time[1]] = false;
            }
        }

        for (int i = 0; i <= times.length; i++) {
            if (chairs[i]) {
                targetFriend--;
            }
            if (targetFriend < 0) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[][] times = {{1, 4}, {4, 4}, {2, 2}};
        int targetFriend = 1;
        System.out.println(smallestChair(times, targetFriend));
    }
}