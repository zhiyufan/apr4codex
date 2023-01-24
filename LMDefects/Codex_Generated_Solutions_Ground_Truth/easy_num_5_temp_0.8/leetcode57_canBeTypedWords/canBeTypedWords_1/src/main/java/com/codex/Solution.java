package com.codex;

import java.util.*;

public class Solution {
    public static int canBeTypedWords(String text, String brokenLetters) {
        /** There is a malfunctioning keyboard where some letter keys do not work. All other keys on the keyboard work properly.
         * Given a string text of words separated by a single space (no leading or trailing spaces) and a string brokenLetters of all distinct letter keys that are broken, return the number of words in text you can fully type using this keyboard.
         */

        Set<Character> broken = new HashSet<>();
        for (char c : brokenLetters.toCharArray()) {
            broken.add(c);
        }

        int count = 0;
        for (String word : text.split(" ")) {
            boolean canBeTyped = true;
            for (char c : word.toCharArray()) {
                if (broken.contains(c)) {
                    canBeTyped = false;
                    break;
                }
            }
            if (canBeTyped) {
                count++;
            }
        }
        return count;
    }

    }