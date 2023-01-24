package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        
        int alice = 0, bob = 0;
        int n = colors.length();
        for(int i = 0; i < n; i++) {
            
            if(i == 0 || i == n - 1) {
                
                if(colors.charAt(i) == 'A') {
                    alice++;
                }
                
            } else {
                if(colors.charAt(i) == 'A' && colors.charAt(i - 1) == 'A' && colors.charAt(i + 1) == 'A') {
                    alice++;
                } else if(colors.charAt(i) == 'B' && colors.charAt(i - 1) == 'B' && colors.charAt(i + 1) == 'B') {
                    bob++;
                }
            }
        }
        
        return alice > bob;
    }

    
}