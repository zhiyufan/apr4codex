package com.codex;

import java.util.*;

public class Solution {
   public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        
        boolean[] chairs = new boolean[times.length + 2];

        for (int[] time : times) {
            chairs[time[0]] = true;
            chairs[time[1]] = false;
        }

        for (int i = 0; i < chairs.length; i++) {
            if (chairs[i]) {
                targetFriend--;
            }
            if (targetFriend <= 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(smallestChair(new int[][] { { 0, 1 }, { 1, 2 }, { 2, 3 }, { 1, 4 }, { 3, 4 }, { 1, 3 } }, 3));
    }
}
}