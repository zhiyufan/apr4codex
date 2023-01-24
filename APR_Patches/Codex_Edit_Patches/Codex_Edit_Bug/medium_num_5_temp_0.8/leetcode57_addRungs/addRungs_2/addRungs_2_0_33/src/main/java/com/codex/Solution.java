package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        
        int add = 0;
        for (int i = 1; i < rungs.length; ) {
            if (rungs[i] - rungs[i - 1] > dist) {
                add++;
                rungs[i] = rungs[i - 1] + dist;
            } else {
                i++;
            }
        }
        return add;
    }
    public static void main(String args[]) {
        int[] rungs = { 4, 2, 6, 11 };
        System.out.println(addRungs(rungs, 10));
    }

    
}