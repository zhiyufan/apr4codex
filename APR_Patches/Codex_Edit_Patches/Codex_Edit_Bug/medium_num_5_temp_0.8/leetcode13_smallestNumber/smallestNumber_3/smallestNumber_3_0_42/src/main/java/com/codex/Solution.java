package com.codex;

import java.util.*;

public class Solution {
import java.util.Comparator;

class Solution {
    public String[] solution(String[] strings, int n) {
        Comparator<String> compare = (o1, o2) ->
        {
            int ret = o1.charAt(n) - o2.charAt(n);
            if(ret==0)
                ret = o1.compareTo(o2);
            return ret;
        };
        Arrays.sort(strings,compare);

        return strings;
    }
}
}