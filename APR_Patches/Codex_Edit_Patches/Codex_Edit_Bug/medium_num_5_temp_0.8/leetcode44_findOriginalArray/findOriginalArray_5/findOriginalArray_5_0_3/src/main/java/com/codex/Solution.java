package com.codex;

import java.util.*;

public class Solution {
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num1[] = {1, 2, 3, 4};
        int num2[] = {3, 4, 3, 2, 1};
        int num3[] = {1, 1, 1, 2, 3};
        int num4[] = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int num5[] = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int num6[] = {3};
        int num7[] = {2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3};
        System.out.println(findOriginalArray(num1));
        System.out.println(findOriginalArray(num2));
        System.out.println(findOriginalArray(num3));
        System.out.println(findOriginalArray(num4));
        System.out.println(findOriginalArray(num5));
        System.out.println(findOriginalArray(num6));
        System.out.println(findOriginalArray(num7));
    }

    private static int[] findOriginalArray(int[] changed) {
        if (changed.length <= 1) {
            return changed;
        }

        Set<Integer> extra = new HashSet<>();
        Set<Integer> missing = new HashSet<>();
        for (int i = 0; i < changed.length - 1; i += 2) {
            int num1 = changed[i], num2 = changed[i + 1];
            if (num1 != num2) {
                extra.add(num1);
                missing.add(num2);
            }
        }

        if (extra.size() != missing.size()) {
            return new int[0];
        }
        int[] res = new int[changed.length / 2 + (changed.length % 2 == 0 ? 0 : 1)];
        int index = 0; 
        for (int num : changed) {
            if (extra.contains(num)) {
                extra.remove(num);
                continue;
            }
            if (missing.contains(num)) {
                res[index++] = num;
                missing.remove(num);
            }
        }
        if (!missing.isEmpty()) {
            res[index] = missing.iterator().next();
        }
        return res;
    }

    }
}
}