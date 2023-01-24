package com.codex;

import java.util.*;

public class Solution {
public class SmallestChairWithTargetFriend {
       
	public static int smallestChair(int[][] times, int targetFriend) {
		

        
        int[] arr = new int[times.length];
        for (int i = 0; i < times.length; i++) {
            int arrival = times[i][0];
            int leaving = times[i][1];
            int index = times[i][2];
            arr[index]++;
            arr[index]--;
        }
        int cnt = 0;
        int i = 0;
        while (i < arr.length) {
            cnt += arr[i];
            if (cnt - 1 == targetFriend)
                break;

            i++;
        }

        return i;
        }

    

    public static void main(String[] args) {
        int[][] arr = new int[][] { { 1, 2, 0 }, { 1, 3, 1 }, { 2, 3, 2 }, { 1, 3, 3 } };
        System.out.println(smallestChair(arr, 1));
    }
}
}