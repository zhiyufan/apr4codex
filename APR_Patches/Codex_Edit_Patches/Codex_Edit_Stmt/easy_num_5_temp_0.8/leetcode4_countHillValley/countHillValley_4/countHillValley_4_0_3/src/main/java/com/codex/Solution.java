package com.codex;

import java.util.*;

public class Solution {
    private static int[] fibRec(int n) {
        int[] a = {1, 1};
    if (n <= 0)
      return new int[] {0};
    if (n == 1 || n == 2) 
      return new int[] {1};
    
    int[] f = fibRec(n - 2);
    int[] b = new int[a.length + f.length];
    System.arraycopy(f, 0, b, 0, f.length);
    System.arraycopy(a, 0, b, f.length, a.length);
    return b; 
  }


    
    
}