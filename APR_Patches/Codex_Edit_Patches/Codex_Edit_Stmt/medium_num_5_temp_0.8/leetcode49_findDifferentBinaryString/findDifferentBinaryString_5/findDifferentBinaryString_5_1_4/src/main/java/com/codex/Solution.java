package com.codex;

import java.util.*;

public class Solution {
public String findDifferent(String[] strs) {
  int n = strs.length;
  StringBuilder sb = new StringBuilder();
  if(n == 0) return sb.toString();
  if(n == 1) return strs[0];
  int[] count = new int[n];
  for(int i = 0; i < n; i++){
    for(int j = 0; j < strs[i].length(); j++){
      if(strs[i].charAt(j) == '1'){
        count[j]++;
      }
    }

  }
  for(int i = 0; i < n; i++){
    if(count[i] % 3 != 0){
      sb.append('1');
    }else{
      sb.append('0');
    }
  }
  return sb.toString();
}
}