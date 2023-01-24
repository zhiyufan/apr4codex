package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();
        int[] rungs = new int[tests];
        for (int i = 0; i < tests; i++) {
            int dist = scanner.nextInt();
            int rungsCount = scanner.nextInt();
            for (int j = 0; j < rungsCount; j++) {
                rungs[j] = scanner.nextInt();
            }
            System.out.println(addRungs(rungs, dist));
        }
        scanner.close();
    }

    public static int addRungs(int[] rungs, int dist) {
        
        int rungsCount = 1;
        int maxReach = rungs[0];
        if (rungs.length == 1) {
            return 0;
        }
        for (int i = 1; i < rungs.length; i++) {
            if (rungs[i] > maxReach + dist) {
                rungsCount++;
                if (i < 2) {
                    maxReach = rungs[i - 1] + dist;
                } else {
                    maxReach = rungs[i - 2] + dist;
                }
            }
        }
        return rungsCount;
    }

}
    
}