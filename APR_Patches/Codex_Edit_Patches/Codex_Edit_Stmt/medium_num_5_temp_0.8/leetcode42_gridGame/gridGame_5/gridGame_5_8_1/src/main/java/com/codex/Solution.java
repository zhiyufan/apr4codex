package com.codex;

import java.util.*;

public class Solution {
public class Main {
  public static void main(String[] args) {
    int[] array = {1, 2, 3};
    int[] array1 = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      array1[i] = array[i];
    }

    for (int i : array1) {
      System.out.println(i);
    }
  }
}
}