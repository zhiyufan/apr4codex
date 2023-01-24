package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                String sub = word.substring(i, j + 1);
                if (containsVowels(sub)) {
                    count++;
                }
            }
        }
        return count;
    }

//     private static boolean containsVowels(String word) {
//         boolean a = false, e = false, i = false, o = false, u = false;
//         for (char c : word.toCharArray()) {
//             if (c == 'a') {
//                 a = true;
//             }
//             if (c == 'e') {
//                 e = true;
//             }
//             if (c == 'i') {
//                 i = true;
//             }
//             if (c == 'o') {
//                 o = true;
//             }
//             if (c == 'u') {
//                 u = true;
//             }
//         }
//         return a && e && i && o && u;
//     }
        
        private static boolean containsVowels(String word) {
        boolean vowel[] = new boolean[5];
        Arrays.fill(vowel, false);
        for (char c : word.toCharArray()) {
            switch (c) {
                case 'a':
                    vowel[0] = true;
                    break;
                case 'e':
                    vowel[1] = true;
                    break;
                case 'i':
                    vowel[2] = true;
                    break;
                case 'o':
                    vowel[3] = true;
                    break;
                case 'u':
                    vowel[4] = true;
                    break;
            }
            if (c == 'e') {
                e = true;
            }
            if (c == 'i') {
                i = true;
            }
            if (c == 'o') {
                o = true;
            }
            if (c == 'u') {
                u = true;
            }
        }
        return a && e && i && o && u;
    }

    
}