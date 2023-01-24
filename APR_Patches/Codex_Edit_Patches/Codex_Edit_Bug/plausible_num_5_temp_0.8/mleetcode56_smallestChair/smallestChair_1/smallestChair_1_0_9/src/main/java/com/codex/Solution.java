package com.codex;

import java.util.*;

public class Solution {
public class MyClass {
    
  public static int smallestChair(int[][] times, int targetFriend) {
        
    int[] arr = new int[times[times.length - 1][1] + 1];


    for (int i = 0; i < times.length; i++) {
        int arrival = times[i][0];
        int leaving = times[i][1];
        arr[arrival]++;
        arr[leaving]--;
    }

    int cnt = 0, pos = 0;
    for (int i = 0; i < arr.length; i++) {
        cnt += arr[i];
        if (cnt - 1 == targetFriend) {
            pos = i;
            break;
    }

    int smallestChair = 0;
    for (int i = pos; i >= 0; i--) {
        if (arr[i] >= 1) {
            smallestChair = i;
            break;
        }
    }

    return smallestChair;
  }

    public static void main(String[] args) {
        int[][] times = {{5, 6}, {6, 7}, {5, 5}, {1, 2}, {0, 1}};
        int targetFriend = 3;
        int res = smallestChair(times, targetFriend);
        System.out.println(res);
    }

    /*Test cases:
    
    4
    3
    9
    0
    0
    
    */
}



    // Another solution 
    public static int smallestChair1(int[][] times, int targetFriend) {
        
    //     int[] arr = new int[times.length];
    //     for (int i = 0; i < times.length; i++) {
    //         int arrival = times[i][0];
    //         int leaving = times[i][1];
    //         arr[arrival]++;
    //         arr[leaving]--;
    //     }

    //     int cnt = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         cnt += arr[i];
    //         if (cnt - 1 == targetFriend)
    //             return i;
    //     }

    //     return 0;

        int[] arr = new int[times[times.length - 1][1] + 1];
        for (int i = 0; i < times.length; i++) {
            arr[times[i][0]]++;
            arr[times[i][1]]--;
        }
        int smallestChair = 0;
        int cnt = 0;
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            cnt += arr[i];
            if (cnt == targetFriend)
                smallestChair = i;
        }
        return smallestChair;
    }
}
}