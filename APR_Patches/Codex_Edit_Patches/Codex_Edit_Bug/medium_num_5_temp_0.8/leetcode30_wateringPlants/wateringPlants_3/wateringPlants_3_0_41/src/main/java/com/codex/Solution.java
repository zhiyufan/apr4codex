package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Solution {
    /**
     * 
     * @param strs string字符串一维数组 the rows of matrix
     * @return int整型一维数组
     */
    public int[] findDiagonalOrder (String[] strs) {
        // write code here
        List<List<Integer>> matrix = new ArrayList<>();
        for (String str : strs) {
            for(int i = str.length() - 1; i >= 0; i--) {
                char c = str.charAt(i);
                List<Integer> list = new ArrayList<>();
                list.add(c);
                matrix.add(list);
            }
        }
        Collections.sort(matrix, new Comparator<List<Integer>>() {
            public int compare(List<Integer> x, List<Integer> y) {
                if (x.size() == y.size()) 
                    return x.get(0) - y.get(0);
                return x.size() - y.size();
            }
        });
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < matrix.size(); i++) {
            result.addAll(matrix.get(i));
        }
        int[] array = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            array[i] = result.get(i);
        }
        return array;
    }
}

    
}