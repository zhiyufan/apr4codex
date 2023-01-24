package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        boolean[][] chairs = new boolean[100][100];
        for (int[] time : times) chairs[time[0]][time[1]] = true;
        for (int i = 0; i < 100; i++) for (int j = 0; j < 100; j++) if (chairs[i][j]) chairs[i][j] = !helper(chairs, i, j);
        for (int i = 0; i < 100; i++) for (int j = 0; j < 100; j++) if (chairs[i][j]) if (chairs[i][j] && targetFriend == 1) return i; else targetFriend--;
        return -1; 
    }

    private boolean helper(boolean[][] chairs, int i, int j) {
        if (i == 0) return false;
        return chairs[i-1][j];
    }
}
}