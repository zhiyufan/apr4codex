package com.codex;

import java.util.*;

public class Solution {

    /**
     * The task is to find the chair id where a specific friend will sit. For example, 
     * if there are 10 chairs and 3 friends, then friend 1 will sit in chair 6 and friend 2 will sit in chair 7.
     * 
     * The order of arrival and leaving of a friend is given in the 2D array and the friend id,
     * whose chair number to find, is also given
     * 
     * 
     */

    public static int smallestChair(int[][] times, int targetFriend) {
        


        int[] arr = new int[times.length];
        for (int i = 0; i < times.length; i++) {
            int arrival = times[i][0];
            int leaving = times[i][1];
            arr[arrival]++;
            arr[leaving]--;
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            cnt += arr[i];
            if (cnt - 1 == targetFriend)
                return i;
        }

        return 0;
    }

    public static int smallestChair(int[][] times, int targetFriend) {

        for (int i = times.length - 1; i >= 0; i--) {
            if (targetFriend == 0)
                return i;
            targetFriend -= times[i][0] - times[i][1];
        }

        return 0;
    }
}