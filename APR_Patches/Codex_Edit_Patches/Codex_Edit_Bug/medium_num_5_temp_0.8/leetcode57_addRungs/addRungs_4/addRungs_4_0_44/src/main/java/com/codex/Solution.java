package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist, int from, int to) {
        
        int rungsAdded = 0;
        int currReach = rungs[from] + dist;
        for (int i = from + 1; i <= to; i++) {
            if (rungs[i] > currReach) {
                rungsAdded++;
                currReach = rungs[i] + dist;
            }
        }
        if(rungs[to] > currReach) {
            rungsAdded++;
        }
        return rungsAdded;
    }

    public static int addRungsRec(int[] rungs, int dist, int curr, int to) {
        if(curr == to) {
            if(rungs[to] <= rungs[curr - 1] + dist) {
                return 0;
            } else {
                return 1;
            }
        }

        if(rungs[curr] <= rungs[curr - 1] + dist) {
            return addRungsRec(rungs, dist, curr + 1, to);
        } else {
            int rungsAdded = 1 + addRungsRec(rungs, dist, curr + 1, to);
            int newReach = rungs[curr] + dist;
            int firstUp = -1;
            while(curr < to && rungs[curr] <= newReach) {
                if(rungs[curr] > rungs[curr - 1] + dist) {
                    if(firstUp == -1) {
                        firstUp = curr;
                    }
                    rungsAdded = Math.min(rungsAdded, 1 + addRungsRec(rungs, dist, curr + 1, to));
                }
                curr++;
            }
            if(firstUp == -1) {
                firstUp = curr;
            }
            if(curr == to && rungs[curr] > newReach) {
                rungsAdded = Math.min(rungsAdded, 1 + addRungsRec(rungs, dist, curr + 1, to));
            }
            rungsAdded = Math.min(rungsAdded, addRungsRec(rungs, dist, firstUp, to));
            return rungsAdded;
        }
    }

    public static int addRungsRec(int[] rungs, int dist, int curr) {
        return addRungsRec(rungs, dist, curr, rungs.length - 1);
    }
}