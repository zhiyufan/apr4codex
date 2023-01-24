package com.codex;

import java.util.*;

public class Solution {
public class findClosestPalindromeInString {
    
    public static  String palindrome(String s) {
        String str = "";
        for(int i=s.length()-1;i>=0;i--)
            str = str + s.charAt(i);
        return str;
    }

    public static  int findClosestPalindrome(String s){
        int closest = Integer.MAX_VALUE;
        String pal = palindrome(s);
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == pal.charAt(i)){
                closest = Math.min(closest,0);
            }
            else{
                closest = Math.min(closest,1);
            }
        }
        return closest;
    }
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(findClosestPalindrome(s));
    }
}
}