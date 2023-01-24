package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colorsStr) {
        int i = 0;
        int[] colors = new int[colorsStr.length()];
        for (int j = 0; j < colors.length; j++) {
            colors[j] = colorsStr.charAt(j) - 'A';
        }
        
        while (i < colors.length) {
            char currentColor = colors[i];
            if (currentColor == 0) {
                if (i == colors.length - 1) {
                    if (i == 1) {
                        if (currentColor == colors[i - 1]) {
                            i -= 2;
                            count++;
                        } else {
                            i--;
                        }
                    } else {
                        if (currentColor == colors[i - 1]) {
                            i -= 2;
                            count++;
                        } else {
                            i = 0;
                        }
                    }
                } else if (i == 0){
                    if (i == colors.length - 2) {
                        if (currentColor == colors[i + 1]) {
                            i += 2;
                            count++;
                        } else {
                            i++;
                        }
                    } else {
                        if (currentColor == colors[i + 1]) {
                            i += 2;
                            count++;
                        } else {
                            i = colors.length() - 1;
                        }
                    }
                } else {
                    if (colors.charAt(i) == colors.charAt(i - 1) || colors.charAt(i) == colors.charAt(i + 1)) {
                        if (colors.charAt(i) == colors.charAt(i - 1)) {
                            i -= 2;
                        } else {
                            i += 2;
                        }
                        count++;
                    } else {
                        if (i + 1 < colors.length()) {
                            if (colors.charAt(i + 1) == colors.charAt(i + 2)) {
                                i = i + 2;
                            } else {
                                i++;
                            }
                        } else {
                            if (colors.charAt(i - 1) == colors.charAt(i - 2)) {
                                i = i - 2;
                            } else {
                                i--;
                            }
                        }
                    }
                }
            } else {
                i++;
            }
        }
        if (count % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    
}