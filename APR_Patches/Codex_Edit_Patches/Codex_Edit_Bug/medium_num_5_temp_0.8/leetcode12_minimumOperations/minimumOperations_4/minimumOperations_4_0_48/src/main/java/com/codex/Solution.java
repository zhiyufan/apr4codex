package com.codex;

import java.util.*;

public class Solution {
class Solution {
  public int minOperations(int n) {
    int median = (1 + n) / 2;
    int ans = 0;
    for(int i = 1; i <= n; i++)
      ans += Math.abs(i - median);
    return ans;
    }

}
}