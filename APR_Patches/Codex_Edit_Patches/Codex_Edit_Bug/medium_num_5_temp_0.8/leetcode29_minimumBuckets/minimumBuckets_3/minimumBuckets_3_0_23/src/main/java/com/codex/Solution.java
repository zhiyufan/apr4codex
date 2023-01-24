package com.codex;

import java.util.*;

public class Solution {

import java.util.ArrayList;
import java.util.HashSet;

    public static int minimumBuckets(String street) {
        int count = minimumBucketsHelper(street);
        HashSet<Integer> alreadyTaken = new HashSet<>();
        int temp = 0;
        while (temp < count) {
            if (alreadyTaken.contains(temp)) {
                continue;
            }
            boolean noChange = false;
            alreadyTaken.add(temp);
            ArrayList<Integer> indexesToChange = new ArrayList<>();
            for (int i = 0; i < street.length(); i++) {
                if (street.charAt(i) == 'H') {
                    if (i - 1 >= 0) {
                        if (street.charAt(i - 1) == '.') {
                            // streetCharArr[i - 1] = 'B'
                            indexesToChange.add(i - 1);
                            // count++;
                            noChange = true;
                        }
                    }
                    if (i + 1 < street.length()) {
                        if (street.charAt(i + 1) == '.') {
                            // streetCharArr[i + 1] = 'B';
                            indexesToChange.add(i + 1);
                            // count++;
                            noChange = true;
                        }
                    }
                }
            }
            for (int j = 0; j < indexesToChange.size(); j++) {
                int ind = indexesToChange.get(j);
                street = street.substring(0, ind) + "B" + street.substring(ind + 1);
            }

            temp = minimumBucketsHelper(street);
            if (!noChange) {
                break;
            }
        }
        return count;
    }

    public static int minimumBucketsHelper(String street) {

        char[] streetCharArr = street.toCharArray();
        int count = 0;
        for (int i = 0; i < streetCharArr.length; i++) {
            if (streetCharArr[i] == 'H') {
                if (i - 1 >= 0) {
                    if (streetCharArr[i - 1] == '.') {
                        streetCharArr[i - 1] = 'B';
                        count++;
                    }
                }
                if (i + 1 < streetCharArr.length) {
                    if (streetCharArr[i + 1] == '.') {
                        streetCharArr[i + 1] = 'B';
                        count++;
                    }
                }
            }
        }
        return count;
    }
}