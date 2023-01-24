package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        


        int[] arr = new int[times.length];
        for (int i = 0; i < times.length; i++) {
            int arrival = times[i][0];
            int leaving = times[i][1];
            arr[arrival]++;
            arr[leaving]--;
        }

            //If the arrival of a person is counted, then the count increases in one unit, 
            //if the departure of a person is counted, then the count decreases in one unit. 
            //Keep track of the count, and when the count is same as target friend + 1, then return the current time-index. 
            //This is because there are targetFriend number of people in the cafe along with target friend.
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            cnt += arr[i];
            if (cnt - 1 == targetFriend)
                return i;
        }

        return 0;
    }
}