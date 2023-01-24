package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        
        int rungsAdded = 0;
        int currReach = rungs[0];
        int maxReach = rungs[0];
        boolean climbRungs = false;
        boolean needToClimb = false;
        boolean needToAddRung = false;
        for (int i = 1; i < rungs.length; i++) {
            int nextRung = rungs[i];
            if (needToAddRung) {
                rungsAdded++;
                currReach = nextRung;
            } else if (needToClimb) {
                climbRungs = true;
            } else if (currReach != nextRung) {
                if (nextRung < currReach) {
                    if (nextRung > maxReach) {
                        maxReach = nextRung;
                    }
                    needToClimb = true;
                } else if ((nextRung - currReach) > dist) {
                    needToAddRung = true;
                } else {
                    needToClimb = true;
                }
            }
            
        }
        if (climbRungs) {
            rungsAdded++;
        }
        return rungsAdded;
    }

    
}