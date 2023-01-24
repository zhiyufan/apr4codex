package com.codex;

import java.util.*;

public class Solution {
namespace Sandbox
{
    using System;
    using System.Collections.Generic;

    public class Program
    {
        public static int[] GetAverages(int[] nums, int k)
        {
            var avgs = new int[nums.Length];
            for (var i = 0; i < nums.Length; i++)
            {
                var sum = 0;
                for (var j = i - k; j <= i + k; j++)
                {
                    if (j < 0 || j >= nums.Length)
                    {
                        continue;
                    }
                    sum += nums[j];
                }
                avgs[i] = sum / (2 * k + 1);
            }
            return avgs;
        }
        

        public static void Main(string[] args)
        {
            var nums = new[] { 3, 5, 7, 2, 8, 10, 11, 65, 72, 81, 99, 100, 150 };
            Console.WriteLine(string.Join(",", GetAverages(nums, 3)));
            Console.ReadKey();
        }
    }
}
}