package com.codex;

import java.util.*;

public class Solution {
package com.gprasad.interviewbit.programing.javasol.level2.array;
/*
 
 You are given an integer array A.  From some starting index, you can make a series of jumps.  The (1st, 3rd, 5th, ...) jumps in the series are called odd numbered jumps, and the (2nd, 4th, 6th, ...) jumps in the series are called even numbered jumps.

You may from index i jump forward to index j (with i < j) in the following way:

During odd numbered jumps (ie. jumps 1, 3, 5, ...), you jump to the index j such that A[i] <= A[j] and A[j] is the smallest possible value.  If there are multiple such indexes j, you can only jump to the smallest such index j.
During even numbered jumps (ie. jumps 2, 4, 6, ...), you jump to the index j such that A[i] >= A[j] and A[j] is the largest possible value.  If there are multiple such indexes j, you can only jump to the smallest such index j.
(It may be the case that for some index i, there are no legal jumps.)
A starting index is good if, starting from that index, you can reach the end of the array (index A.length - 1) by jumping some number of times (possibly 0 or more than once.)

Return the number of good starting indexes.

Input Format:

The first and the only argument of input will be an integer array A.

Output Format:

Return an integer, representing the answer as described in the problem statement.

Constraints:

1 <= length of the array <= 100000
1 <= A[i] <= 10^9

Example :

Input 1:
    A = [10, 13, 12, 14, 15]

Output 1:
    2

Explanation 1:
    From starting indexes 0, 3, you can jump to the end of the array.

Input 2:
    A = [2, 3, 1, 1, 4]

Output 2:
    3

Explanation 2:
    From starting indexes 0, 1, 2, you can jump to the end of the array.

 * */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddEvenJump {
    public static int minDeletion(int[] A) {
        List<Integer> a = new ArrayList<>();
        for(int i:A)a.add(i);
        int count = 0;
        boolean odd = false, even = false;
        for (int i = 0; i < a.size() - 1; i++) {
            if (i % 2 == 0 && a.get(i) >= a.get(i + 1)) {
                count++;
                a.remove(i + 1);
                i = -1;
            } else if (i % 2 != 0 && a.get(i) <= a.get(i + 1)) {
                count++;
                a.remove(i + 1);
                i = -1;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(minDeletion(new int[]{10,13,12,14,15}));
    }
}
    
}