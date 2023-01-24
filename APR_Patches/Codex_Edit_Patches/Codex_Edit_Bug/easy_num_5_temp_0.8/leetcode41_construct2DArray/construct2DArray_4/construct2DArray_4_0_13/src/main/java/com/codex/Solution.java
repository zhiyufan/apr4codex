package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
import java.util.LinkedList;

class Solution {
  public static int[][] construct2DArray(int[] original, int m, int n) {
        
      int[][] arr = new int[m][n];
      int k = 0;
      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
          if (k < original.length) {
            arr[i][j] = original[k];
            k += 1;
          }else{
            arr[i][j] = 0;
          }
        }
      }
      return arr;
    }
  }

  public static void main(String[] args){
    int[] arr = {1,2,3,4,5,6};
    int[][] twoD = construct2DArray(arr,2,3);
  }
}

    
}