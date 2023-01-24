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
                    char[] c = new char[chars.length - 1];
                    int j = 0;
                    for(int k = 0; k < chars.length; k++) {
                        if(k == i) {
                            continue;
                        }
                        c[j] = chars[k];
                        j++;
                    }
                    ++alice;                   
                    return winnerOfGame(new String(c));
                } else if(chars[i] == 'B' && chars[i - 1] == 'B' && chars[i + 1] == 'B') {
                    ++bob;
                    char[] c = new char[chars.length - 1];
                    int j = 0;
                    for(int k = 0; k < chars.length; k++) {
                        if(k == i) {
                            continue;
                        }
                        c[j] = chars[k];
                        j++;
                    }
                    return winnerOfGame(new String(c));
                }
            }
        }
        return alice > bob;
    }

    
}