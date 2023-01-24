package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        
        if (colors == null || colors.length() == 0) {
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
        if (colors == null || colors.length() == 0) {
            return false;
        } else if (colors.length() == 1) {
            return true;
        }

    }
}