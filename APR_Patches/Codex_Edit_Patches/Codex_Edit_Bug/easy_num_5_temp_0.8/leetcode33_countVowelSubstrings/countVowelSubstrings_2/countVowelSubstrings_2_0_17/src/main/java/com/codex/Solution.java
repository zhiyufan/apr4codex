package com.codex;

import java.util.*;

public class Solution {
    public static int CountVowelSubstrings(string s)
        {
            int count = 0;
            for (int i = 0; i < s.Length; i++)
            {
                for (int j = s.Length - 1; j >= i; j--)
                {
                    if (isVowelSubstring(s.Substring(i, j - i + 1)))
                    {
                        count++;
                    }
                }
            }
            return count;
        }

        private static bool isVowelSubstring(string s)
        {
            char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
            int[] freq = new int[5];
            for (int i = 0; i < s.Length; i++)
            {
                for (int j = 0; j < 5; j++)
                {
                    if (s[i] == vowels[j])
                    {
                        freq[j] = 1;
                    }
                }
            }
            for (int i = 0; i < 5; i++)
            {
                if (freq[i] == 0)
                {
                    return false;
                }
            }
            return true;
        }

        public static int CountVowelSubstrings1(string s)
        {
            int ans = 0;
            for (int i = 0; i < s.Length; i++)
            {
                for (int j = i + 1; j < s.Length; j++)
                {
                    if (isVowelSubstring(s.Substring(i, j - i)))
                    {
                    ans++;
                }
            }
        }
        }
        public static int CountVowelSubstrings2(string s)
        {
            int ans = 0;
            for (int i = 0; i < s.Length; i++)
            {
                for (int j = i + 1; j < s.Length; j++)
                {
                    if (isVowelSubstring(s.Substring(i, j - i)))
                    {
                        ans++;
                    }
                }
            }
            return ans;
        }
}