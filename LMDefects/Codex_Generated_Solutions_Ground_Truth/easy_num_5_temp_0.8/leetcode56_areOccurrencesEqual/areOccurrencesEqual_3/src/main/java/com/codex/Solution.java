package com.codex;

import java.util.*;

public class Solution {
    public static boolean areOccurrencesEqual(String s) {
        /** Given a string s, return true if s is a good string, or false otherwise.
         * A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).
         */

        ArrayList<Integer> occurrences = new ArrayList<>();
        ArrayList<Character> characters = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (!characters.contains(s.charAt(i))) {
                int occurrencesOfChar = getNumberOfOccurrences(s, s.charAt(i));
                occurrences.add(occurrencesOfChar);
                characters.add(s.charAt(i));
            }
        }

        for (int i = 0; i < occurrences.size() - 1; i++) {
            if (occurrences.get(i) != occurrences.get(i + 1)) {
                return false;
            }
        }


        return true;
    }

    }