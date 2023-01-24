package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class MinimalKSum {

  public static long minimalKSum(int[] nums, int k) {

    Arrays.sort(nums);

    long result = 0;
    int i = 0, j = 0;
    while (i < nums.length && j < k) {
      if (nums[i] <= j + 1) {
        result += nums[i++];
      } else {
        result += j + 1;
        j++;
      }
    }

    while (i < nums.length) {
      result += nums[i++];
    }

    while (j < k) {
      result += j + 1;
      j++;
    }

    return result;
  }

  public static void main(String... args) {
    Random random = new Random(0);

    long sum = 0;
    long count = 0;
    long min = Integer.MAX_VALUE;
    long max = Integer.MIN_VALUE;

    for (int i = 0; i < 1000; i++) {
      int k = random.nextInt(1000 * 1000 * 10) + 1;
      int n = random.nextInt(1000 * 1000 * 10) + 1;

      int[] results = new int[n];
      for (int j = 0; j < n; j++) {
        results[j] = random.nextInt(1000 * 1000 * 10) + 1;
      }

      long minKSum = minimalKSum(results, k);

      min = Math.min(min, minKSum);
      max = Math.max(max, minKSum);
      sum += minKSum;
      count++;
    }

    System.out.printf("%d %d %d %d\n", min, max, sum / count, count);

    Arrays.stream(args).mapToLong(Integer::parseInt)
        .reduce((l, r) -> l + r).ifPresent(value -> System.out.printf("%d\n", value));
  }

  public static int sum(int k, int[] results) {
    int sum = 0;
    for (int i = 1; i < results.length; i++) {
      if (results[i] < k) {
        sum += results[i];
      } else {
        sum += k;
        break;
      }
    }
    return sum;
  }

  static int solveSlow(int[] B, int k) {
    int n = B.length;
    int[] A = new int[n];
    for (int i = 0; i < n; i++) {
      A[i] = B[i];
    }
    Arrays.sort(A);
    int bestSum = 0;
    int bestK = 0;
    for (int i = 0; i < n; i++) {
      if (A[i] > k) {
        break;
      }
      int sum = 0;
      for (int val : A) {
        if (val >= A[i]) {
          break;
        }
        sum += val;
      }
      if (sum > bestSum) {
        bestSum = sum;
        bestK = A[i];
      }
    }

    return bestK * bestK + solveSlow(A, bestK);
  }
}
}