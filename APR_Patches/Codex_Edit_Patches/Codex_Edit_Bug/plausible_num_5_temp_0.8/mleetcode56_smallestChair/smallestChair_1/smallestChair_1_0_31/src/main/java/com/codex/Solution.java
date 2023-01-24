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

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            cnt += arr[i];
            if (cnt - 1 == targetFriend)
                return i;
        }

        return 0;
    }



    public static int smallestChair(int[][] times, int targetFriend) {
        if (times.length == 0) return 0;
        int n = times.length;
        int[] visited = new int[n];
        Arrays.fill(visited, -1);

        for (int i=0; i<n; i++) {
            int in = times[i][0];
            int out = times[i][1];
            boolean flag = true;
            for (int j = in; j < out; j++) {
                if (visited[j] == -1) {
                    visited[j] = i;
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return 0;
            }
        }

        for (int i = 0; i < visited.length; i++) {
            if (visited[i] == targetFriend) {
                return i;
            }
        }

        return 0;
    }
}