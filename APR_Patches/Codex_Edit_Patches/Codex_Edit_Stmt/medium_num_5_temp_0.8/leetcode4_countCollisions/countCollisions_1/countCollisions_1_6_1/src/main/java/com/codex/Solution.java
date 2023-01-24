package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String str = "s";
        countCollisions(str);
    }
    
    public static int countCollisions(String directions) {
        char[] chars = directions.toCharArray();
        
        // if string is empty, return 0
        if (chars.length == 0) {
            return 0;
        }
        int result = 0;
        
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (i == j) {
                    continue;        // continue to the while loop
                }
                
                // check the duplicate of SSSSS...
                if (chars[i] == 'S' && chars[j] == 'S') {
                    result++;
                
                // check the combination of LR and RL
                } else if (chars[i] == 'L' && chars[j] == 'R') {
                    result++;
                    
                // check the duplicate of RRRRR...
                } else if (chars[i] == 'R' && chars[j] == 'L') {
                    result += 2;
                }
            }
        }
        return result;
    }
}