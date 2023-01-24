package com.codex;

import java.util.*;

public class Solution {
    public static int minTimeToType(String word) {
        int[] cnt = new int[26];
         for(char c: word.toCharArray())
            cnt[c - 'a']++;
        char cur = 'a';
        int res = 0;
        for(int i = 0; i < 26; i++){
            if(cnt[i] > 0){
                res += Math.abs(cur - ('a' + i));
                cur = (char)('a' + i);
                while(cnt[i]-- > 1)
                    res += Math.min(Math.abs(cur - ('a' + i)), Math.abs(cur + 26 - ('a' + i)));
            }
        }
        return res;
    }    

    
}