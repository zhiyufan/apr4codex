package com.codex;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        System.out.println(winnerOfGame("ABABABABABABABABABAB"));
        System.out.println(winnerOfGame("BBBAAABBAAABBB"));
        System.out.println(winnerOfGame("BAAAAAAAAABBBB"));
    }

    public static boolean winnerOfGame(String colors) {
        int alice = 0;
        int bob = 0;
        boolean aliceNow = true;
        boolean bobNow = true;

        for (int i = 0; i < colors.length() - 1; i++) {
            if (colors.charAt(i) == 'A') {
                aliceNow = false;
            } else {
                bobNow = false;
            }
            if (i > 0 && colors.charAt(i) == 'A' && colors.charAt(i - 1) == 'A' && colors.charAt(i + 1) == 'A') {
                alice++;
                aliceNow = true;
            } else if (i > 0 && colors.charAt(i) == 'B' && colors.charAt(i - 1) == 'B' && colors.charAt(i + 1) == 'B') {
                bob++;
                bobNow = true;
            }
        }
        if (bobNow) {
            bob++;
        } else if (aliceNow) {
            alice++;
        }

        return alice > bob;
    }
}