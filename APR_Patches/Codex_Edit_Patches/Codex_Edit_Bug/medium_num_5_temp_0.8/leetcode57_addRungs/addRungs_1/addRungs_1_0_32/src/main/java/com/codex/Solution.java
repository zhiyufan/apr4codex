package com.codex;

import java.util.*;

public class Solution {
int maxDist = rungs[1] - 0;
        System.out.println("Max distance: " + maxDist);
        for (int i = 2; i < rungs.length; i++) {
            if (rungs[i] - rungs[i - 1] > maxDist) {
                maxDist = rungs[i] - rungs[i - 1];
            }
           
}