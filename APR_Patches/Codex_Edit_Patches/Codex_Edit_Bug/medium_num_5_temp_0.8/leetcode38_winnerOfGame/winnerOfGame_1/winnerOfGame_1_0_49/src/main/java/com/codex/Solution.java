package com.codex;

import java.util.*;

public class Solution {
public static boolean winnerOfGame(String colors) {
        int index = 0;
        int count = 0;
        while (index < colors.length()) {
            // the color at position index
            char currentColor = colors.charAt(index);
            if (currentColor == 'A') { // if 'A' is at position index
                // if 'A' is at the first position
                if (index == 0) {
                    // if there is only one color
                    if (colors.length() == 1) {
                        return true;
                    } else { // if there is more than one color
                        // if 'A' is followed by another 'A'
                        if (colors.charAt(index) == colors.charAt(index + 1)) {
                            index += 2;
                            count++;
                        } else {
                            index++;
                        }
                    }
                } else if (index == colors.length() - 1) { // if 'A' is at the last position
                    if (index == 1) { // if there is only one color
                        return true;
                    } else { // if there is more than one color
                        // if 'A' is followed by another 'A'
                        if (colors.charAt(index) == colors.charAt(index - 1)) {
                            index -= 2;
                            count++;
                        } else {
                            // return to the fist position
                            index = 0;
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