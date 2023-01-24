package com.codex;

import java.util.*;

public class Solution {
        
    public static boolean winnerOfGame(String colors) {
        if (colors.length() == 0) {
            return false;
        } else if (colors.length() == 1) {
            return true;
        } else if (colors.charAt(0) == 'B' || colors.charAt(colors.length() - 1) == 'B') {
            return false;
        } else {
            return isWinningPossibility(colors);
        }
    }

    private static boolean isWinningPossibility(String colors) {

        StringBuilder sb = new StringBuilder(colors);
        boolean hasShrunk = false;
        for (int i = 1; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == 'B') {
                if (sb.charAt(i - 1) == sb.charAt(i + 1)) {
                    sb.deleteCharAt(i);
                    hasShrunk = true;
                    break;
                }
            }
        }
        return isWinningPossibility(sb.toString());
    }
}