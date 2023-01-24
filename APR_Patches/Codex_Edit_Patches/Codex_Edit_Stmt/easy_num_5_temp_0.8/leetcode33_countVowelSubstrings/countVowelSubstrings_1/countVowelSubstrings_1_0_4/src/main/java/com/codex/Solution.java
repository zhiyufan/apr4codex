package com.codex;

import java.util.*;

public class Solution {
    public static int countVowels(String s) {
  	int count = 0;
 	for (char c: s.toCharArray()) {
 		if (isVowel(c)) {
 			count+=1;
 		}
 	} return count;
 }
}