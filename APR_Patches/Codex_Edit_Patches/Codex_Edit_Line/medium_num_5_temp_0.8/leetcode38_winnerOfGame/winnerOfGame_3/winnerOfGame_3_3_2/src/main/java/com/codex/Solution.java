package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        
        int alice = 0;
        int bob = 0;
        char[] chars = colors.toCharArray();
        for(int i = 1; i < chars.length; i++) {
            if(chars[i] == 'A' && chars[i - 1] == 'A' && chars[i + 1] == 'A') {
                    ++alice;
                }
            }
        }
        return alice > bob;
    }

    
}