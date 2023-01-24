package com.codex;

import java.util.*;

public class Solution {
 List<Integer> res = new ArrayList<>();
 for (int i = 0; i < nums.length; i++) {
     if (nums[i] == target) {
        res.add(i);
     }
 }
 return res;
}