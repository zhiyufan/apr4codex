package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;


public class SmallestChair {

  public static int smallestChair(int[][] times, int targetFriend) {
    int max = 0;

    for (int i = 0; i < times.length; i++) {
      max = Math.max(max, times[i][1]);
    }

    int[] arr = new int[max];

    for (int i = 0; i < times.length; i++) {
      int arrival = times[i][0];
      int leaving = times[i][1];
      arr[arrival]++;
      arr[leaving]--;
    }

    int cnt = 0;

    for (int i = 0; i < arr.length; i++) {
      cnt += arr[i];
      if (cnt - 1 == targetFriend)
        return i;
    }

    return 0;
  }

  public static void main(String[] args) {
    int[][] times = {{1, 2}, {3, 3}, {2, 3}};
    int targetFriend = 1;
    System.out.println(smallestChair(times, targetFriend));
  }
}
}