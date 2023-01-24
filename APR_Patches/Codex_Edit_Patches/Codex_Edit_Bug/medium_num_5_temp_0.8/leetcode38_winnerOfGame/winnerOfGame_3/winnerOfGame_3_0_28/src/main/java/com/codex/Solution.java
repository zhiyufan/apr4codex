package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(winnerOfGame("ABABAB"));
    }

    public static boolean winnerOfGame(String colors) {
        if(colors.length() == 1)
            return colors.equals("A") ? true : false;

        char[] chars = colors.toCharArray();

        int i = 0;
        int j = chars.length - 1;

        int countAlice = 0;
        int countBob = 0;

        while(i <= j) {
            if(i == j) {
                if(chars[i] == 'A')
                    ++countAlice;
                else if(chars[i] == 'B')
                    ++countBob;
                break;
            } else {
                if(chars[i] == 'A' && chars[i + 1] == 'A') {
                    ++countAlice;
                    ++i;
                } else if(chars[j] == 'B' && chars[j - 1] == 'B') {
                    ++countBob;
                    --j;
                }
                ++i;
                --j;
            }
        }

        return countAlice > countBob ? true : false;
    }
}