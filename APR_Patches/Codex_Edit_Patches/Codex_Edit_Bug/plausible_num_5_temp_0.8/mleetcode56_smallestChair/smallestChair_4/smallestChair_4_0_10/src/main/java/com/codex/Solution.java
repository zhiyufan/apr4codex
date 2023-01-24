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


// You are given an array of people arrival and departure, where arrival and departure time are in 24 hour format. 
//The array is sorted by the arrival time. Fill in the smallest chair (or chairs) for each person so that the total wait time is minimum. 
//If multiple smallest chair exist, any chair may be used.
//
// Example 1:
// Input:
// people = [
//    [10.00, 12.00],
//    [10.30, 12.30],
//    [11.00, 12.30]
// ]
// Output:
// [12.30, 10.00]
// Explanation:
// This is best schedule because person 3 is occupying the chair at 12.30 and person 1 is occupying the chair at 10.00.
//
// Example 2:
// Input:
// people = [
//    [10.00, 10.30],
//    [10.30, 11.00],
//    [11.00, 11.30]
// ]
// Output:
// [10.30, 10.00]
// Explanation:
// This is best schedule because person 3 is occupying the chair at 10.30 and person 1 is occupying the chair at 10.00.
//
// Example 3:
// Input:
// people = [
//    [11.30, 12.00],
//    [10.30, 12.00],
//    [11.00, 12.00],
//    [10.30, 11.00],
//    [11.30, 11.00]
// ]
// Output:
// [12.00, 10.30]
// Explanation:
// This is best schedule because person 5 is occupying the chair at 12.00 and person 1 is occupying the chair at 10.30.
//
// Example 4:
// Input:
// people = [
//    [10.30, 11.00],
//    [11.30, 12.00],
//    [10.30, 12.00],
//    [11.00, 12.00],
//    [11.30, 11.00]
// ]
// Output:
// [12.00, 10.30]
// Explanation:
// This is best schedule because person 5 is occupying the chair at 12.00 and person 1 is occupying the chair at 10.30.
//
// Example 5:
// Input:
// people = [
//    [10.00, 11.30],
//    [10.30, 11.00],
//    [11.30, 12.00],
//    [12.00, 12.30],
//    [11.00, 12.30],
//    [11.00, 11.30],
//    [11.30, 12.30]
// ]
// Output:
// [12.30, 10.00]
// Explanation:
// This is best schedule because person 5 is occupying the chair at 12.30 and person 1 is occupying the chair at 10.00.
//
// Example 6:
// Input:
// people = [
//    [10.00, 11.30],
//    [10.30, 11.00],
//    [11.30, 12.00],
//    [12.00, 12.30],
//    [11.00, 12.30],
//    [11.30, 12.30]
// ]
// Output:
// [12.30, 10.00]
// Explanation:
// This is best schedule because person 5 is occupying the chair at 12.30 and person 1 is occupying the chair at 10.00.
//
// Example 7:
// Input:
// people = [
//    [10.30, 11.00],
//    [10.30, 11.30],
//    [10.00, 11.30],
//    [10.30, 12.00],
//    [11.30, 12.00]
// ]
// Output:
// [12.00, 10.00]
// Explanation:
// This is best schedule because person 5 is occupying the chair at 12.00 and person 1 is occupying the chair at 10.00.
//
// Note:
// All arrival and departure times are in 24 hours format.
//

public static int[] smallestChair(int[][] people) {

    // Sort by departure times
    Arrays.sort(people, Comparator.<int[]>comparingInt(p -> p[1]));

    // Find the latest arrival time before current departure time and add it to the result
    List<Integer> result = new ArrayList<>();
    int i = people.length - 1;
    while (i >= 0) {
        int k = i;
        for (int j = i-1; j >= 0; j--) {
            if (people[j][0] <= people[i][1]) {
                k = j;
        }
        result.add(0, people[k][1]);
        i = k - 1;
    }

    return result.stream().mapToInt(Integer::intValue).toArray();
}
}