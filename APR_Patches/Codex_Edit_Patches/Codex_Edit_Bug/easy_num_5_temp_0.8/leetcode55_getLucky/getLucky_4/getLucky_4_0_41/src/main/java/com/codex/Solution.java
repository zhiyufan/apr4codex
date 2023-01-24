package com.codex;

import java.util.*;

public class Solution {
import java.util.HashMap;
import java.util.Map;
    public static int getLucky(String s, int k) {
        

        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans += (s.charAt(i) - 'a' + 1);
        }

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        map.put(ans, count);
        while (k > 0 && !map.containsKey(ans)) {
            System.out.println(ans);
            count++;
            int temp = 0;
            while (ans > 0) {
                temp += ans % 10;
                ans /= 10;
            }
            ans = temp;
            if(!map.containsKey(ans))
                map.put(ans, count);
            k = k - count;
        }
        return ans;
    }
}