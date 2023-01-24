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
        int count = 0;
        for (int i = 0; i < people.length && people[i][0] <= targetFriend; i++) {
            if (people[i][1] >= targetFriend) {
                if (count == 0) {
                    return i;
                } else {
                    return i - 1;
                }
            }
            count++;
        }
        for (int i = people.length - 1; i >= 0; i--) {
            if (people[i][0] <= targetFriend && people[i][1] >= targetFriend) {
                return i + 1;
            }
        }
        return -1;
    }
}