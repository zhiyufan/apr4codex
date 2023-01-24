package com.codex;

import java.util.*;

public class Solution {


// array of arrival time and leaving time
// target friend, who is the kth frined to sit
public class FriendsChair {
    public static int smallestChair(int[][] time, int targetFriend) {

        int[] timings = new int[100001];

        // split the time up and count how many friends are sitting at each time
        // timings[i] indicates how many friends are sitting at time i
        for (int[] interval : time) {
            timings[interval[0]]++;
            timings[interval[1]]--;
        }

        // current number of friends sitting
        int friendsSitting = 0;
        for (int i = 0; i < timings.length; i++) {
            friendsSitting += timings[i];

            // if number of friends sitting is the target friend, return the time
            if (friendsSitting == targetFriend)
                return i;
        }

        // otherwise return -1
        return -1;
    }

    public static void main(String[] args) {
        int[][] timings = new int[][] {{0, 8}, {2, 5}, {6, 7}, {3, 9}, {2, 4}, {0, 1}, {6, 8}};
        System.out.println(smallestChair(timings, 3)); // expected 6

        timings = new int[][] {{0, 10}};
        System.out.println(smallestChair(timings, 1)); // expected 0

        timings = new int[][] {{0, 10}, {1, 11}};
        System.out.println(smallestChair(timings, 1)); // expected 1

        timings = new int[][] {{0, 10}, {1, 11}};
        System.out.println(smallestChair(timings, 2)); // expected 11

        timings = new int[][] {{0, 10}, {1, 11}, {2, 12}};
        System.out.println(smallestChair(timings, 2)); // expected 2

        timings = new int[][] {{0, 10}, {1, 11}, {2, 12}};
        System.out.println(smallestChair(timings, 3)); // expected 12
    }
}
}