package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int MinOperations(int[] nums, int x) {
        var sum = 0;
        var pos = new int[nums.Length];
        var length = pos.Length;
        for (var i = 0; i < length; i++)
        {
            sum += nums[i];
            pos[i] = sum;
        }
        if (sum < x) return -1;
        for (var i = 0; i < length; i++)
        {
            var diff = pos[i] - x;
            if (diff == 0)
                return length - i;
            if (diff < 0) continue;
            var index = BinarySearch(diff, pos);
            if (index == -1)
                continue;
            return index < i ? -1 : length - i + index;
        }
        return -1;
    }
    
    private int BinarySearch(int x, int[] nums)
    {
        var left = 0;
        var right = nums.Length - 1;
        while (left <= right)
        {
            var mid = left + (right - left) / 2;
            if (nums[mid] == x)
                return mid;
            if (nums[mid] < x)
                left = mid + 1;
            else
}
                right = mid - 1;
        }
        return -1;
    }
}