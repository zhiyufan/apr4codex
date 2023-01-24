package com.codex;

import java.util.*;

public class Solution {
     for (int i = 0; i < result.length; i++) {
              int digit = result[i] % 10;
              if (Arrays.binarySearch(digits, digit) >= 0) {
                  result[i] = result[i]/10;
                  i--;
              }
          }
}