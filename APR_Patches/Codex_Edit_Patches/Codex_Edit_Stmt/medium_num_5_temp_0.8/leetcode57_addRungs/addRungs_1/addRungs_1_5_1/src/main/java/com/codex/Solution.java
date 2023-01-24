package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCasesNumber = scanner.nextInt();
        for (int i = 0; i < testCasesNumber; i++) {
            int rungsCount = scanner.nextInt();
            int[] rungs = new int[rungsCount];
            for (int j = 0; j < rungsCount; j++) {
                rungs[j] = scanner.nextInt();
            }
            int distance = scanner.nextInt();

            System.out.println(addRungs(rungs, distance));
        }

        int count = 0;
        for (int i = 1; i < rungs.length; i++) {
            if (rungs[i] - rungs[i-1] > dist) {
                count++;
            }
        }
        return count;
    }

    
}