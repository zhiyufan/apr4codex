package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        Integer[] arr = new Integer[arr1.length];
        int index = 0;
        for (int i : arr1) {
            arr[index] = i;
            index++;
        }
        List<Integer> al = Arrays.asList(arr);
        List<Integer> ans = new ArrayList<>(al);
        List<Integer> ans2 = new ArrayList<>();

        Collections.sort(ans, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int index1 = Arrays.binarySearch(arr2, o1);
                int index2 = Arrays.binarySearch(arr2, o2);
                if (index1 >= 0 && index2 >= 0)
                    return index1 - index2;
                if (index1 < 0 && index2 < 0)
                    return o1 - o2;
                if (index1 >= 0 && index2 < 0)
                    return -1;
                if (index1 < 0 && index2 >= 0)
                    return 1;
                return 0;
            }
        });
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < al.size(); j++) {
                if (arr[j] == arr2[i]) {
                    ans2.add(arr2[i]);
                    arr[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
        int k = ans2.size();
        for (int i : ans) {
            if (i != Integer.MIN_VALUE)
                ans2.add(k, i);
        }
        int[] ans1 = new int[ans2.size()];
        index = 0;
        for (int i : ans2) {
            ans1[index] = i;
            index++;
        }
        return ans1;
    }
}

    



    /*public static List<List<Integer>> findWinners(int[][] matches) {
        
        List<Integer> ans0 = new ArrayList<>();
        List<Integer> ans1 = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] match : matches) {
            if (map.containsKey(match[1]))
                map.put(match[1], map.get(match[1]) + 1);
            else
                map.put(match[1], 1);
            set.add(match[0]);
        }
        for (int i : map.keySet()) {
            if (map.get(i) == 1) {
                ans1.add(i);
                set.remove(i);
            }
        }
        for (int i : set) {
            ans0.add(i);
        }
        Collections.sort(ans0);
        Collections.sort(ans1);
        return Arrays.asList(ans0, ans1);
    }

    */
}