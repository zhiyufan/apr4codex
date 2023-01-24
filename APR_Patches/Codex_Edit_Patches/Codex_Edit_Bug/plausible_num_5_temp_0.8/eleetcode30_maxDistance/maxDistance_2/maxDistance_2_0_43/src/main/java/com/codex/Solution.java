package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {


        int n = colors.length;
        int maxDist = 0;
        int lastBlue = -1;
        int lastBluePos = -1;
        for (int i = 0; i < n; i++) {
            if (lastBlue != -1 && colors[i] == 1) {
                maxDist = Math.max(maxDist, i - lastBluePos);
            }

            if (colors[i] == 2) {
                int lastRed = -1;
                int lastRedPos = -1;

                for (int j = i + 1; j < n; j++) {
                    // looking for the red after blue
                    if (colors[j] == 0) {
                        if (lastRed != -1) {
                            maxDist = Math.max(maxDist, j - lastRedPos);
                        }
                        lastRed = colors[j];
                        lastRedPos = j;
                    }

                    if (colors[j] == 1) {
                        maxDist = Math.max(maxDist, j - i);
                        break;
                    }
                }
            } else {
                lastBlue = colors[i];

                lastBluePos = i;
            }
        }
        return maxDist;
    }
}