package com.codex;

import java.util.*;

public class Solution {
    public static boolean isBalanced(String colors) {
        
        int i = 0;
        int arrowCount = 0;
        while (i < colors.length()) {
            if (colors.charAt(i) == 'A') {
                if (i == colors.length() - 1 || i == 0) {
                    arrowCount++;
                    i++;
                } else {
                    if (colors.charAt(i) == colors.charAt(i - 1) || colors.charAt(i) == colors.charAt(i + 1)) {
                        if (colors.charAt(i) == colors.charAt(i - 1)) {
                            i -= 2;
                        } else {
                            i += 2;
                        }
                        arrowCount++;
                    } else {
                        if (i + 1 < colors.length() - 1) {
                            if (colors.charAt(i + 1) == colors.charAt(i + 2)) { // check if next element is same as next next element
                                i = i + 1;
                            } else {
                                i++;
                            }
                        } else {
                            if (colors.charAt(i - 1) == colors.charAt(i - 2)) { // check if previous element is same as previous previous element
                                i = i - 1;
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