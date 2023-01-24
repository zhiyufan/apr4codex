package com.codex;

import java.util.*;

public class Solution {
public static int addRungs(int[] rungs, int dist) {
        
        int count = 0;
        int max = 0;
        for (int i = 0; i < rungs.length; i++) {
            if (rungs[i] > max) {
                if (rungs[i] - max > dist) {
                    count++;
                    max = max + dist;
                } else if (rungs[i] - max <= dist) {
                    max = rungs[i];
                }
            }
        }

        return count;
    }

    // Test program
    public static void main(String[] args) {
        
        int[] rungs = {4,6,8,12};
        int dist = 5;
        int numberOfRungs = addRungs(rungs, dist);

        System.out.println(numberOfRungs);
    }

    // Solution 2

    public static int addRungs2(int[] rungs, int dist) {
        
        int count = 0;
        int max = 0;
        for (int i = 0; i < rungs.length; i++) {
            if (rungs[i] > max) {
                if (rungs[i] - max > dist) {
                    count++;
                    max = max + dist;
                } else if (rungs[i] - max <= dist) {
                    max = rungs[i];
                }
            }
        }

        return count;
    }





    
}