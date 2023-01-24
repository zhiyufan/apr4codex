package com.codex;

import java.util.*;

public class Solution {
public class Test {

    public static boolean winnerOfGame(String colors) {

        int bob = 0;
        int alice = 0;

        for (int i = 0; i < colors.length(); i++) {
            if (colors.charAt(i) != 'A') {
                bob++;
                i = i + 1;
            } else {
                alice++;
            }
        }

        return alice < bob;
    }

}
}