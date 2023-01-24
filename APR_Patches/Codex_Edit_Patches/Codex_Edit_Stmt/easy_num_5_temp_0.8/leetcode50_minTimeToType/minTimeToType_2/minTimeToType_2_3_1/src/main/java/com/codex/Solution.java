package com.codex;

import java.util.*;

public class Solution {

    /**
    * 每次按键都需要考虑，当前按键与上一个按键的大小关系，要么从左往右按，要么从右往左按。
    * 所以每次按键都可以看做一个新的开始，这次按键和它之前的所有按键之间的距离一样，而且这次按键和它之后的所有按键距离也一样，所以不用考虑跟后面的按键关系。
    *
    * 每次只需要考虑当前按键和上一个之间的距离，即两个字符之间的距离。这个距离也就是可以从左往右的距离也可以从右往左的距离。
    * 为了方便计算，我们假设从左往右计算，那么从右往左就是倒着计算。
    * 所以每个字符之间的距离可以看做是Math.abs(cur - next) ，但是有一个特殊情况是，cur是z，next是a的时候，会计算出负值。
    * 所以我们要考虑一下这种情况，其实就是用一个26 - Math.abs(cur - next)的结果代替每次的Math.abs(cur - next)的结果。
    * 每次只需要考虑直接按那个键更少
    *
    * 时间复杂度：
    * O(n)
    *
    * @param word string字符串
    * @return int整型
    */
    public static int minTimeToType(String word) {
        

                if (word == null || word.length() == 0) {
            return 0;
        }

        int res = 0, len = word.length();
        int cur = 0;

        for (int i = 0; i < len; i++) {
            int next = word.charAt(i) - 'a';
            res += Math.min(Math.abs(next - cur), 26 - Math.abs(next - cur));
            cur = next;
        }

        return res;
    }

    
}