package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        
        int[] letters = new int[26];
        int res = 0;
        for (char c : s.toCharArray()) {
            letters[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            letters[c - 'a']--;
        }
        for (int i : letters) {
            res += Math.abs(i);
        }
        return res / 2;
    }

首先这道题很好的考验了我们的知识和技巧，但是更好的是，它让我们在程序运行过程中，去想需要哪些东西，哪些数据结构有什么用，这是我们需要不断去练习和提高的。

技巧：

1.设计数据结构，使其能够存储和计算所有需要的字母数量

2.用最小代价解决问题，这里有个小技巧，比如这里我们只需要计算出需要替换的字符即可，因为我们知道字符的长度是相同的，所以计算出需要替换的字符数，除以2即可。
    
}