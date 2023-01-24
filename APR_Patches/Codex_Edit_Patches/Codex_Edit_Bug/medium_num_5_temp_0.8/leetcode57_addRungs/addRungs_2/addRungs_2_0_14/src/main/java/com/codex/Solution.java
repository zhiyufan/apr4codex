package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        int add = 0;
        for (int i = 1; i < rungs.length; ) {
            if (rungs[i] - rungs[i - 1] > dist) {
                add += rungs[i] - rungs[i - 1] - dist;
                rungs[i] = rungs[i - 1] + dist;
            } else {
                i++;
            }
        }
        return add;
    }

    private static int[] readRungs(Scanner scanner) {
        int size = scanner.nextInt();
        int[] rungs = new int[size + 1];
        for (int i = 1; i < rungs.length; i++) {
            rungs[i] = scanner.nextInt();
        }
        scanner.close();
        return rungs;
    }
}