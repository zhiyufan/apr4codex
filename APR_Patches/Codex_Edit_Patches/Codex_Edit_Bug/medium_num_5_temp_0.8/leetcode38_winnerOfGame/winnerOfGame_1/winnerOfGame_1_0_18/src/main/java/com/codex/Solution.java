package com.codex;

import java.util.*;

public class Solution {
/**
 * @author Mohammad Khan
 * @version 12/08/2018
 * A method that will determine whether or not the host of the game will
 * win based on the colors of his and his guest's marbles. If there is an
 * 'A' found in the colors sequence, then this will mean that the individual
 * is a host.
 * 
 * @param colors - A sequence of colors of marbles the host and guests have.
 */
    public static boolean winnerOfGame(String colors) {
        boolean winner = false;
        int i = 0;
        int count = 0;
        // A loop that will iterate through the colors sequence.
        while (i < colors.length()) {
            char currentColor = colors.charAt(i);
            // If the current character is an 'A', then the individual is a host.
            if (currentColor == 'A') {
                // If the current character is the last character in the colors sequence,
                // then the host will either be forced to take the marble previous to it
                // (if it is the same color) or the the marble after it (if it is the same color). 
                if (i == colors.length() - 1) {
                    // If there is only one marble after the host's marble,
                    // then the colors sequence will obviously have a one letter string
                    // (I.E. 'G', 'B', 'R', 'A')
                    if (i == 1) {
                        if (colors.charAt(i) == colors.charAt(i - 1)) {
                            i -= 2;
                            count++;
                        } else {
                            i--;
                        }
                    } else {
                        // If the marble previous to the host's marble is the same color,
                        // then the host is forced to take it, otherwise the host will be forced
                        // to take the marble after it.
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