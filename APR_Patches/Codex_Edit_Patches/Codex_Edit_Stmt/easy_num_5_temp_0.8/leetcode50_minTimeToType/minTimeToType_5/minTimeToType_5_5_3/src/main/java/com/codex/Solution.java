package com.codex;

import java.util.*;

public class Solution {
    public int maxVowels(String s, int k) {
		int ans = 0;
		int len = s.length();
		int left = 0;
		int right = 0;
		int count = 0;
		while(right < len) {
			if(isVowels(s.charAt(right))) count++;
			right++;
			if(right - left >= k && isVowels(s.charAt(left))) count--;
			if(right - left >= k) left++;
			ans = Math.max(count, ans);
		}
		return ans;
	}
	public boolean isVowels(char c) {
		c = Character.toLowerCase(c);
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

    private static int move(char c1, char c2) {
        int num1 = c1 - 'a';
        int num2 = c2 - 'a';
        return Math.abs(num1 - num2);
    }

    

    
}