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


        int[] arr = new int[times.length];
        for (int i = 0; i < times.length; i++) {
            int arrival = times[i][0];
            int leaving = times[i][1];
            arr[arrival]++;
            arr[leaving]--;
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            cnt += arr[i];
            if (cnt - 1 == targetFriend)
                return i;
        }

        return 0;
    }}