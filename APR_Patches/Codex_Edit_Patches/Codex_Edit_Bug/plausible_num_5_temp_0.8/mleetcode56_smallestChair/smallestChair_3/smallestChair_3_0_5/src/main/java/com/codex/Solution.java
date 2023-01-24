package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[][] times = new int[][]{{1, 5}, {2, 8}, {3, 8}};
        System.out.println(smallestChair(times, 1));
    }

    public static int smallestChair(int[][] times, int targetFriend) {
        
        // boolean[] chairs = new boolean[times.length + 2];
        // for (int[] time : times) {
        //     chairs[time[0]] = true;
        //     chairs[time[1]] = false;
        // }
        // for (int i = 0; i < chairs.length; i++) {
        //     if (chairs[i]) {
        //         targetFriend--;
        //     }
        //     if (targetFriend < 0) {
        //         return i;
        //     }
        // }
        // return -1;

        List<int[]> list = new ArrayList<>(Arrays.asList(times));
        for (int i = 0; i < list.size(); i++) {
            int j = i - 1;
            int[] startTime = list.get(i);
            while (j >= 0) {
                int[] prevTime = list.get(j);
                if (startTime[0] < prevTime[1]) {
                    list.remove(prevTime);
                    targetFriend--;
                    i--;
                    break;
                }
                j--;
            }
            if (targetFriend == 0) {
                return startTime[0];
            }
        }

        return -1;
    }
}
    
}