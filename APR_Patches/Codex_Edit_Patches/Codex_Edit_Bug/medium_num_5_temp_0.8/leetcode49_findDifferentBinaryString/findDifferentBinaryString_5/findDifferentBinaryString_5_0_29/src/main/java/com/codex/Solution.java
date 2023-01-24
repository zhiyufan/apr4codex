package com.codex;

import java.util.*;

public class Solution {
public class test {
  public static void main(String[] args) {
    System.out.println(findDifferentBinaryString(new String[]{"1010", "1100", "1101", "1110"}));
  }

  public static String findDifferentBinaryString(String[] nums) {
    int[] counts = new int[nums[0].length()];
    int length = nums.length;
    for (int i = 0; i < nums.length; i++) {
      char[] current = nums[i].toCharArray();
      for (int j = 0; j < current.length; j++) {
        counts[j] += (current[j] == '1' ? 1 : 0);
        if (counts[j] > length / 2) counts[j]--;
      }
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < counts.length; i++) {
      sb.append(counts[i] * 2 > nums.length ? '0' : '1');
    }
    return sb.toString();
  }

}
    
}