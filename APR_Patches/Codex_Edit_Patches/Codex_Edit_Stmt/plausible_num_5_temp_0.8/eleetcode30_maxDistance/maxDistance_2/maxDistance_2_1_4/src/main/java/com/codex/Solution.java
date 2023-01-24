package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        

        int n = colors.length;
        int maxDist = 0;
        int lastColor = -1;
        int lastColorPos = 0;
        for (int i = 0; i < n; i++) {
            if (colors[i] != lastColor) {
                if (lastColor != -1) {
                    maxDist = Math.max(maxDist, i - lastColorPos);
                }
                lastColor = colors[i];
                lastColorPos = i;
            }
        }
        return maxDist;
    }

    /*
    解法：
    题目要求找出最大相等距离， 因为数组只有3种元素（0,1,2），所以只要找出color[i] != color[i+1]的情况，计算其长度，与
    已经存在的最大长度比较，取最大值即可。

    细节：
    1. 我们要对长度进行比较，所以需要记录上一个颜色元素所在的位置lastColorPos。但是初始化的时候需要让它不在数组范围内，
    同时没有-1的话与i相减的结果不会正确，所以初始化为-1.

    2. 由于lastColorPos的初始化值为-1，所以此时lastColor = -1也是正确的。

    3. 当lastColorPos = -1时，i与lastColorPos相减，结果肯定是在0以上的，所以不会对maxDist的结果产生影响，这种情况也不需要
    重新更新maxDist.
     */
    /*
    Time: O(n)
    Space: O(1)
     */


}