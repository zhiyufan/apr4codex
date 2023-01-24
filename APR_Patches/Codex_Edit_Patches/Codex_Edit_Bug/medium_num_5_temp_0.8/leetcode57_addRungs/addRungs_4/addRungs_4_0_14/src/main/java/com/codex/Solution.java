package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;


public class Solution {

    public static int addRungs(int[] rungs, int dist) {
        
        int rungsAdded = 0;
        int currReach = rungs[0] + dist;
        for (int i = 1; i < rungs.length; i++) {
            if (rungs[i] > currReach) {
                rungsAdded++;
                currReach = rungs[i] + dist;
            }
        }
        return rungsAdded;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numCases = scan.nextInt();

        while (numCases-- > 0) {
            int length = scan.nextInt();
            int[] rungs = new int[length];

            for (int i = 0; i < length; i++) {
                rungs[i] = scan.nextInt();
            }
            int dist = scan.nextInt();
            System.out.println(addRungs(rungs, dist));
        }
        scan.close();
    }
}
}