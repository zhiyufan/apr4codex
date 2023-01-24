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


public static boolean winnerOfGame(String colors) {
    int i = 0;
    boolean game = true;
    boolean winner = true;
    int count = 0;
    char currentColor;

    if (colors.length() == 2) {
        if (colors.charAt(0) == 'A') {
            if (colors.charAt(0) == colors.charAt(1)) {
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    while (game) {
        currentColor = colors.charAt(i);
        if (currentColor == 'A') {
            if (i == 0) {
                if (colors.charAt(i) == colors.charAt(i + 1)) {
                    i++;
                } else {
                    i = colors.length() - 1;
                }
            } else {
                if (i == colors.length() - 1) {
                    i = 0;
                } else {
                    if (colors.charAt(i) == colors.charAt(i + 1)) {
                        i++;
                    } else {
                        i--;
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