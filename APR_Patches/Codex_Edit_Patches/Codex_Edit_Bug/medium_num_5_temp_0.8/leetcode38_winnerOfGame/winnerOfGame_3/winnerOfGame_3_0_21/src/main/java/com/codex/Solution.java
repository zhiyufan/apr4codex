package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        
        int alice = 0;
        int bob = 0;
        char[] chars = colors.trim().toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if(i != 0 && chars[i] == chars[i - 1]) {
                continue;
            }
            if(i == 0 || i == chars.length - 1) {
                if(chars[i] == 'A') {
                    ++alice;
                }
            } else {
                if(chars[i] == 'A' && chars[i - 1] == 'A' && chars[i + 1] == 'A') {
                    ++alice;
                } else if(chars[i] == 'B' && chars[i - 1] == 'B' && chars[i + 1] == 'B') {
                    ++bob;
                }
            }
        }
        System.out.println("Alice score: " + alice);
        System.out.println("Bob score: " + bob);
        return alice > bob;
    }

    
}