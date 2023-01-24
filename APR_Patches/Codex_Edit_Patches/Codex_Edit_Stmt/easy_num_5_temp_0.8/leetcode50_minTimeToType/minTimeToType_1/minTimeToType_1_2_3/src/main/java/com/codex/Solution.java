package com.codex;

import java.util.*;

public class Solution {
    /**
         * 我们定义一个数组 pos 来保存每个字符在手机键盘上的位置，
         * 对于一个字符串 word，那么至少需要移动 word[0] - 'a' + 1 次才能把它输入，
         * 对于每个字符，我们都需要计算它到所有字符最少需要移动的位置，那么我们可以在枚举到哪个位置的时候，
         * 用一个变量 cur 记录当前所在的位置，用一个变量 res 记录当前结果
         * min(abs(pos[word[i] - 'a'] - cur), 26 - abs(pos[word[i] - 'a'] - cur))
         * @param word
         * @return
         */
    public static int minTimeToType(String word) {
        

        int[] pos = new int[26];
        int i = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            pos[ch - 'a'] = i++;
        }

        int cur = 0, res = 0;
        for (char ch : word.toCharArray()) {
            res += Math.min(Math.abs(pos[ch - 'a'] - cur), 26 - Math.abs(pos[ch - 'a'] - cur));

    public static int minTimeToTypeV1(String word) {
        char[] chars = word.toCharArray();
        int curLoc = chars[0] - 'a';
        int res = curLoc + 1;
        for (int i = 1; i < chars.length; i++) {
            int loc = chars[i] - 'a';
            if (curLoc < loc) {
                res += loc - curLoc;
            } else if (curLoc > loc) {
                res += 26 - (curLoc - loc);
            }
            curLoc = loc;
        }
        return res;
    }
            cur = pos[ch - 'a'];
        }
        return res;
    }
}