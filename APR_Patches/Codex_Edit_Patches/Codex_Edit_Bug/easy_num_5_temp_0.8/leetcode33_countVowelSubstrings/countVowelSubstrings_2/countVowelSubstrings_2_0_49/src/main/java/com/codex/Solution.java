package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class TestClass {
    static Scanner in = new Scanner(System.in);

    static int countVowelSubstrings(String word) {
        int count = 0;
        for (int i=0;i<word.length();i++) {
            ArrayList<Character> list = new ArrayList<>();
            list.add(word.charAt(i));
            count += findSubStrings(list,i+1,word);
        }
        return ans;
    }

    private static boolean isVowelSubstring(String str) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int[] freq = new int[5];
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 5; j++) {
                if (str.charAt(i) == vowels[j]) {
                    freq[j]++;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            if (freq[i] == 0) {
                return false;
            }
        }
        return true;
    }
}