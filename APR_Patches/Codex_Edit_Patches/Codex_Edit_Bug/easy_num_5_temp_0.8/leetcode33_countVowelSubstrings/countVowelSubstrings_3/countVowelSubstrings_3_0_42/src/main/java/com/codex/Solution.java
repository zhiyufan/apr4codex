package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        String word = "baz";
        int result = countVowelSubstrings(word);
        System.out.println(result);
    }

    public static int countVowelSubstrings(String word) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int result = word.length(); // create the total count;
        for (char vowel : vowels) {
            String replacedString = word.replaceAll(String.valueOf(vowel), "");
            result += word.length() - replacedString.length(); // count the total vowels
        }
        return result;
    }

    
}