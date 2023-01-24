package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] rungs = new int[n];
        for (int i = 0; i < n; i++) {
            rungs[i] = scanner.nextInt();
        }

        int dist = scanner.nextInt();
        int result = addRungs(rungs, dist);
        System.out.println(result);
    }

    protected static int addRungs(int[] rungs, int dist) {

        int count = 1;
        int currentPos = 0;
        for (int i = 1; i < rungs.length; i++) {
            if (rungs[i] - currentPos > dist) {
                count++;
                currentPos = currentPos + dist;
            } else if (rungs[i] - currentPos <= dist) {
                currentPos = rungs[i];
            }
        }
        return count;
    }

}
}