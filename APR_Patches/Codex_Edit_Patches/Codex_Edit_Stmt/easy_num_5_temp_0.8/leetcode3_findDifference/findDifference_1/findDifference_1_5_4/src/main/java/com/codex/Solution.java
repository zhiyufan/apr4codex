package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int[] FindDisappearedNumbers(int[] nums) {
        var res = new List<int>();
        for (var i = 1; i <= nums.Length; i++) {
            res.Add(i);
        }
        for (var i = 0; i < nums.Length; i++) {
            res.Remove(nums[i]);
        }
        return res.ToArray();
    }
}
}