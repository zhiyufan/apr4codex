package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        
        int alice = 0;
        int bob = 0;
        char[] chars = colors.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if(i == 0 || i == chars.length - 1) {
                if(chars[i] == 'A') {
                    ++alice;
                }
            } else {
                if(chars[i] == 'A' && chars[i - 1] == 'A' && chars[i + 1] == 'A') {
                    ++alice;
                } else if((chars[i] == 'B') && (i == 1 || chars[i - 2] != 'B') && (i == chars.length - 2 || chars[i + 2] != 'B')) {
                    ++bob;
                }
            }
        }
        return alice > bob;
    }

    
}