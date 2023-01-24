package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {

        int[] arr = new int[times.length];
        for (int i = 0; i < times.length; i++) {
            int arrival = times[i][0];
            int leaving = times[i][1];
            arr[arrival - 1]++;
            arr[leaving - 1]--;
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) { //This for loop goes from 0 to arr.length
            //System.out.println("i = " + i);
            cnt += arr[i];
            }
            //System.out.println("cnt at i = " + i + " " + cnt);
            if (cnt - 1 == targetFriend) {
                //System.out.println("cnt - 1= " + (cnt - 1));
                return i;
        }

        return 0;
    }
}