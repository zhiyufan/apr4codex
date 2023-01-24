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

            // As there might be multiple people coming in at the same time, we cannot return i in the first time we find an answer. 
            // We need to keep going until cnt - 1 because arr[i] may be greater than 1 and targetFriend might not be the first person to arrive at the time that is the answer.
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            cnt += arr[i];
            if (cnt - 1 == targetFriend)
                return i;
        }

        return 0;
    }
}