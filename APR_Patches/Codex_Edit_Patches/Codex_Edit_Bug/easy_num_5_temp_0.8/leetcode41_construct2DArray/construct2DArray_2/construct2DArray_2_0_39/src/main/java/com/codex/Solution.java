package com.codex;

import java.util.*;

public class Solution {
    public static int[] construct1DArray(int[][] original) {
		  
		  int[] result = new int[original.length * original[0].length];
		  for (int i = 0; i < original.length; i++) {
		      for (int j = 0; j < original[0].length; j++) {
		          result[i * original[0].length + j] = original[i][j];
		      }
		  }
		  return result;
    }

    
}