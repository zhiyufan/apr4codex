package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int VowelNumber(string s) {
        char[] S = s.ToLower().ToCharArray();
        int count = 0;
        foreach (char c in S)
        {
            switch (c)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': count++; break;
            }
        }
        int index = 0;
        for (int i = 1; i < 10; i++) {
            if (res[i] > 0) {
                index = i;
                res[i]--;
                break;
            }
        }
        long min = index;
        for (index = 0; index < 10; index++) {
            while (res[index]-- > 0) {
                min = min * 10 + index;
            }
        }
        return min;
    }
    
}