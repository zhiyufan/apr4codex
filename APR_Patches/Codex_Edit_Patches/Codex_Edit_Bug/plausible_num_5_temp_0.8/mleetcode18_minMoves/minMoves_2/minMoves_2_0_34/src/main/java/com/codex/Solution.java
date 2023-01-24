package com.codex;

import java.util.*;

public class Solution {
public static int minMoves(int target, int maxDoubles) {
    // Write your code here
    // Initialise the result
    int res = 0;
     
    // Loop until target becomes 0
    while(target > 0) {
         
        // If target is odd 
        if(target % 2 == 1) {
             
            // Increment result by 1
            res += 1;
             
            // If target is 1 then break the loop
            if(target == 1)
                break;
             
            // If target is even and maxDoubling occurs then divide the target by 2
        } else if(maxDoubles > 0) {
             
            target /= 2;
             
            // Decrement maxDoubling by 1
            maxDoubles -= 1;
        }
         
        // If target is even and maxDoubling does not occur then decrement the target by 1
        if(target % 2 == 0 && maxDoubles == 0) {
             
            res += 1;
            target -= 1;
        }
    }
     
    // Return the result
    return res;
}
}