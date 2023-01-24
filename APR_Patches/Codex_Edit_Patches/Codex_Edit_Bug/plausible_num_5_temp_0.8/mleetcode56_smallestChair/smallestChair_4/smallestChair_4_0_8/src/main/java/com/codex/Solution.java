package com.codex;

import java.util.*;

public class Solution {
public static int smallestChair(int[][] times, int targetFriend) {   
    int currMax = 0;
    for (int[] time : times) {
        currMax = Math.max(currMax, time[0]);
        currMax = Math.max(currMax, time[1]);
    }
    int[] chairs = new int[currMax+1];
    for (int[] time : times) {
        for (int i = time[0]; i < time[1]; i++) chairs[i]++;
    }
    for (int i = 0; i < chairs.length; i++) {
        if (chairs[i] == targetFriend) return i;
    }
    return -1;
}


public static int smallestChair(int[][] times, int targetFriend) {
    int currMax = 0;
    for (int[] time : times) {
        currMax = Math.max(currMax, time[0]);
        currMax = Math.max(currMax, time[1]);
    }
    int[] chairs = new int[currMax+1];
    for (int[] time : times) {
        for (int i = time[0]; i < time[1]; i++) chairs[i]++;
    }

    int smallest1 = 0;
    int smallest2 = 0;

    for (int i = 0; i < chairs.length; i++) {
        if (chairs[i] == targetFriend && chairs[i-1] < targetFriend) {
            smallest1 = i;
        }
    }

    for (int i = chairs.length - 1; i >= 0; i--) {
        if (chairs[i] == targetFriend && chairs[i+1] < targetFriend) {
            smallest2 = i;
        }
    }

    if (smallest1 != 0 && smallest2 != 0) {
        return smallest1 < smallest2 ? smallest1 : smallest2;
    } else if (smallest1 == 0 && smallest2 == 0) {
       return -1;
    } else {
        return smallest1 != 0 ? smallest1 : smallest2;
    }
}
}