package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class SmallestNumberUtil {
    
    private SmallestNumberUtil(){}
    
    public static long smallestNumber(long num) {

        List<Integer> list = new ArrayList<>();
        while (num != 0) {
            list.add((int) num % 10);
            num /= 10;
        }
        list.sort(Integer::compareTo);
        long answer = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            answer *= 10;
            answer += list.get(i);
        }
        return answer;
    }
}
    
}