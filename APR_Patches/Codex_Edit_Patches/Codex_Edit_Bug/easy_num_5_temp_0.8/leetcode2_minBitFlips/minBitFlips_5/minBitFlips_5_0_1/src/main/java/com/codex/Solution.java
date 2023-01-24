package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int MinMoves(int[] nums) {

        int min = nums.Min();
        int sum = 0;
        foreach (int n in nums) {
            sum += (n - min);
		}
        return sum;
    }

}
}