package com.codex;

import java.util.*;

public class Solution {
package com.programming.practice.problems.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a
 * specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same
 * element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 *
 * @see <a href = "https://leetcode.com/problems/two-sum/">Two Sum</a>
 * @author Swapnil Godambe.<br>
 *     Copyright 2020.
 */
public final class TwoSum {

  /**
   * Given an array of integers, return indices of the two numbers such that they add up to a
   * specific target.
   *
   * @param nums The array of numbers.
   * @param target The target to evaluate against.
   * @return The indices of the two numbers.
   */
  public int[] twoSum(final int[] nums, final int target) {

    final List<Integer> indices = new ArrayList<>();

    for (int currentIndex = 0; currentIndex < nums.length; ++currentIndex) {
      for (int innerIndex = currentIndex + 1; innerIndex < nums.length; ++innerIndex) {
        if (target == nums[currentIndex] + nums[innerIndex]) {
          indices.add(currentIndex);
          indices.add(innerIndex);
        }
      }
    }

    final int[] indicesArray = new int[indices.size()];

    for (int i = 0; i < indices.size(); ++i) {
      indicesArray[i] = indices.get(i);
    }

    return indicesArray;
  }
}

    
}