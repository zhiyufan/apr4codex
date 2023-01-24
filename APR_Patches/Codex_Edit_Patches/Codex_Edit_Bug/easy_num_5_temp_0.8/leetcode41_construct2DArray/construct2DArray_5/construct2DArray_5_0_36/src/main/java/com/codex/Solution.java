package com.codex;

import java.util.*;

public class Solution {
public class Solution
{
    public static int[][] form2DArray(int[] nums, int m, int n)
    {
        if (m * n != nums.length || nums.length == 0)
        {
            return new int[][] {};
        }

        int[][] result = new int[m][n];
        for (int i = 0; i < result.length; i++)
        {
            for (int j = 0; j < result[0].length; j++)
            {
                result[i][j] = nums[i * result[0].length + j];
            }
        }
        return result;
    }

}
}