package com.codex;

import java.util.*;

public class Solution {
public class DeleteMin {

  public static void main(String[] args) {
    int [] arr = {12, 8, 76, 5, 6, 11, 9};
    System.out.println("Min is: " + getMin(arr));
  }

  public static int getMin(int [] arr) {

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
    }

    return min;
  }
}
}