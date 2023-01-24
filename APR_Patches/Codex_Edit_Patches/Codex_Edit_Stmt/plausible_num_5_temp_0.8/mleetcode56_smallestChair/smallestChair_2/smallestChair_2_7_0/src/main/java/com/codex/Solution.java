package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        int[][] people = times.clone();
        Arrays.sort(people, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            } else {
                return b[1] - a[1];
            }
        });
        for (int i = 0; i < people.length; i++) {
            if (people[i][0] <= targetFriend && people[i][1] >= people[i][0]) {
                return i;
            }
        }
        return -1;
    }
}