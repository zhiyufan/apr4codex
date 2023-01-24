package com.codex;

import java.util.*;

public class Solution {
/*
Given a target number and an integer array A sorted in ascending order, find the index i in A such that A[i] is closest to the given target.
Return -1 if there is no element in the array.

Have you met this question in a real interview? Yes
Example
Given [1, 2, 3] and target = 2, return 1.

Given [1, 4, 6] and target = 3, return 1.

Given [1, 4, 6] and target = 5, return 1 or 2.

Given [1, 3, 3, 4] and target = 2, return 0 or 1 or 2.

Note
There can be duplicate elements in the array, and we can return any of the indices with same value.

Challenge
O(logn) time complexity.
*/

    public int closestNumber(int[] A, int target) {
        if(A == null || A.length == 0) {
            return -1;
        }
        int start = 0, end = A.length - 1;
        while(start < end - 1) {
            int mid = start + (end - start) / 2;
            if(A[mid] == target) {
                end = mid;
            } else if(A[mid] > target) {
                end = mid;
            } else {
                start = mid;
            }
        }
        if(A[start] == target) {
            return start;
        }
        if(A[end] == target) {
            return end;
        }
        if(target - A[start] > A[end] - target) {
            return end;
        } else {
            return start;
        }
    }
}


        Set<Long> visited = new HashSet<>();
        Queue<Long> q = new LinkedList<>();
        int numMoves = 0;
        q.offer(1L);
        while (!q.isEmpty()) {
            int qSize = q.size();
            for (int i = 0; i < qSize; i++) {
                long cur = q.poll();
                if (cur == target) {
                    return numMoves;
                }
                if (!visited.contains(cur + 1) && (cur + 1) <= target) {
                    visited.add(cur + 1);
                    q.offer(cur + 1);
                }
                if (numMoves < maxDoubles && !visited.contains(cur * 2) && (cur * 2) <= target) {
                    visited.add(cur * 2);
                    q.offer(cur * 2);
                }
            }
            numMoves++;
        }
        return -1;
}