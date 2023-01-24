package com.codex;

import java.util.*;

public class Solution {
public static int countVowelSubstrings(String word) {

        int count = 0;
        for(int i=0;i<word.length();i++){
            for(int j=i+1;j<=word.length();j++){
                count=count+countVowel(word.substring(i,j));
            }
        }
        return count;
    }
    public static int countVowel(String word){
        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int count1 = 0;

        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(word.charAt(i))) {
                count1 += word.length() - i;
            }
        }

        return count1;
    }
}