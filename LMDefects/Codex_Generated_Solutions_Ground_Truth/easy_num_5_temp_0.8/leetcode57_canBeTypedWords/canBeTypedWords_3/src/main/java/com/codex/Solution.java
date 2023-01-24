package com.codex;

import java.util.*;

public class Solution {
    public static int canBeTypedWords(String text, String brokenLetters) {
        /** There is a malfunctioning keyboard where some letter keys do not work. All other keys on the keyboard work properly.
         * Given a string text of words separated by a single space (no leading or trailing spaces) and a string brokenLetters of all distinct letter keys that are broken, return the number of words in text you can fully type using this keyboard.
         */

        HashSet<Character> broken = new HashSet<>();
        for (int i = 0; i < brokenLetters.length(); i++) {
            broken.add(brokenLetters.charAt(i));
        }

        int res = 0;
        for (String s: text.split(" ")) {
            boolean canType = true;
            for (int i = 0; i < s.length(); i++) {
                if (broken.contains(s.charAt(i))) {
                    canType = false;
                    break;
                }
            }
            if (canType) {
                res++;
            }
        }

        return res;
    }

    }