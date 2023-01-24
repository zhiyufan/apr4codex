package com.codex;

import java.util.*;

public class Solution {
class Solution {
  public int minBitFlips(int[] A, int m) {
    int count = 0;
    int flip = 0;
    for (int i = 0; i < m; ++i) {
      flip ^= 1 - A[i];
    }

    for (int i = m; i < A.length; ++i) {
      if (flip % 2 == 1) {
        flip ^= 1;
        count++;
        if (i == A.length - 1) {
          return -1;
        }
      }
      flip ^= 1 - A[i];
      flip ^= 1 - A[i - m];
    }
    return count + flip;
  }
}
}