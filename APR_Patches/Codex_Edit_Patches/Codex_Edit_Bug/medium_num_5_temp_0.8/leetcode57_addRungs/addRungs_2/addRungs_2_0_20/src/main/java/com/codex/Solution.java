package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int noTestCases = in.nextInt();
        for (int i = 0; i < noTestCases; i++) {
            int noRungs = in.nextInt();
            int dist = in.nextInt();

            int[] rungs = new int[noRungs];
            for (int j = 0; j < noRungs; j++) {
                rungs[j] = in.nextInt();
            }
            System.out.println(addRungs(rungs, dist));
        }
    }


    public static int addRungs(int[] rungs, int dist) {
        if (rungs.length == 0) return 0;
        if (rungs.length == 1) return dist - rungs[0];
        int result = 0;
        for (int i = 1; i < rungs.length; i++) {
            if (rungs[i] - rungs[i - 1] <= dist) continue;
            int gap = rungs[i] - rungs[i - 1];
            rungs[i] = rungs[i] - gap;
            result += gap - dist;
        }
        return result;
    }
}
}