package com.codex;

import java.util.*;

public class Solution {
 public static String findDifferentBinaryString(String[] nums) {
 
	 int n = nums[0].length();
	 int m = nums.length;
	 char[][] char2D = new char[m][n];
	 for (int i = 0; i < n; i++) {
		 for (int j = 0; j < m; j++) {
			 char2D[j][i] = nums[j].charAt(i);
		 }
	 }
	 String s = "";
	 for (int i = 0; i < n; i++) {
		 int ones = 0;
		 for (int j = 0; j < m; j++) {
			 if (char2D[j][i] == '1') {
				 ones++;
			 }
		 }
		 if (ones <= m / 2) {
			 s += "0";
		 } else {
			 s += "1";
		 }
	 }
	 return s;
 }

    
}