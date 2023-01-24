package com.codex;

import java.util.*;

public class Solution {
class Solution {
    
    public static boolean winnerOfGame(int n) {
        if (n == 1) {
            return false;
        }
        
        return winGame(n);
    }
    
    private static boolean winGame(int n) {
        
        if (n == 1) {
            return false;
        }
        
        // player 2 take 1
        if (!winGame(n - 1)) {
            return true;
        }
        
        // player 2 take 2
        if (n > 2 && !winGame(n - 2)) {
            return true;
        }
        
        // player 2 take 3
        if (n > 3 && !winGame(n - 3)) {
            return true;
        }
        
        return false;
    }
    
    public static boolean winnerOfGameArray(String colors) {
        
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
        if (colors.length() == 0) {
            return false;
        } else if (colors.length() == 1) {
            return true;
        } else if (colors.charAt(0) == 'B' || colors.charAt(colors.length() - 1) == 'B') {
            return false;
        }

        StringBuilder sb = new StringBuilder(colors);
        int index = 0;
        while (index + 2 < sb.length()) {
            char start = sb.charAt(index);
            char mid = sb.charAt(index + 1);
            char end = sb.charAt(index + 2);
            if (start == mid && mid == end) {
                sb.deleteCharAt(index + 1);
                index = index + 1;
            } else {
                index++;
            }
        }
    
}
        return isWinningPossibility(sb.toString());
    }
}