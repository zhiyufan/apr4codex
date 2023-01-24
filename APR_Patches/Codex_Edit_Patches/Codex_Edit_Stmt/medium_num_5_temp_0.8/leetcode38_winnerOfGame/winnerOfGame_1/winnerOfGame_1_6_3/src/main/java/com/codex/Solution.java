package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        
        int i = 0;
        int count = 0;
        while (i < colors.length()) {
            char currentColor = colors.charAt(i);
            if (i == colors.length() - 1) {
                if (i == 1) {
                    if (colors.charAt(i) == colors.charAt(i - 1)) {
                        i -= 2;
                        count++;
                    } else {
                        i--;
                    }
                } else {
                    if (colors.charAt(i) == colors.charAt(i - 1)) {
                        i -= 2;
                        count++;
                    } else {
                        i = 0;
                    }
                }
            } else if (i == 0){
                if (i == colors.length() - 2) {
                    if (colors.charAt(i) == colors.charAt(i + 1)) {
                        i += 2;
                        count++;
                    } else {
                        i++;
                    }
                } else {
                    if (colors.charAt(i) == colors.charAt(i + 1)) {
                        i += 2;
                        count++;
                    } else {
                        i = colors.length() - 1;
                    }
                }
            } else {
                if (colors.charAt(i) == colors.charAt(i + 1) && currentColor == 'A') {
                    i += 2;
                    count++;
                } else if (colors.charAt(i) == colors.charAt(i - 1) && currentColor == 'A') {
                            i -= 2;
                    count++;
                } else if (!colors.substring(i + 1, i + 2).contains("A") && currentColor != 'A') {
                    if (i + 1 < colors.length()) {
                        if (colors.charAt(i + 1) == colors.charAt(i + 2)) {
                            i = i + 2;
                        } else {
                            i++;
                        } 
                    } else {
                        if (colors.charAt(i - 1) == colors.charAt(i - 2)) {
                            i -= 2;
                        } else {
                            i--;
                        }
                    }
                } else if (!colors.substring(i - 1, i).contains("A") && currentColor != 'A') {
                    i++;
                }
            }
        }
        if (count % 2 == 0 && i >= colors.length() - 1) {
            return true; 
        } else {
            return false;
        }
    }

    
}