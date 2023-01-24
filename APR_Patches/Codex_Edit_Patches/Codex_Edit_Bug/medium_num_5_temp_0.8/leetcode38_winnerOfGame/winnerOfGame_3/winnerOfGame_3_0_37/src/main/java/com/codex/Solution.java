package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        
        int alice = 0;
        int bob = 0;
        char[] chars = colors.toCharArray();
        for(int i = 1; i < chars.length - 1; i++) {
            if(chars[i] == 'A' && chars[i - 1] == 'A' && chars[i + 1] == 'A') {
                ++alice;
            } else if(chars[i] == 'B' && chars[i - 1] == 'B' && chars[i + 1] == 'B') {
                ++bob;
            }
        }
        if(chars[0] == 'A') {
            ++alice;
        }
        if(chars[colors.length() - 1] == 'A') {
            ++alice;
        }

        return alice > bob;
    }

    
}