package com.codex;

import java.util.*;

public class Solution {
class Solution {
  public boolean canConvertString(String s, String t, int k) {
    int n = s.length();
    if (n != t.length()) return false;
    int[] count = new int[26];
    for (int i = 0; i < n; i++) {
      int d = (t.charAt(i) - s.charAt(i) + 26) % 26;
      if (d == 0) continue;
      if (k < d + count[d] * 26) return false;
      count[d]++;
    }
    return true;
  }
}
}