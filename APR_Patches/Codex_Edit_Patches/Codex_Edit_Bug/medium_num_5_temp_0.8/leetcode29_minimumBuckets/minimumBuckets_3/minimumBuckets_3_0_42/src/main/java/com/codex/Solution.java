package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {
        

Input:
The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N and money.

Output:
Print maximum money he can rob.

Constraints:
1 ≤ T ≤ 100
1 ≤ money ≤ 100
1 ≤ N ≤ 1000

Example:
Input:
2
5 10
5 14

Output:
30
40

Explanation:
Test Case 1: Max money can be pilled as 10+10+10.
Test Case 2: Max money can be pilled as 10+14.


public static int minimumBuckets(String street) {

    char[] streetCharArr = street.toCharArray();
    int count = 0;
    for (int i = 0; i < streetCharArr.length; i++) {
        if (streetCharArr[i] == 'H') {
            if (i - 1 >= 0) {
                if (streetCharArr[i - 1] == '.') {
                    streetCharArr[i - 1] = 'B';
                    count++;
                }
            }
            if (i + 1 < streetCharArr.length) {
                if (streetCharArr[i + 1] == '.') {
                    streetCharArr[i + 1] = 'B';
                    count++;
                }
            }
        }
    }
    return count;
}

    
}