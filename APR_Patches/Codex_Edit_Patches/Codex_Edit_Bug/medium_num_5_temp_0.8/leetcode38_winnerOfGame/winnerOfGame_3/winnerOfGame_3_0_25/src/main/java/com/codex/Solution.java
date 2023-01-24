package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        
        int alice = 0;
        int bob = 0;
        char[] chars = colors.toCharArray();

        for(int i = 0; i < chars.length - 2; i++) {
            if(chars[i] == 'A' && chars[i + 1] == 'A' && chars[i + 2] == 'A') {
                ++alice;
                i += 2;
            } else if(chars[i] == 'B' && chars[i + 1] == 'B' && chars[i + 2] == 'B') {
                ++bob;
                i += 2;
            }
        }
        
        if(chars[chars.length - 1] == 'A' || chars[chars.length - 2] == 'A') {
            ++alice;
        }

        if(chars[0] == 'A' || chars[1] == 'A') {
            ++alice;
        }
        
        return alice >= bob;
    }

    
}