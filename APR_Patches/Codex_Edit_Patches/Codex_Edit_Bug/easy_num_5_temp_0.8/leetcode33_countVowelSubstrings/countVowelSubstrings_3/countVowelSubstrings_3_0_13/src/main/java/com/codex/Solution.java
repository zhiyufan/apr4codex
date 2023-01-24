package com.codex;

import java.util.*;

public class Solution {
    char[] str = "asdfghjklzxcvbnm".toCharArray();
        int[] count = new int[26];
        int[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < str.length; i++) {
            str[i] = Character.toLowerCase(str[i]);
            if (str[i] == vowels[0] || str[i] == vowels[1] || str[i] == vowels[2] || str[i] == vowels[3] || str[i] == vowels[4]) {
                count[str[i] - 'a']++;
            }
        }       
        int ans = 0;
        for (int i = 0; i < 26; i++) {
            ans += (count[i] * (count[i] + 1)) / 2;
        }
        System.out.println(ans);
}