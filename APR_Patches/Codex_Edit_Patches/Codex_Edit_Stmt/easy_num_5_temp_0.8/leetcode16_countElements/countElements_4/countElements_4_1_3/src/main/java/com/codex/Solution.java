package com.codex;

import java.util.*;

public class Solution {
public static int countElements(int[] nums) {

  if (nums == null || nums.length == 0) {
    return 0;
  }
  Arrays.sort(nums);

  int count = 0;
  for (int i = 1; i < nums.length - 1; i++) {
    if (nums[i] > nums[i - 1] && nums[i] < nums[i + 1]) {
      count++;
    }
  }
  return count;
}

// 懒得排序，用hashmap做
public int countElements(int[] arr) {
    int count = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
        map.put(arr[i], i);
    }
    for (int i = 0; i < arr.length; i++) {
        Integer idx = map.get(arr[i] + 1);
        if (idx != null) {
            if (idx != i) { // 防止"11,11,12"这种情况
                count++;
            }
        }
    }
    return count;
}

// 不用hashmap，用两个数组加一个变量维护
// 你懂的，我也不懂
public int countElements(int[] arr) {
    int count = 0;
    int[] table = new int[1002];
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
        table[arr[i]]++;
    }

    for (int i = 0; i < arr.length; i++) {
        if (table[arr[i] + 1] > 0) { // 只要后面的存在的话，那么就统计+1
            count++;
        }
    }
    return count;
}

// 不用hashmap，也不用两个数组加一个变量维护，也不用排序
// 只是维护一个set，把所有后面存在的数组都放里面
// 看着帅
public int countElements(int[] arr) {
    int count = 0;
    Set<Integer> set = new HashSet<>();
    for (int num : arr) {
        set.add(num + 1);
    }
    for (int num : arr) {
        if (set.contains(num)) {
            count++;
        }
    }
    return count;
}
}