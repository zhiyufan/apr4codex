package com.codex;

import java.util.*;

public class Solution {
public static int smallestChair(int[][] times, int targetFriend) {
    
    int currMax = 0;
    for (int[] time : times) {
        currMax = Math.max(currMax, time[0]);
        currMax = Math.max(currMax, time[1]);
    }
    int[] chairs = new int[currMax+1];
    for (int[] time : times) {
        for (int i = time[0]; i < time[1]; i++) chairs[i]++;
    }
    for (int i = 0; i < chairs.length; i++) {
        if (chairs[i] == targetFriend) return i;
    }
    return -1;
}


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter test case: ");
    int[][] times = new int[sc.nextInt()][2];
    for (int i = 0; i < times.length; i++) {
        for (int j = 0; j < 2; j++) {
            times[i][j] = sc.nextInt();
        }
    }
    }
    System.out.print("Enter target friend: ");
    int targetFriend = sc.nextInt();
    System.out.println("Smallest chair for frind: " + smallestChair(times, targetFriend));
}


    
}