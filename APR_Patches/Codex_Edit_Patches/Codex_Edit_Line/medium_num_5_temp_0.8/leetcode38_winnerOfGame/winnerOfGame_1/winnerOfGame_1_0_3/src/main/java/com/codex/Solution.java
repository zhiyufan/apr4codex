package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        int i = 0;
        int count = 0;
        while (i < colors.length()) {
            char currentColor = colors.charAt(i);
            if (currentColor == 'A') {
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
                    if (colors.charAt(i) == colors.charAt(i - 1) || colors.charAt(i) == colors.charAt(i + 1)) {
                        if (colors.charAt(i) == colors.charAt(i - 1)) {
                            i -= 2;
                        } else {
                            i += 2;
                        }
                        count++;
                    } else {
                        if (colors.charAt(i - 1) == colors.charAt(i + 1)) {
                            if ((i - 1) % 2 == 0) {
                                i -= 2;
                            } else {
                                i += 2;
                            }
                        } else if (i + 1 < colors.length()) {
                            if ((i + 1) % 2 == 0) {
                                i = i + 1;
                            } else {
                                i++;
                            }
                        } else if ((i - 1) % 2 == 0) {
                            i -= 2;
                        } else {
                            i--;
                        }
                    }
                }
            } else {
                i++;
            }
        }
        System.out.println("I am at: " + i);
        System.out.println("I have " + count + " 'A's");
        return count % 2 == 0;
    }

    
}