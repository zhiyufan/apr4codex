package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        
        int rungsAdded = 0;
        int currReach = rungs[0] + dist;
        for (int i = 1; i < rungs.length; i++) {
            if (rungs[i] > currReach) {
                rungsAdded++;
                currReach = rungs[i] + dist;
            }
        }
        return rungsAdded;
    }

    
    
    
    
    
    
    
    
    
    
    
    class Solution {
public static void main (String[] args) {
    int[] arr = {4, 4, 4, 4, 5};
    System.out.println(minNumberOfJumps(arr));
    }
    static int minNumberOfJumps (int[] array) {
    	 if (array.length <= 1) {
             return 0;
         }
    int minJumps = 0;
    int currEnd = 0;
    int currFarthest = 0;
    
    // iterate the array
    for (int i = 0; i < array.length - 1; i++) {
        // set the end of current window to the farthest place we can reach based on the current window
        currFarthest = Math.max(currFarthest, array[i] + i);
        // if we reach the current window's end, we need to move to the next window
        if (i == currEnd) {
            minJumps++;
            currEnd = currFarthest;
        }
    }
    // we are at the end of the array when currEnd is at the last index, we dont have to move to the next window
    // so don't add 1 to minJumps
    return minJumps;
    }
    }
    
}