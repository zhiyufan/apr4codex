package com.codex;

import java.util.*;

public class Solution {
   public static int minSteps(String s, String t) {
        
        int n = s.length(), m = t.length();
        int[] frq = new int[26];
        for(int i = 0; i < n; i++)
        {
            frq[s.charAt(i) - 'a']++;
        } 
        int count = 0;
        for(int i = 0; i < m; i++)
        {
            if(frq[t.charAt(i) - 'a']  == 0)
            {
                count++;
            }
            else
            {
                frq[t.charAt(i) - 'a']--;
            }
        }
        return steps;
    }

    
}