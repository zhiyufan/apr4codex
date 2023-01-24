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
                } else if(chars[i] == 'B' && chars[i - 1] == 'B' && chars[i + 1] == 'B') {
                    ++bob;
                }
            }
        }
        return alice > bob;
    }
    public static String[] getSimilarNames(String[] names) {
        String[] result = new String[names.length];
        for(int i = 0; i < names.length; i++) {
            result[i] = names[i].replaceAll("[^a-zA-Z ]", "").replaceAll(",","").replaceAll("^ +| +$|( )+", "$1");
        }
        return result;
    }
}