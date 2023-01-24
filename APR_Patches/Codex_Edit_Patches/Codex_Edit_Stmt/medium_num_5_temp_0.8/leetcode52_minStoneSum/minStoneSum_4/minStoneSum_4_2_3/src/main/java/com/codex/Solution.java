package com.codex;

import java.util.*;

public class Solution {
// // input: int[] piles, int k
// // output: int

// public int minStoneSum(int[] piles, int k) {
//     // Write your solution here
//     int max = piles[0];
//     long sum = 0;
//     for(int i = 0; i < piles.length; i++){
//       max = Math.max(max, piles[i]);
//       sum += piles[i];
//     }
//     long left = max, right = sum;
//     while(left < right){
//       long mid = left + (right - left) / 2;
//       if(cal(piles, mid) >= k){
//         right = mid;
//       } else{
//         left = mid + 1;
//       }
//     }
//     return (int)left;
//   }
  
//   private int cal(int[] piles, long avg){
//     int result = 0;
//     for(int i = 0; i < piles.length; i++){
//       result += piles[i] / avg;
//       if(piles[i] % avg != 0){
//         result++;
//       }
//     }
//     return result;
//   }

public class Solution {
  // iteration solution
  public int minStoneSum(int[] piles, int k) {
    // Write your solution here
    int max = piles[0];
    long sum = 0;
    for(int i = 0; i < piles.length; i++){
      max = Math.max(max, piles[i]);
      sum += piles[i];
    }
    long left = max, right = sum;
    while(left < right){
      long mid = left + (right - left) / 2;
      if(cal(piles, mid) >= k){
        right = mid;
      } else{
        left = mid + 1;
      }
    }

    return (int)left;
  }
  
  private int cal(int[] piles, long avg){
    int result = 0;
    for(int i = 0; i < piles.length; i++){
      result += piles[i] / avg;
      if(piles[i] % avg != 0){
        result++;
      }
    }
    return result;
  }
}
    
}