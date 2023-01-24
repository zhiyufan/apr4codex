package com.codex;

import java.util.*;

public class Solution {
package codeWars.kyu7.equalSidesOfAnArray_20200628;

import java.util.Arrays;

public class Kata {

  public static int findEvenIndex(int[] arr) {
    int totalSum = Arrays.stream(arr).sum();
    int left = 0;
    for (int i = 0; i < arr.length; i++) {
      if (i != 0) {
        left += arr[i - 1];
        }
      int right = totalSum - left - arr[i];
      if (left == right) {
        return i;
      }
    }
    return -1;
  }
}


public static int findEvenIndex(int[] arr) {
    for(int i=0; i<arr.length; i++){
        int left = IntStream.range(0, i).map(a -> arr[a]).sum();
        int right = IntStream.range(i+1, arr.length).map(a -> arr[a]).sum();
        if(left == right) return i;
    }
    return -1;
}

    
}