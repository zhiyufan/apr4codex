package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(countPalindromicSubsequence(s));
    }
     public static int countPalindromicSubsequence(String s) {
        int[][]dp=new int[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
            dp[i][i]=1;
        }
        for(int l=2;l<=s.length();l++){
            for(int i=0;i<s.length()-l+1;i++){
                int j=i+l-1;
                if(s.charAt(i)==s.charAt(j))
                    dp[i][j]=dp[i][j-1]+dp[i+1][j]+1;
                else
                    dp[i][j]=dp[i][j-1]+dp[i+1][j]-dp[i+1][j-1];
            }
            
        }
        return dp[0][s.length()-1];
    } 
}
}