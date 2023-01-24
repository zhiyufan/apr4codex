package com.codex;

import java.util.*;

public class Solution {
public class Solution {
  public String largestNumber(int[] nums) {
    String[] temp = new String[nums.length];
    for (int i = 0; i < nums.length; i++) {
      temp[i] = String.valueOf(nums[i]);
    }
    Arrays.sort(temp, new Comparator<String>() {
      @Override
      public int compare(String str1, String str2) {
        String s1 = str1 + str2;
        String s2 = str2 + str1;
        return s2.compareTo(s1);
      }
    });
    StringBuilder sb = new StringBuilder();
    for (String str: temp) {
      sb.append(str);
    }
    while (sb.charAt(0) == '0' && sb.length() > 1) {
      sb.deleteCharAt(0);
    }
    return sb.toString();
  }
}

// another solution
public class Solution {
    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Collections.reverse(res);
        return String.join("", res);
    }

    
}