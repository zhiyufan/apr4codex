package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

    public static int getLucky(String s, int k) {
        if (k == 0) {
            return 0;
        }

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result += (s.charAt(i) - 'a' + 1);
        }
        for (int i = 0; i < k; i++) {
            int temp = 0;
            while(result>0){
                temp += result % 10;
                result /= 10;
            }
            result = temp;
        }
        return result;
    }
}