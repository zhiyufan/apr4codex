package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }
        int step = 0;
        for (int i = 0; i < t.length(); i++) {
            if (hash[t.charAt(i) - 'a'] == 0) {
                step++;
            } else {
                hash[t.charAt(i) - 'a']--;
            }
        }
        return step;
    }

    public static List<Character> charactersThatAlreadyExisted(String s, String t){
	    List<Character> list = new ArrayList<>();
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            if (hash[t.charAt(i) - 'a'] == 0) {
                continue;
            } else {
			    list.add(t.charAt(i));
				hash[t.charAt(i) - 'a']--;
			}
        }
        return list;
    }
	
	
	public static int minStepsToFindMin(String s, String t) {
        
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }
        int step = 0;
        for (int i = 0; i < t.length(); i++) {
            if (hash[t.charAt(i) - 'a'] == 0) {
                step++;
            } else {
                hash[t.charAt(i) - 'a']--;
            }
        }
        return step;
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		int stepsToConvert = minStepsToFindMin(s, t);
		StringBuilder sb = new StringBuilder();
		for (Character ch : charactersThatAlreadyExisted(s, t)) {
			sb.append(ch);
		}
		System.out.println(sb.toString());
	}
    
}