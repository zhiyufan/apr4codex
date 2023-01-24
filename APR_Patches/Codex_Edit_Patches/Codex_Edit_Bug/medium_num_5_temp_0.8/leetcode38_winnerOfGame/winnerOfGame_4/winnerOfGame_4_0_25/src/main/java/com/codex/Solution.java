package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        if (colors.isEmpty()) {
            return false;
        }
        StringBuilder sb = new StringBuilder(colors);
        int index = 1;
        while (index < sb.length()) {
            char currentCh = sb.charAt(index);
            char previous = sb.charAt(index - 1);
            if (previous == currentCh) {
                if (index - 2 >= 0) {
                    char prevOfPrevious = sb.charAt(index - 2);
                    if (prevOfPrevious == previous) {
                        sb.deleteCharAt(index);
                    }
                } else {
                    sb.deleteCharAt(index);
                }
            } else {
                index++;
            }
        }
        if (sb.length() == 0) {
            return true;
        } else if (sb.length() == 1) {
            return false;
        } else if ((sb.charAt(0) == 'B') || (sb.charAt(sb.length() - 1) == 'B')) {
            return false;
        }

        return winnerOfGame(sb.toString());
    }
}