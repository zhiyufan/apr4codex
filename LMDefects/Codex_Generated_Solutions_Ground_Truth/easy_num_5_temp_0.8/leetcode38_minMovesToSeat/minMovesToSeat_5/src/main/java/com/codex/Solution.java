package com.codex;

import java.util.*;

public class Solution {
    public static int minMovesToSeat(int[] seats, int[] students) {
        /** There are n seats and n students in a room. You are given an array seats of length n, where seats[i] is the position of the ith seat. You are also given the array students of length n, where students[j] is the position of the jth student.
         * You may perform the following move any number of times:
         * Increase or decrease the position of the ith student by 1 (i.e., moving the ith student from position x to x + 1 or x - 1)
         * Return the minimum number of moves required to move each student to a seat such that no two students are in the same seat.
         * Note that there may be multiple seats or students in the same position at the beginning.
         */

        int ans = 0;
        Queue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(k -> k[1]));
        for (int i = 0; i < students.length; i++) {
            queue.add(new int[]{students[i], Math.abs(seats[i] - students[i])});
        }
        while (!queue.isEmpty()) {
            int[] student = queue.poll();
            ans += student[1];
            for (int i = 0; i < seats.length; i++) {
                if (seats[i] < student[0]) {
                    seats[i]++;
                    queue.add(new int[]{student[0], Math.abs(seats[i] - student[0])});
                } else if (seats[i] > student[0]) {
                    seats[i]--;
                    queue.add(new int[]{student[0], Math.abs(seats[i] - student[0])});
                }
            }
        }
        return ans;
    }

}