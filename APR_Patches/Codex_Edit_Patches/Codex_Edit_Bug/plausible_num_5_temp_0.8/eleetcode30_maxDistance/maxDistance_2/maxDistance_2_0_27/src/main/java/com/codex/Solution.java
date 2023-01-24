package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        

        int n = colors.length;
        int maxDist = 0;
        int lastColor = -1;
        int lastColorPos = -1;
        for (int i = 0; i < n; i++) {
            if (colors[i] != lastColor) {
                if (lastColor != -1) {
                    maxDist = Math.max(maxDist, i - lastColorPos);
                }
                lastColor = colors[i];
                lastColorPos = i;
            }
        }
        return maxDist;


    public int maxDistToClosest(int[] seats) {
        int maxDist = 0;
        int last = -1;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                if (last == -1) {
                    maxDist = i;
                } else {
                    maxDist = Math.max(maxDist, (i - last) / 2);
                }
                last = i;
            }
        }
        maxDist = Math.max(maxDist, seats.length - last - 1);
        return maxDist;
    }


    }

    
}