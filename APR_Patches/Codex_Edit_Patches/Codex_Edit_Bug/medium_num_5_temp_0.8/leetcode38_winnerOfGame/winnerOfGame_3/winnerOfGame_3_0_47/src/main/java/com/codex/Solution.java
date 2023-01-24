package com.codex;

import java.util.*;

public class Solution {
public static boolean winnerOfGame(String colors) {
        boolean isWinner;
        int alice = 0;
        int bob = 0;
        char[] chars = colors.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if(i > 0 && i < chars.length - 1 && chars[i - 1] == chars[i + 1]) {
                continue;
            }
            if(chars[i] == 'A') {
                ++alice;
            }
        }
        return alice > bob;
    }

    
}