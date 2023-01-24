package com.codex;

import java.util.*;

public class Solution {

  public static int numberOfBeams(String[] bank) {
    
      int beams = 0;
      for(int i = 0; i < bank.length; ++i){
          for(int j = 0; j < bank[i].length(); ++j){
              if(bank[i].charAt(j) == '1'){
                  for(int k = i + 1; k < bank.length; ++k){
                      if(bank[k].charAt(j) == '1'){
                          if(checkBeam(bank, i, k, j)){
                              beams += 1;
                          }
                          break;
                      }
                  }
              }
          }
      }
      return beams;
  }

  private static boolean checkBeam(String[] bank, int i, int k, int j){
      for(int w = i + 1; w < k; ++w){
          if(bank[w].charAt(j) == '1'){
              return false;
          }
      }
      return true;
  }
  
  
  
  /*
  
  public static int numberOfBeams(String[] bank) {
    
      int beams = 0;
      for(int i = 0; i < bank.length; ++i){
          for(int j = 0; j < bank[i].length(); ++j){
              if(bank[i].charAt(j) == '1'){
                  for(int k = i + 1; k < bank.length; ++k){
                      if(bank[k].charAt(j) == '1'){
                          if(checkBeam(bank, i, k, j)){
                              beams += 1;
                          }
                          break;
                      }
                  }
              }
          }
      }
      return beams;
  }

  private static boolean checkBeam(String[] bank, int i, int k, int j){
      for(int w = i + 1; w < k; ++w){
          if(bank[w].charAt(j) == '1'){
              return false;
          }
      }
      return true;
  }
  
  
  */
  
  
  
  /*

  class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        int[] leader = new int[N];
        int count = 0;
        int lastLeader = 0;
        
        for(int i = 0; i < N; ++i){
            if(count == 0){
                leader[i] = lastLeader;
                ++count;
            } else if(A[i] == leader[lastLeader]){
                leader[i] = leader[lastLeader];
                ++count;
            } else {
                leader[i] = lastLeader;
                --count;
                }
            }
        }
        
        count = 0;
        for(int i = 0; i < N; ++i){
            if(A[i] == leader[N - 1]){
                ++count;
            }
        }
        
        if(count < (N + 1)/2){
            return 0;
        }
        
        count = 0;
        int equiLeader = 0;
        for(int i = 0; i < N; ++i){
            if(A[i] == leader[N - 1]){
                ++count;
            }
            if(count > (i + 1)/2 && (count - 1) > (N - i - 1)/2){
                ++equiLeader;
            }
        }
        
        return equiLeader;
    }
  
  
  
  
  
  */
 
}
    
}