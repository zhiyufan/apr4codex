package com.codex;

import java.util.*;

public class Solution {
http://www.geeksforgeeks.org/find-smallest-range-containing-elements-from-k-lists/
    class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {

        int[] arr = new int[times.length];
        for (int i = 0; i < times.length; i++) {
            int arrival = times[i][0];//fix
            int leaving = times[i][1]; //fix
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
}
}