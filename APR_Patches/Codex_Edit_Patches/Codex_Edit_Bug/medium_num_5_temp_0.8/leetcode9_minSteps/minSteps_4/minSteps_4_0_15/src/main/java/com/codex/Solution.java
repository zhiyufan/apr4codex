package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Main {
	
	public static int minSteps(String s, String t) {
        
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        int steps = 0;
        for (char c : t.toCharArray()) {
            if (freq[c - 'a'] == 0) {
                steps++;
            } else {
                freq[c - 'a']--;
            }
        }
        return steps;
    }

	public static void main(String[] args) {
		// Write your code here
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      String t = sc.next();
      System.out.println(minSteps(s, t));
		
	}

}
}