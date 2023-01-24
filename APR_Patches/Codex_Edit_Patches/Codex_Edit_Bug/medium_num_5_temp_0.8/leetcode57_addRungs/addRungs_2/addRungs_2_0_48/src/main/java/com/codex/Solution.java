package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        
        int add = 0; //the count of added rungs
        for (int i = 1; i < rungs.length; ) { //traversing the rungs
            if (rungs[i] - rungs[i - 1] > dist) { //if the distance between the rungs is greater than the distance that the
                                                 //frog can jump
                add++; //add a rung to the count
                rungs[i] = rungs[i - 1] + dist; //set the rung at index i to the rung at index i-1 plus the distance
            } else {
                i++; //go to the next rung
            }
        }
        return add; //return the number of rungs added
    }

    
}