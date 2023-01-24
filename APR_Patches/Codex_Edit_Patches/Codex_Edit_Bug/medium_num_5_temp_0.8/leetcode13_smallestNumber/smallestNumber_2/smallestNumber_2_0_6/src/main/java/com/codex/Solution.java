package com.codex;

import java.util.*;

public class Solution {
Function Main()
            Dim n As Long
            n = ListOfNumbers().Average()
            SmallNumber(n) 
    End Function

    Function ListOfNumbers() As List(Of Long)
        Dim nums As List(Of Long) = New List(Of Long)
        nums.Add(123)
        nums.Add(123456)
        nums.Add(324)
        nums.Add(0)
        nums.Add(3)
        nums.Add(799)
        nums.Add(12399)

        Return nums
    End Function

    Function SmallNumber(num As Long) As Long
        
        long n = num;
        ArrayList<Integer> nums = new ArrayList<>();
        while (n > 0) {
            nums.add((int)(n % 10));
            n = n / 10;
        }
        Collections.sort(nums);
        if (nums.get(0) == 0) {
            for (int i = 1; i < nums.size(); i++) {
                if (nums.get(i) != 0) {
                    int temp = nums.get(0);
                    nums.set(0, nums.get(i));
                    nums.set(i, temp);
                    break;
                }
            }
        }
        n = 0;
        for (int i = 0; i < nums.size(); i++) {
            n = 10 * n + nums.get(i);
        }
        Return n
    End Function

    
}