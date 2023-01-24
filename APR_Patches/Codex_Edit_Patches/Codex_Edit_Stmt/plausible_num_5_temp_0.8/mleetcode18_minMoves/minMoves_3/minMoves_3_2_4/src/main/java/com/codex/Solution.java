package com.codex;

import java.util.*;

public class Solution {
public static int minMoves(int target, int maxDoubles) {

  Map<Integer, Integer> memo = new HashMap<>();
  return minMoves(target, maxDoubles, memo);
}

private static int minMoves(int target, int maxDoubles, Map<Integer, Integer> memo) {
  if (target == 0) return 0;
  if (maxDoubles == 0) return target;
  if (memo.containsKey(target)) return memo.get(target);
  int minMoves = Integer.MAX_VALUE;
  for (int i = 1; i <= target; i++) {
    int cur = Math.min(1 + minMoves(target - i, maxDoubles - 1, memo), 1 + minMoves(target / 2, maxDoubles - 1, memo));
    minMoves = Math.min(minMoves, cur);
  }
  memo.put(target, minMoves);
  return minMoves;
}













/*










public static int minMoves(int target, int maxDoubles) {

  Map<Integer, Integer> memo = new HashMap<>();
  int ans = minMoves(target, maxDoubles, memo);
  // System.out.println(ans);
  return ans;
}

private static int minMoves(int target, int maxDoubles, Map<Integer, Integer> memo) {
  // System.out.println(target);
  if (target == 0) return 0;
  if (maxDoubles == 0) return target;
  if (memo.containsKey(target)) return memo.get(target);
  int minMoves = Integer.MAX_VALUE;
  int mod1 = target % 2 == 0 ? 0 : 1;
  int mod2 = target % 2 == 0 ? 0 : 1;
  for (int i = 0; i <= target; i++) {
    if (maxDoubles - i >= 0)
      minMoves = Math.min(minMoves, 1 + minMoves(target - i, maxDoubles - i, memo));
    if (maxDoubles - i - mod1 >= 0 && target / 2 >= 0)
      minMoves = Math.min(minMoves, 1 + minMoves(target / 2 + mod1, maxDoubles - i - mod1, memo));
    if (maxDoubles - i - mod2 >= 0 && target - target / 2 >= 0)
      minMoves = Math.min(minMoves, 1 + minMoves(target - target / 2 + mod2, maxDoubles - i - mod2, memo));
    }

  memo.put(target, minMoves);
  return minMoves;
}
*/
}