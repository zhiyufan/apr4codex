package com.codex;

import java.util.*;

public class Solution {
//Given a binary string, the task is to print the length of the smallest sub-string having all the same characters.


    public static int minBitFlips(int start, int goal) {
        
        int count = 0;
        int i = 0;
        while (start != goal) {   //until the start and goal are equal
            if ((start & 1) != (goal & 1)) {    //if the last bit of start and goal are not the same
                count++;
                if (i > 0 && start == (goal ^ (1 << i))) {   //if after flipping the i bit makes start equal to goal
                    return -1;
                }
                start ^= 1 << i;  //flip the i bit
            }
            start >>= 1;  //divide start and goal by 2
            goal >>= 1;
            i++;
        }
        return count;
    }

    
}