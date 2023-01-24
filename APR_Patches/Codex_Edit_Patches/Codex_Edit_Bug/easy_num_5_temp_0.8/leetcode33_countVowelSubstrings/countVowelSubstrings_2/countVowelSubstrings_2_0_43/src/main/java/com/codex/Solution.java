package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word)
    {
        int ans = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int[] freq = new int[5];
        
        for (int i = 0; i < word.length(); i++)
        {
            for (int j = 0; j < 5; j++)
            {
                if (word.charAt(i) == vowels[j])
                {
                    freq[j]++;
                    ans++;
                }
            }
        }
        
        return ans;
    }
}