package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] a = {0, 4, 5};
        System.out.println(addRungs(a, 10));

    }

    public static int addRungs(int[] rungs, int dist) {
        
        int rungsAdded = 0;
        int currReach = rungs[0];
        for (int i = 0; i < rungs.length; i++) {
            if (rungs[i] > currReach) {
                rungsAdded++;
                currReach = rungs[i] + dist;
            }
        }
        return rungsAdded;
    }
}