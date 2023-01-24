package com.codex;

import java.util.*;

public class Solution {
    public static int countValidWords(String sentence) {
        /** A sentence consists of lowercase letters ('a' to 'z'), digits ('0' to '9'), hyphens ('-'), punctuation marks ('!', '.', and ','), and spaces (' ') only. Each sentence can be broken down into one or more tokens separated by one or more spaces ' '.
         * A token is a valid word if all three of the following are true:
         * It only contains lowercase letters, hyphens, and/or punctuation (no digits).
         * There is at most one hyphen '-'. If present, it must be surrounded by lowercase characters ("a-b" is valid, but "-ab" and "ab-" are not valid).
         * There is at most one punctuation mark. If present, it must be at the end of the token ("ab,", "cd!", and "." are valid, but "a!b" and "c.," are not valid).
         * Examples of valid words include "a-b.", "afad", "ba-c", "a!", and "!".
         * Given a string sentence, return the number of valid words in sentence.
         */
        int count = 0;
        String[] tokens = sentence.split(" ");
        for (String token : tokens) {
            if (token.length() == 1) {
                if (Character.isLowerCase(token.charAt(0)) || token.matches("[.,!]")) {
                    count++;
                }
            } else {
                if (!token.matches(".*\\d.*")) {
                    if (token.matches("^[a-z].*[a-z].*[a-z]$")) {
                        if (token.matches(".*[,!.].*[,!.].*")) {
                            continue;
                        } else if (token.matches(".*[,!.]")) {
                            count++;
                        } else {
                            if (token.matches(".*[-].*[-].*")) {
                                continue;
                            } else if (token.matches(".*[-].*[a-z].*[-].*")) {
                                continue;
                            } else if (token.matches(".*[-].*[a-z].*")) {
                                count++;
                            } else {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }}