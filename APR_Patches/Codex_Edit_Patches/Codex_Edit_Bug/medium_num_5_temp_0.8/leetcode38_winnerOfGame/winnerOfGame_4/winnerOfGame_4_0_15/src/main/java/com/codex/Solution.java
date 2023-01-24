package com.codex;

import java.util.*;

public class Solution {

public class Test {

    public static boolean winnerOfGame(String colors) {

        if (colors.length() == 0) {
            return false;
        } else if (colors.length() == 1) {
            return true;
        } else if (colors.charAt(0) == 'B' || colors.charAt(colors.length() - 1) == 'B') {
            return false;
        } else {
            return isWinningPossibility(new StringBuilder(colors));
        }
    }

    private static boolean isWinningPossibility(StringBuilder sb) {
        if (sb.length() == 0) {
            return false;
        } else if (sb.length() == 1) {
            return true;
        } else if (sb.charAt(0) == 'B' || sb.charAt(sb.length() - 1) == 'B') {
            return false;
        }

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
        return isWinningPossibility(sb.toString());
    }
}