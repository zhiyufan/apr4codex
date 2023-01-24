package com.codex;

import java.util.*;

public class Solution {
    public static int canBeTypedWords(String text, String brokenLetters) {
        /** There is a malfunctioning keyboard where some letter keys do not work. All other keys on the keyboard work properly.
         * Given a string text of words separated by a single space (no leading or trailing spaces) and a string brokenLetters of all distinct letter keys that are broken, return the number of words in text you can fully type using this keyboard.
         */

        Set<Character> brokenLettersSet = new HashSet<>();
        for (int i = 0; i < brokenLetters.length(); i++) {
            brokenLettersSet.add(brokenLetters.charAt(i));
        }

        String[] words = text.split(" ");
        int count = 0;
        for (String word : words) {
            boolean canBeTyped = true;
            for (int i = 0; i < word.length(); i++) {
                if (brokenLettersSet.contains(Character.toLowerCase(word.charAt(i)))) {
                    canBeTyped = false;
                    break;
                }
            }

            if (canBeTyped) {
                count += 1;
            }
        }

        return count;
    }
}}