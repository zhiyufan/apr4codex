package com.codex;

import java.util.*;

public class Solution {
public static int minimumMoves(String s) {

    int count = 0;
    for (int i = 0; i < s.length() - 2; i++) {
        if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i + 1) == s.charAt(i + 2) && s.charAt(i) == 'X') {
            count++;
            i += 2;
        }

        else if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i + 1) == s.charAt(i + 2) && s.charAt(i) == 'O') {
            count++;
            i += 2;
        }

        else if (s.charAt(i) != s.charAt(i + 1) && s.charAt(i + 1) != s.charAt(i + 2) && s.charAt(i) == 'O' && s.charAt(i + 1) == 'X' && s.charAt(i + 2) == 'O') {
            String sCopy = new String(s);
            if (sCopy.charAt(i) != sCopy.charAt(i + 1)) {
                count++;
                i += 2;
            }
        }

        else if (s.charAt(i) != s.charAt(i + 1) && s.charAt(i + 1) != s.charAt(i + 2) && s.charAt(i) == 'X' && s.charAt(i + 1) == 'O' && s.charAt(i + 2) == 'X') {
            String sCopy = new String(s);
            if (sCopy.charAt(i) != sCopy.charAt(i + 1)) {
                count++;
                i += 2;
            }
        } else
            continue;
    }

    return count;
}
}