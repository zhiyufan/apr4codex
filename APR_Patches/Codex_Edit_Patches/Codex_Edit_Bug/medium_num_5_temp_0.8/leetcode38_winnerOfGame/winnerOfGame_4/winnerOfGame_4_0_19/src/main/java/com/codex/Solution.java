package com.codex;

import java.util.*;

public class Solution {
    public static boolean isWinningOption(String colors) {

        if (colors.length() <= 2) {
            return true;
        } else if (colors.charAt(colors.length() - 1) == 'B' || colors.charAt(0) == 'B') {
            return true;
        } else {
            return isPossibleWinningPossibility(colors);
        }
    }

    private static boolean isPossibleWinningPossibility(String colors) {
        if (colors.length() <= 2) {
            return true;
        } else if (colors.charAt(colors.length() - 1) == 'B' || colors.charAt(0) == 'B') {
            return true;
        }

        if (colors.charAt(0) == 'R') {
            int count = 0;
            for (int index = 0; index < colors.length(); index++) {
                if (colors.charAt(index) == 'R') {
                    count++;
                } else {
                    break;
                }
            }

            if (count == (colors.length() / 2)) {
                return true;
            }

            String newString = colors.substring(count, colors.length());
            if (isPossibleWinningPossibility(newString)) {
                return true;
            }
        }

        if (colors.charAt(0) == 'B') {
            int count = 0;
            for (int index = 0; index < colors.length(); index++) {
                if (colors.charAt(index) == 'B') {
                    count++;
                } else {
                    break;
                }
            }

            if (count == (colors.length() / 2)) {
                return true;
            }

            String newString = colors.substring(count, colors.length());
            if (isPossibleWinningPossibility(newString)) {
                return true;
            }
        }

        StringBuilder sb = new StringBuilder(colors);

        for (int index = 0; index < sb.length() - 2; index++) {
            if (sb.charAt(index) == sb.charAt(index + 1) && sb.charAt(index + 1) == sb.charAt(index + 2)) {
                sb.delete(index + 1, index + 2);
                if (isPossibleWinningPossibility(sb.toString())) {
                    return true;
                }
            }
        }
        return false;
    }
}