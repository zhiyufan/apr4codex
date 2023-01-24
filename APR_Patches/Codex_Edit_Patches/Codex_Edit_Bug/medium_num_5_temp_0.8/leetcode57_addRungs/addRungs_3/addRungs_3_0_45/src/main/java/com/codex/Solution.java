package com.codex;

import java.util.*;

public class Solution {
public class Main {

    public static void main(String[] args) {
        int []arr = {
                1,
                4,
                5,
                9
        };
        System.out.println(addRungs(arr,10));
    }

    public static int addRungs(int[] rungs, int dist) {

        int rungsCount = 0;

        int candidates = 0;
        int maxReach = 0;

        for (int i = 0; i < rungs.length - 1; i++) {
            candidates += rungs[i] - maxReach;
            maxReach = rungs[i];
            if (candidates > dist){
                rungsCount++;
                candidates -= dist;
            }
        }

        return rungsCount;
    }

}
}