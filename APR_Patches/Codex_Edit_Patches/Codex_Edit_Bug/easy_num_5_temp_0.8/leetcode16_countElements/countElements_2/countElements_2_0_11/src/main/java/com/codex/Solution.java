package com.codex;

import java.util.*;

public class Solution {
class Solution {
  public static void main(String[] args) {
    int a[] = {65, 34, 52, 26, 14, 2, 52, 97, 65};
    int d = 100;
    System.out.print("Contents of the array: ");
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }

    System.out.println();
    System.out.print("Number of pairs: ");
    System.out.println(countPairs(a, a.length, d));
  }

  public static int countPairs(int a[], int n, int sum) {
    int count = 0;
    HashSet < Integer > s = new HashSet< Integer >();
    for (int i = 0; i < n; ++i) {
      int temp = sum - a[i];
      if (temp >= 0 && s.contains(temp)) {
        count++;
        System.out.println("Pair with given sum " + sum + " is : (" + a[i] + ", " + temp + ")");
      }
      s.add(a[i]);
    }
    return count;
  }
}
}