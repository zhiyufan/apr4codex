package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Main {
  public static int smallestChair(int[][] times, int targetFriend) {
      if (times.length == 1) return times[0][1];
    int currMax = 0;
    for (int[] time : times) {
        currMax = Math.max(currMax, time[0]);
        currMax = Math.max(currMax, time[1]);
    int[] chairs = new int[currMax+1];
    for (int[] time : times) {
        for (int i = time[0]; i < time[1]; i++) chairs[i]++;
    }
    for (int i = 0; i < chairs.length; i++) {
        if (chairs[i] == targetFriend) return i;
    }
    return -1;
  }
}
    }

    
}