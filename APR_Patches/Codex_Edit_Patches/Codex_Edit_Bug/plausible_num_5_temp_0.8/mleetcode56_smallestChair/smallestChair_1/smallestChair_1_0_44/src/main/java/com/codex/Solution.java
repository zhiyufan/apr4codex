package com.codex;

import java.util.*;

public class Solution {
 public static int smallestChair(int[][] times, int targetFriend) {
        

        int len=times.length;
        int min=times[0][0];
        int max=times[0][1];
        for(int i=0;i<len;i++){
            if(min>times[i][0])
                min=times[i][0];
            if(max<times[i][1])
                max=times[i][1];
        }

        int arr[]=new int[max+1];
        for(int i=0;i<len;i++){
            int start=times[i][0];
            int end=times[i][1];
            arr[start]+=1;
            arr[end]-=1;
        }

        return 0;
    }
}