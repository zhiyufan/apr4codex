package com.codex;

import java.util.*;

public class Solution {
public static int addRungs(int[] rungs, int dist) {
        // dist is the gap between rungs
        int add = 0;
        for (int i = 1; i < rungs.length;) {
            if (rungs[i] - rungs[i - 1] > dist) { //check if gap is larger than distance
                add++;
                rungs[i] = rungs[i - 1] + dist; //add rungs
            }
            else {
                i++;
            }
        }
        return add;
    }
}