package com.codex;

import java.util.*;

public class Solution {
public class Solution {
  public int countElements(int[] arr) {

        int result = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int i : arr) {
            set.add(i);
        }

        for (int i : arr) {
            if (set.contains(i + 1)) {
                result++;
            }
        }
        return result;
    }

    
}