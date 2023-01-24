package com.codex;

import java.util.*;

public class Solution {
public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(10, 20, 30, 40, 50);
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(list1);
        lists.add(list2);
        System.out.println(lists);
        List<Integer> list = new ArrayList<>();
        for (List<Integer> subList : lists) {
            for (int i = 0; i < subList.size(); i++) {
                int value = subList.get(i);
                list.add(value);
            }
        }
}
        System.out.println(list);
    }
}