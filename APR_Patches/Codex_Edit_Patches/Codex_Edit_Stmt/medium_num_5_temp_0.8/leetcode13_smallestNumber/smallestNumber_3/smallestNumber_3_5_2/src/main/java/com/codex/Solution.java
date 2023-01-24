package com.codex;

import java.util.*;

public class Solution {

public class Solution {
    static void kangaroo(int x1, int v1, int x2, int v2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        while (x1 < x2 && v1 > v2) {
            x1 *= v1;
            x2 *= v2;
            list1.add(x1);
            list2.add(x2);
        }
        list1.retainAll(list2);
        if (list1.isEmpty()) System.out.println("NO");
        else System.out.println("YES");
    }

    public static void main(String[] args) {
        kangaroo(0, 3, 4, 2);
    }
}
}