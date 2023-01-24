package com.codex;

import java.util.*;

public class Solution {
package com.mycompany.app;

import java.util.*;

public class App {

  public static int findNumInSortedArray(int[] a, int x) {
    if (a[0] > x)
      return -1;
    if (a[a.length - 1] < x)
      return -1;

    int left = 0;
    int right = a.length - 1;
    while (left <= right) {
      int mid = (left + right) / 2;
      if (a[mid] == x)
        return mid;
      if (a[mid] < x) {
        if (a[mid + 1] > x)
          return -1;
        left = mid + 1;
      } else if (a[mid] > x) {
        if (a[mid - 1] < x)
          return -1;
        right = mid - 1;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] a = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    System.out.println(findNumInSortedArray(a, 10));
  }
}
}