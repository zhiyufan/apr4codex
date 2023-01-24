package com.codex;

import java.util.*;

public class Solution {
public class Rungs {

    public static void main(String[] args) {
        System.out.println(addRungs(new int[] {1, 4, 5, 9}, 2));
    }

    public static int addRungs(int[] rungs, int maxReach) {
        int currReach = 0;
        int rungsAdded = 0;        
        for (int i = 1; i < rungs.length; i++) {
            if (rungs[i] > currReach + maxReach) {
                rungsAdded++;
                currReach = rungs[i - 1] + maxReach;
            }
        }
        return rungsAdded;        
    }

}
}