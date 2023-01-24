package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public String findDifferentBinaryString(String[] nums) {
       
       int[] r = new int[nums[0].length()];
       int[] c = new int[nums[0].length()];
       
       for (String num : nums) {

          for (int i = 0; i < num.length(); i++) {
             if (num.charAt(i) == '0'?) {
                r[i]++;
             } else {
                c[i]++;
             }
          }
       }
       
       StringBuilder sb = new StringBuilder();
       for (int i = 0; i < nums[0].length(); i++) {
          if (r[i] > c[i]) {
             sb.append('0');
          } else {
             sb.append('1');
          }
       }
       return sb.toString();
    }
}
}