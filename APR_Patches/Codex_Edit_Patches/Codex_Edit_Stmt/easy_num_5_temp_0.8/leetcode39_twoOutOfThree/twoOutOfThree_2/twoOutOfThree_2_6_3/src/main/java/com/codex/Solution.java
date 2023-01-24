package com.codex;

import java.util.*;

public class Solution {

// import java.util.Arrays;

// (list1.size() <= list2.size()) ? list1 : list2

// проверяем весь массив, если количество повторений больше 2, то добавляем в список
// добавляем число в список проверяя что оно не содержится в списке

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {


        var list2 = new ArrayList<>();

        for (int n : nums1) {
            if (!list2.contains(n)) {
                list2.add(n);
            }
        }
        for (int n : nums2) {
            if (!list2.contains(n)) {
                list2.add(n);
            }
        }
        for (int n : nums3) {
            if (!list2.contains(n)) {
                list2.add(n);
            }
        }

        var i = 0;
        for (int j = 0; j < list2.size(); j++) {
            for (var k = 0; k < nums1.length; k++) {
                if (nums1[k] == list2.get(j)) {
                    i++;
                    break;
                }
            }
            for (var k = 0; k < nums2.length; k++) {
                if (nums2[k] == list2.get(j)) {
                    i++;
                    break;
                }
            }
            for (var k = 0; k < nums3.length; k++) {
                if (nums3[k] == list2.get(j)) {
                    i++;
                    break;
                }
            }
            if (i > 1) {
                list.add(list2.get(j));
            }
            i = 0;
        }
        return list;
    }


    public static List<Integer> twoOutOfThree2(int[] nums1, int[] nums2, int[] nums3) {

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        // List<Integer> list3 = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums1) {

            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
        }
        for (int n : map.keySet()) {
            if (map.get(n) > 1) {
                list.add(n);
            }
        }
        return list;
    }

    
}