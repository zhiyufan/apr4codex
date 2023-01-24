package com.codex;

import java.util.*;

public class Solution {
public static int smallestChair(int[][] times, int targetFriend) {

    int chair = 0;
    
    for (int i = 0; i < times[0].length; i++) {
        int friend = 0;
        for (int[] time : times) {
            if (time[0] <= i && i < time[1]) {
                friend++;
            }
        }
        if (friend == targetFriend) {
            chair = i;
            break;
        }
    }

    return chair;
}
}