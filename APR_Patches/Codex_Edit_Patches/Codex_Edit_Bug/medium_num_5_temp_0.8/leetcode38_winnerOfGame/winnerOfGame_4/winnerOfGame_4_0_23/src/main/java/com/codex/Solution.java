package com.codex;

import java.util.*;

public class Solution {
   public boolean isWinnerOfGame(String colors) {

        boolean isWinnerOfGame = true;

        if (colors.length() == 0) {
            return isWinnerOfGame = false;
        } else if (colors.length() == 1) {
            return isWinnerOfGame = false;
        } else if (colors.charAt(0) == 'B' || colors.charAt(colors.length() - 1) == 'B') {
            return isWinnerOfGame = false;
        } else if (colors.length() == 2) {
            return isWinnerOfGame = isWinnerOfGame(colors.charAt(0), colors.charAt(1));
        }

        StringBuilder sb = new StringBuilder(colors);
        for (int i = 0; i < sb.length() - 2; i++) {
            char first = colors.charAt(i);
            char mid = colors.charAt(i + 1);
            char last = colors.charAt(i + 2);
            if (first == mid && mid == last) {
                sb.deleteCharAt(i + 1);
                i--;
            }
        }

        if (sb.length() == 2)
            return isWinnerOfGame(sb.charAt(0), sb.charAt(1));
        else {
            return isWinnerOfGame(sb.toString());

    private boolean isWinnerOfGame(char first, char last) {
        return first == last;

    }
        }
    }
}