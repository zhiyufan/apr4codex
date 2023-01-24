package com.codex;

import java.util.*;

public class Solution {
public class Solution {

    public static int getMostStones(int[] stones, int capacity) {
        if (stones == null || stones.length == 0) return 0;
        
        Arrays.sort(stones);
        int left = 0;
        int right = stones[stones.length - 1];
        while (left <= right) {
            if (canMove(stones, capacity, (left + right) / 2)) {
                left = (left + right) / 2 + 1;
            } else {
                right = (left + right) / 2 - 1;
            }
        }
        return right + 1;
    }

    private static boolean canMove(int[] stones, int capacity, int weight) {
        int count = 0, i = 0;
        while (i < stones.length && count <= capacity) {
            if (stones[i++] <= weight) count++;
        }
        return count <= capacity;
    }

}
}