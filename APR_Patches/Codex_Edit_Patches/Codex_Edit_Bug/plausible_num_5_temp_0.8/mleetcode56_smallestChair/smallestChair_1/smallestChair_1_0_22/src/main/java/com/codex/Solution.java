package com.codex;

import java.util.*;

public class Solution {
public int smallestChair(int[][] times, int targetFriend) {
        

    
    int[] arr = new int[times.length];
    int[] dep = new int[times.length];
    for(int i = 0; i < times.length; i++)
    {
        int arrival = times[i][0];
        int leaving = times[i][1];
        arr[arrival]++;
        dep[leaving]++;
    }
    
    int cnt = 0;
    for (int i = 0; i < arr.length; i++) {
        cnt += arr[i];
        cnt -= dep[i];
        if (cnt == targetFriend)
            return i;
    }
    
        return 0;
    }
}