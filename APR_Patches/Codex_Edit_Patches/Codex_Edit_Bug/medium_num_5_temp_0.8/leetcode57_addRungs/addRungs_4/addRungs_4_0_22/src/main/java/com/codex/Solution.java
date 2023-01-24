package com.codex;

import java.util.*;

public class Solution {

public class Main {

    public static void main(String[] args) {

        int[] rungs = {5, 10, 50, 100};
        int ladderLength = 6;
        int rungsAdded = 0;
        int ladderReach = rungs[0] + ladderLength;
        for (int i = 1; i < rungs.length; i++) {

            if (rungs[i] > ladderReach) {
                System.out.println("Next Rung " + rungs[i] + " Too far");
                rungsAdded++;
                ladderReach = rungs[i] + ladderLength;
                System.out.println("New ladderReach " + ladderReach);
                System.out.println("Rungs added so far " + rungsAdded);
            } else {
                System.out.println("No need to add. Ladder Reach is " + ladderReach + " and next rung is " + rungs[i]);
            }

        }

        System.out.println("Final Rungs added " + rungsAdded);
    }   
}

    
}