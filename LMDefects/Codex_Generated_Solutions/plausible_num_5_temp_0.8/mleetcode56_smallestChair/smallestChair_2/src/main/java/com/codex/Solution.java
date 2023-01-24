package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        /** There is a party where n friends numbered from 0 to n - 1 are attending. There is an infinite number of chairs in this party that are numbered from 0 to infinity. When a friend arrives at the party, they sit on the unoccupied chair with the smallest number.
         * For example, if chairs 0, 1, and 5 are occupied when a friend comes, they will sit on chair number 2.
         * When a friend leaves the party, their chair becomes unoccupied at the moment they leave. If another friend arrives at that same moment, they can sit in that chair.
         * You are given a 0-indexed 2D integer array times where times[i] = [arrivali, leavingi], indicating the arrival and leaving times of the ith friend respectively, and an integer targetFriend. All arrival times are distinct.
         * Return the chair number that the friend numbered targetFriend will sit on.
         */
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

    }