package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        
        char[] arr = colors.toCharArray();
        int AA = 0, BB = 0;
        for(char c : arr) {
            if(c=='A') {
                AA++;
            }
            else
                BB++;
        }
        if(AA>BB) {
            return true;
        }
        return false;
    }
    
}