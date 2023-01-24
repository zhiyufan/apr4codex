package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;
public class StringManipulateTest 
{
    public static void main(String[] args)
    {
        StringManipulate test = new StringManipulate();
        System.out.println(test.toString(test.sumOfThree(9L)));
    }
}
class StringManipulate
{
    public static long[] sumOfThree(long num) 
    {
        if (num < 3) return new long[0];

        for (long a = 1; a < num - 1; ++a) 
        {
            for (long b = a + 1; b < num; ++b) 
            {
                for (long c = b + 1; c < num + 1; ++c) 
                {
                    if (a + b + c == num) 
                    {
                        return new long[]{a, b, c};
                    }
                }
            }
        }
        return new long[0];
    }

    public String toString(long[] nums) 
    {
        return Arrays.toString(nums);
    }
}
}