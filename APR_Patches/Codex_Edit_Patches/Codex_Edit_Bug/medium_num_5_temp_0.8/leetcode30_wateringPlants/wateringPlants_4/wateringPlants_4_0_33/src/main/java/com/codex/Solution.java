package com.codex;

import java.util.*;

public class Solution {
    public static int play(int[] arr, int k) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int pos = 0;
        int removed = 0;
        while (k != 0) {
            if (list.size() == 1) {
                return removed;
            }
            if ((pos + k) >= list.size()) {
                pos = 0;
            } else {
                list.remove(pos + k);
                removed++;
                pos = (pos + k) % (list.size());
            }
            k--;
        }
        return removed;
    }
}