package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int target, int maxDoubles){
        int res = 0;
        while(target > 0) {
            res += target % 2 == 0 ? (2 * target) : 1;
            target /= 2;
            System.out.println(target);
        }           
        return res;
    }  
}