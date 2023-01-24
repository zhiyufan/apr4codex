package com.codex;

import java.util.*;

public class Solution {
public static boolean winnerOfGame(String colors) {

        if (colors == null) {
            return false; // or throw an exception
        } else if (colors.isEmpty()) {
            return true; // when empty string is passed
        } else {
            return isWinningPossibility(colors);
        }
    }

    private static boolean isWinningPossibility(String input) {
        if (input == null) {
            return false; // or throw an exception
        } else if (input.isEmpty()) {
            return true; // when empty string is passed
        }


        int length = input.length();
        if (length > 1) {
            if (input.charAt(0) == 'B' || input.charAt(length - 1) == 'B') {
                return false;
            }
        }

        StringBuilder sb = new StringBuilder(input);
        for (int i = 0; i < sb.length() - 2; i++) {
            char start = sb.charAt(i);
            char mid = sb.charAt(i + 1);
            char end = sb.charAt(i + 2);
            if (start == mid && mid == end) {
                
                sb.deleteCharAt(i + 1); // remove the index position with 'middle' color
                return isWinningPossibility(sb.toString());
            }
        }

        return false;
    }
}