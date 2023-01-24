package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int target, int maxDoubles) {
        
        int moves = 0, counter =0;
         while(true){
             if(target % 2 == 0 && maxDoubles > 0){
                 target = target/2;
                 maxDoubles--;
                 moves++;
                 counter++;
             }
             else{
                 if(target % 2 == 0){
                    target = target/2;
                 }
                 else{
                    counter++;
                    target = target - 1;
                 }
             }
             if(maxDoubles == 0){
                 counter = counter + target;
                 break;
             }
             if(target == 0){
                 break;
             }
        }
        return counter;
    }

    
}