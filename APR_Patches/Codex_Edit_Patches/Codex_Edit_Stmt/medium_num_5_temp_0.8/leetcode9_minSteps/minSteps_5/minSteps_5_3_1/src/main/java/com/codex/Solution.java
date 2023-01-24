package com.codex;

import java.util.*;

public class Solution {
    // 给出一个源字符串S和一个目标字符串T。
    // 在S的子字符串中找出包含T所有字符的最小字符串。
    // 来源：力扣（LeetCode）
    // 链接：https://leetcode-cn.com/problems/minimum-window-substring
    // 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public static int minSteps(String s, String t) {
        
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }
        int step = 0;
        for (int i = 0; i < t.length(); i++) {
            if (hash[t.charAt(i) - 'a'] == 0){
                step++;
            } else {
                hash[t.charAt(i) - 'a']--;
            }
        }
        return step;
    }

    // 思路：
    // 1. 求出t中每个字母的个数，并且求出去获取t中，s中每个字母的个数
    // 2. 如果某个字母的个数，大于t中的个数，那么要去掉这个字母的多余
    // 3. 如果某个字母在s中没有出现，那么要去掉这个字母，就是加一个步数


}