package com.codex;

import java.util.*;

public class Solution {
        public int countVowels(String word) {
        int cnt=0, len=word.length();
        for (int i = 0; i < len; i++) {
            if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u')
                cnt++;
        }
        return cnt;
    }

    
}