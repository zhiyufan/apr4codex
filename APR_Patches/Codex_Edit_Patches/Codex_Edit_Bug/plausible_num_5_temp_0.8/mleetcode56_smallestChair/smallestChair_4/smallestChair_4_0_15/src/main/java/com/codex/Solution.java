package com.codex;

import java.util.*;

public class Solution {
public class Main {

  public static void main(String[] args) {
    int[][] times = {
      {1, 2}, 
      {2, 3}, 
      {3, 4}, 
      {2, 3}, 
      {3, 4}, 
      {4, 5}
    };
    int targetFriend = 2;

    if (times == null || times.length == 0) {
      System.out.println(-1);
    }

    int currMax = 0;
    for (int[] time : times) {
      currMax = Math.max(currMax, time[0]);
      currMax = Math.max(currMax, time[1]);
    }
    int[] chairs = new int[currMax + 1];
    for (int[] time : times) {
      for (int i = time[0]; i < time[1]; i++) chairs[i]++;
    }
    for (int i = 0; i < chairs.length; i++) {
      if (chairs[i] == targetFriend) {
        System.out.println(i);
        return;
      }
    }
    System.out.println(-1);
  }

}
}