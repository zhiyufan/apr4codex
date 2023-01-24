package com.codex;

import java.util.*;

public class Solution {
    public static String[] divideString(String s, int k, char fill) {
        /** A string s can be partitioned into groups of size k using the following procedure:
         * The first group consists of the first k characters of the string, the second group consists of the next k characters of the string, and so on. Each character can be a part of exactly one group.
         * For the last group, if the string does not have k characters remaining, a character fill is used to complete the group.
         * Note that the partition is done so that after removing the fill character from the last group (if it exists) and concatenating all the groups in order, the resultant string should be s.
         * Given the string s, the size of each group k and the character fill, return a string array denoting the composition of every group s has been divided into, using the above procedure.
         */
        int length = s.length();
        ArrayList<String> result = new ArrayList<>();
        if (length == k) {
            result.add(s);
            return result.toArray(new String[0]);
        }
        for (int i = 0; i < length; i += k) {
            if (length - i >= k) {
                result.add(s.substring(i, i + k));
            } else {
                StringBuilder sb = new StringBuilder(s.substring(i));
                for (int j = 0; j < k - (length - i); j++) {
                    sb.append(fill);
                }
                result.add(sb.toString());
            }
        }
        return result.toArray(new String[0]);
    }

    }