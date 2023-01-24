package com.codex;

import java.util.*;

public class Solution {
int countPalindromicSubsequence(string s) {
        int r[][]=new int[s.length()][s.length()];
        for(int i=0;i<s.length();i++)
        {
            r[i][i]=1;
            if (i != s.length()-1)
                if (s[i] == s[i + 1]) 
                    r[i][i + 1] = 3;
                else 
                    r[i][i + 1] = 2;
        }
        for(int len=3; len<=s.length(); len++)
        {
            for(int i=0; i<s.length()-len+1;i++)
             {
                 int j=i+len-1;
                 r[i][j]=r[i][j-1]+r[i+1][j]-r[i+1][j-1];
                 if(s[i]==s[j])
                 {
                     r[i][j]=r[i][j]+1+r[i+1][j-1];
                     if (len==3) 
                         r[i][j]=r[i][j]-1;          
                 }
            }
        }
        return dp[0][s.length() - 1];
    }
    
}