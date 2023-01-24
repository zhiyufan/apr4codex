package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfTheGame(String colors) {
        int i = 0;
        int count = 0;
        while (i < colors.length()) {
            char currentColor = colors.charAt(i);
            if (i == colors.length() - 1 && currentColor == 'A') {
                if (colors.charAt(i) == colors.charAt(0)) {
                    count++;
                }
                break;
            }
    
            if (i == 0 && currentColor == 'A') {
                if (colors.charAt(i) == colors.charAt(i + 1)) {
                    count++;
                    i += 2;
                } else {
                    i = colors.length() - 1;
                }
            }
            if (currentColor == 'A' && colors.charAt(i) == colors.charAt(i - 1)) {
                count++;
                i -= 2;
            } else if (currentColor == 'A' && colors.charAt(i) == colors.charAt(i + 1)) {
                count++;
                i += 2;
            } else {
                i = i + 1;
            }
        }
        if (count % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    
}