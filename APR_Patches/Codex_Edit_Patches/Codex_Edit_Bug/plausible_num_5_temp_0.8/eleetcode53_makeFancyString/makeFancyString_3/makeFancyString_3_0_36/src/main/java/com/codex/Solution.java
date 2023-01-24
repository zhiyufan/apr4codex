package com.codex;

import java.util.*;

public class Solution {
public class ArrayTest {
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5, 6};
    int[] b = a;
    System.out.println(b[5]);
    int c = a[5];
    c = 0;
    System.out.println(b[5]);
  }
}
}