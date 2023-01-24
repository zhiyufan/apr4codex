package com.codex;

import java.util.*;

public class Solution {
We are given an array A of N lowercase letter strings, all of the same length.

Now, we may choose any set of deletion indices, and for each string, we delete all the characters in those indices.

For example, if we have an array A = ["abcdef","uvwxyz"] and deletion indices {0, 2, 3}, then the final array after deletions is ["bef","vyz"].

Suppose we chose a set of deletion indices D such that after deletions, the final array has every element (row) in lexicographic order.

    For clarity, A[0] is in lexicographic order (ie. A[0][0] <= A[0][1] <= ... <= A[0][A[0].length - 1]), A[1] is in lexicographic order (ie. A[1][0] <= A[1][1] <= ... <= A[1][A[1].length - 1]), and so on.

Return the minimum possible value of D.length.

 

    Example 1:

        Input: ["ca","bb","ac"]
        Output: 1
        Explanation: 
        After deleting the first column, A = ["a", "b", "c"].
        Now A is in lexicographic order (ie. A[0][0] <= A[0][1] <= ... <= A[0][A[0].length - 1]).
        We require at least 1 deletion since initially A was not in lexicographic order, so the answer is 1.

    Example 2:

        Input: ["xc","yb","za"]
        Output: 0
        Explanation: 
        A is already in lexicographic order, so we don't need to delete anything.
        Note that the rows of A are not necessarily in lexicographic order:
        ie. it is NOT necessarily true that (A[0][0] <= A[0][1] <= ... <= A[0][A[0].length - 1])

    Example 3:

        Input: ["zyx","wvu","tsr"]
        Output: 3
        Explanation: 
        We have to delete every column.

 

    Note:

        1 <= A.length <= 100
        1 <= A[i].length <= 100


    public static String findDifferentBinaryString(String[] nums) {
        
        int ans = 0;
        
        for(int i = 0; i < nums[0].length(); i++) {
            for(int j = 1; j < nums.length; j++) {
                if(nums[j - 1].charAt(i) > nums[j].charAt(i)) {
                    ans++;
                    break;
                }
            }
        }
      
        
        return ans;
    }
}