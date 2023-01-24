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
            } else if(chars[i] == 'B') {
                ++bob;
            }
        } else {
            if(chars[i] == 'A') {
                ++alice;
            } else if(chars[i] == 'B') {
                ++bob;
            }
            if(chars[i] == 'A' && chars[i - 1] == 'A' && chars[i + 1] == 'A') {
                ++alice;
            } else if(chars[i] == 'B' && chars[i - 1] == 'B' && chars[i + 1] == 'B') {
                ++bob;
            }
        }
        }
    return alice > bob;
    }

    public static void main(String[] args)
    {
        System.out.println(winnerOfGame("AB"));//false
        System.out.println(winnerOfGame("ABAB"));//true
        System.out.println(winnerOfGame("ABABAB"));//true
        System.out.println(winnerOfGame("ABBBBBBAA"));//false
        System.out.println(winnerOfGame("ABABABABAB"));//true
        System.out.println(winnerOfGame("BABABABABA"));//false
        System.out.println(winnerOfGame("ABABBABAB"));//true
        System.out.println(winnerOfGame("BBBBBBBBBBBBBBBBA"));//false
    }
}
}