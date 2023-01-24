package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class Main {

    public static int minMoves(int target, int maxDoubles) {
        int[][] dp = new int[target + 1][maxDoubles + 1];
        int[] two = new int[target + 1];
        two[0] = 0;
        for (int i = 1; i < target + 1; i++) {
            two[i] = two[i - 1] + 1;
            if (i % 2 != 0) {
                two[i] = Integer.MAX_VALUE;
            }
            moves++;
        }
        return moves;
    }

    
}