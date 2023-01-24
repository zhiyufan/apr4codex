package com.codex;

import java.util.*;

public class Solution {
class Solution {
  public static int minBitFlips(int start, int goal) {
    int res = 0;
    for (int i = (1 << 30); i > 0; i >>= 1) {
      if ((start & i) != (goal & i)) {
        res++;
        goal ^= i;
      }
    }
    return res;
  }
}
}