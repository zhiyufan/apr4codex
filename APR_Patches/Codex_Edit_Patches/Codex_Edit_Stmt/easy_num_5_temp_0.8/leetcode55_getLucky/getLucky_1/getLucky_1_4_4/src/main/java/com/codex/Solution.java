package com.codex;

import java.util.*;

public class Solution {
public static int getLucky(String s, int k) {
        int[] arr = new int[]{4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};
        int temp = 0;

        int result = 0;
        for (int i = 0; i < s.length(); i++) result += s.charAt(i) - 'a' + 1;
        for (int i = 0; i < k; i++) {
            while (result > 0) {temp += result % 10; result /= 10;}
            result = temp;
        }    
        for (int i = 0; i < arr.length; i++) if (result == arr[i]) return 1;
        return result;
    }
}
}