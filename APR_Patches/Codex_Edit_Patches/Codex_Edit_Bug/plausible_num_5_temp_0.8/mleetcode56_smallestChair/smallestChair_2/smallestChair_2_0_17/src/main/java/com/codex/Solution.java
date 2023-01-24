package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        
        int[][] people = new int[times.length][2];
        for (int i = 0; i < times.length; i++) {
            people[i] = times[i];
        }
        Arrays.sort(people, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            } else {
                return b[1] - a[1];
            }
        });
        for (int i = 0; i < people.length; i++) {
            if (people[i][0] <= targetFriend && people[i][1] >= targetFriend) {
                return i;
            }
        }
        return -1;
    }

def smallestChair(times, targetFriend):
    people = []
    for i in range(len(times)):
        people.append(times[i])
    people.sort(key = lambda x: x[0])
    people.sort(key = lambda x: x[1], reverse = True)
    for i in range(len(people)):
        if people[i][0] <= targetFriend and people[i][1] >= targetFriend:
            return i
    return -1
    
}