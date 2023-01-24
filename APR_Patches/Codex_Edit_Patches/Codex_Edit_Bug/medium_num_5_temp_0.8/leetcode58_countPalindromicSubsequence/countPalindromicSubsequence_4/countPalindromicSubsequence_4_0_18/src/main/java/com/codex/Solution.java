package com.codex;

import java.util.*;

public class Solution {
        /*
    Given a string s, find the number of different non-empty palindromic subsequences in s, and return that number modulo 10^9 + 7.

    A subsequence of a string S is obtained by deleting 0 or more characters from S.

    A sequence is palindromic if it is equal to the sequence reversed.

    Two sequences A_1, A_2, ... and B_1, B_2, ... are different if there is some i for which A_i != B_i.

    Example 1:
    
    Input: 
    S = 'bccb'
    Output: 6
    */

    /*
    All palindromic subsequence of a string with length 1, 2 and 3 will be it's own character.
    eg. 
    s = 'a' => 'a'
    s = 'ab' => 'a', 'b', 'aa', 'bb', 'ab'
    s = 'abc' => 'a', 'b', 'c', 'aa', 'bb', 'cc', 'aba', 'baa', 'cba'

    We can brute force our way through this problem.
    Notice that there must be at least two similar characters for any palindromic subsequence to work.
    So we can iterate through the string, and find all substrings of length 3 or more which have a palindromic
    subsequence.

    Complexity analysis:
    Time: O(n^3)
    Space: O(n)
    */

    public static int countPalindromicSubsequence(String s) {
        
        Set<String> set = new HashSet<>();
        int len = s.length();
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 2; j < len; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    set.add(s.substring(i, j + 1));
                }
            }
        }
        return set.size();
    }

    
}