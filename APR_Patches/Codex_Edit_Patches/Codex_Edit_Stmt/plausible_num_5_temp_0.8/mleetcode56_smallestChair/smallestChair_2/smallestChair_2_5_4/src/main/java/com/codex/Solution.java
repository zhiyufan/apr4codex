package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        
        int[][] people = new int[times.length][2];
        for (int i = 0; i < times.length; i++) {
            people[i][0] = times[i][0];
            people[i][1] = times[i][1];
        }
        Arrays.sort(people, (a, b) -> {
            if (a[0] != b[0]) { 
                return b[0] - a[0];
            } else {
                return  a[1] - b[1];
            }
        });
        int start = 0;
        int end = people.length-1;
        while (start + 1 < end) {
            int mid = start + (end - start)/2;
            if (people[mid][0] > targetFriend) end = mid;
            else start = mid;
        } 
        if (people[end][0] <= targetFriend) return end;
        if (people[start][0] <= targetFriend) return start;
        return -1;        
    }
}