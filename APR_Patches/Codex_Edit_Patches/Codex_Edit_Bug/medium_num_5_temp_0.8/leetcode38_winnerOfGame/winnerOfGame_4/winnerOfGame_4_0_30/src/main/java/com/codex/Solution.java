package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        
        if (colors.length() == 0) {
            return false;
        } else if (colors.length() == 1) {
            return true;
        } else if (colors.charAt(0) == 'R' || colors.charAt(colors.length() - 1) == 'R') {
            return isWinningPossibility(colors);
        }
    }

    private static boolean isWinningPossibility(String colors) {
        if (colors.length() == 0) {
            return false;
        } else if (colors.length() == 1) {
            return true;
        } else if (colors.charAt(0) == 'R' || colors.charAt(colors.length() - 1) == 'R') {
        }

        StringBuilder sb = new StringBuilder(colors);
        int index = 0;
        while (index < sb.length() - 2) {
            char start = sb.charAt(index);
            char mid = sb.charAt(index + 1);
            char end = sb.charAt(index + 2); 
            if (start == mid) {
                deleteElements(sb, index, index + 2);
                index = index - 1;
            } else if (mid == end) {
                deleteElements(sb, index + 1, index + 2);
                index = index - 1;
            } else {
                index = index + 1;
            }
        }

    private static void deleteElements(StringBuilder sb, int index1, int index2) {
        if (sb.charAt(index1) != 'B') {
            sb.deleteCharAt(index1);
            sb.deleteCharAt(index2 - 1);
        } else if (sb.charAt(index2) != 'B') {
            sb.deleteCharAt(index2);
            sb.deleteCharAt(index1);
        }
    }
        return isWinningPossibility(sb.toString());
    }
}