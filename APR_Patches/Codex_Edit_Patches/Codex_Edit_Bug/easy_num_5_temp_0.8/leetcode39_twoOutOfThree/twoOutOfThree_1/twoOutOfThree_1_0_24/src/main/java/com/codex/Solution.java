package com.codex;

import java.util.*;

public class Solution {
public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

      List<Integer> result = new ArrayList<>(nums1.length + nums2.length + nums3.length);
      for (int i = 0; i < nums1.length; i++) {
          result.add(nums1[i]);
      }
      for (int i = 0; i < nums2.length; i++) {
          result.add(nums2[i]);
      }
      for (int i = 0; i < nums3.length; i++) {
          result.add(nums3[i]);
      }
      Set<Integer> set = new HashSet<>();
      for (int i = 0; i < result.size(); i++) {
          if (set.contains(result.get(i))) {
              result.remove(i);
              i--;
          } else {
              set.add(result.get(i));
          }
      }
      return result;
  }
    }

    
}