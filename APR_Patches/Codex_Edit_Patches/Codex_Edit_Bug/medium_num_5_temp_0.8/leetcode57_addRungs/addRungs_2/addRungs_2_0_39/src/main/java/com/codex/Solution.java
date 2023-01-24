package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        
        int nbAdd = 0;
        int max = 0;
        for (int i = 0; i < rungs.length; i++) {
        	if (rungs[i] - max > dist) {
        		nbAdd++;
        		max += dist;
        	} else {
        		max = rungs[i];
        	}
        }
        return nbAdd;
    }
}