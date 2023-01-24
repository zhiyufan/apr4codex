package com.codex;

import java.util.*;

public class Solution {
//you can also use imports, for example:
import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
    public static boolean winnerOfGame(String colors) {
        int alice = 0;
        int bob = 0;
        char[] chars = colors.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 || i == chars.length - 1) {
                if (chars[i] == 'A') {
                    ++alice;
                }
            } else {
                if (chars[i] == 'A' && chars[i - 1] == 'A' && chars[i + 1] == 'A') {
                    ++alice;
                } else if (chars[i] == 'B' && chars[i - 1] == 'B' && chars[i + 1] == 'B') {
                    ++bob;
                }
            }
        }
        return alice > bob;
    }
}
}