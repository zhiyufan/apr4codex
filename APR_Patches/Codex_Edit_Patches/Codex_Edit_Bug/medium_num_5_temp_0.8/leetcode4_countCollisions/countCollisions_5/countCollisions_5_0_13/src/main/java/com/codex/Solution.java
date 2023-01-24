package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int countCollisions(String directions) {
        int num = 0;
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < directions.length(); ++i)
            list.add(directions.charAt(i));
        int i = 0;
        while (i < list.size()) {
            char cur = list.get(i);
            if (cur == 'S') {
                list.remove(i);
                continue;
            }
            int j = i + 1;
            while (j < list.size()) {
                if (list.get(j) == cur) {
                    list.remove(j);
                    ++num;
                } else
                    ++j;
            }
            for (j = 0; j < i; ++j) {
                if (list.get(j) != cur) {
                    ++num;
                    list.remove(j);
                    --i;
                    break;
                }
                ++j;
            }
            ++i;
        }
        return num;
    }

}
}