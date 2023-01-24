package com.codex;

import java.util.*;

public class Solution {
 public static int minSteps(String s, String t) {
        int[] count = new int[26];
        for (int i = 0 ; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        int result = 0;
        for (int i = 0 ; i < t.length(); i++) {
            if (count[t.charAt(i) - 'a'] == 0) {
                result++;
            } else {
                count[t.charAt(i) - 'a']--;
            }
        }
        return result;
    }
// 使用一个26长度的数组来存储s中字符出现的次数，如果t中有这个字符，则次数减少1，
// 如果没有这个字符，则代表这个字符必须被删除，所以结果加1
}