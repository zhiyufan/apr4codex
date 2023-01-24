package com.codex;

import java.util.*;

public class Solution {
public static int minimumCost(int[] cost) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i : cost) {
        list.add(i);
    }

    Collections.sort(list);
    List<Integer> resultList = list.subList(0, list.size() - 2);
    return resultList.stream().mapToInt(Integer::intValue).sum();
}
}