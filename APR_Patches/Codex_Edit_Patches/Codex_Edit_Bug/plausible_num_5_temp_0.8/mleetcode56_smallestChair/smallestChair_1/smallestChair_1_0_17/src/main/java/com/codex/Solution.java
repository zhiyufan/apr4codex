package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int[] arr = new int[24 * 60];
        for (int[] time : times) {
            int arrival = time[0] * 60 + time[1];
            int leaving = time[2] * 60 + time[3];
            arr[arrival]++;
            arr[leaving]--;
        }


        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
            if (count - 1 == targetFriend)
                return i;
        }

        return 0;
    }
}
}