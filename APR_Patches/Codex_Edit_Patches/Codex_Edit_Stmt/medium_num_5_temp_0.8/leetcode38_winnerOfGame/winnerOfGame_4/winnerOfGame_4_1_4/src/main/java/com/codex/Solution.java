package com.codex;

import java.util.*;

public class Solution {

    static int max = 0;

    public static boolean winnerOfGame(String colors) {
        return winner(colors);
    }

    public static boolean winner(String colors) {
        if (colors.length() == 1 && colors.charAt(0) == 'G') {
            return true;
        }

        for (int i = 0; i < colors.length() - 1; i++) {
            if (colors.charAt(i) == 'G' && colors.charAt(i + 1) == 'G') {
                StringBuilder sb = new StringBuilder(colors);
                sb.deleteCharAt(i + 1);
                if (winner(sb.toString())) {
                    return true;
                }
            }
        }

        if (colors.length() == 1 && colors.charAt(0) == 'G') {
            return true;
        } else {
            return false;
        }

    }
}