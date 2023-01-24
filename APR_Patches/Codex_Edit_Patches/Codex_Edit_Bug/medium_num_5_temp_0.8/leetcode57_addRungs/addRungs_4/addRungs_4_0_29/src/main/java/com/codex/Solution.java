package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        Array.sort(rungs);
               
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
        System.out.println(addRungs(new int[] { 4, 6, 8, 12 }, 10));
    }
}