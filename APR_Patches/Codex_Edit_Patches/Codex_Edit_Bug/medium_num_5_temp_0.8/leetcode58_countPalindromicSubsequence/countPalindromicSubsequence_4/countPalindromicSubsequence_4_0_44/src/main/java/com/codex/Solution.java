package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s) {
        
        Set<String> set = new HashSet<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            set.add(s.charAt(i) + "");
        }
        for (int i = 0; i < len - 1; i++) {
		set.add("" + s.charAt(i) + s.charAt(i + 1));
		}
		for (int i = 1; i < len - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1))
				set.add("" + s.charAt(i - 1) + s.charAt(i) + s.charAt(i + 1));
		}
		for (int i = 0; i < len - 2; i++) {
			for (int j = i + 2; j < len; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					if (i + 1 == j - 1)
						set.add(s.substring(i, j + 1));
					else {
						if (s.charAt(i + 1) == s.charAt(j - 1))
							set.add(s.substring(i, j + 1));
					}
				}
			}
		}
		
        return set.size();
    }
}