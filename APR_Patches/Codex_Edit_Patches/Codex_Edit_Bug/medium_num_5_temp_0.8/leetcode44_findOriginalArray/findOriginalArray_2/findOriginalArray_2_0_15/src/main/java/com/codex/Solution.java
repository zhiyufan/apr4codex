package com.codex;

import java.util.*;

public class Solution {
    import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        int size = A.size();
        int[] arr = new int[size];
        int maxNum = -1, minNum = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            int num = A.get(i);
            arr[num-1]++;
            if (num < minNum) {
                minNum = num;
            }
            if (num > maxNum) {
                maxNum = num;
            }
        }
        int dupNum = -1, missingNum = -1;
        for (int i = 0; i < size; i++) {
            int num = A.get(i);
            if (arr[num-1] == 2) {
                dupNum = num;
            }
            if (arr[num-1] == 0) {
                missingNum = num;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(dupNum);
        result.add(missingNum);
        return result;
    }
}

/*    public static int[] findOriginalArray(int[] changed) {
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < changed.length; i++) {
            map.put(changed[i], map.getOrDefault(changed[i], 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            if (count != 2) {
                return new int[0];
            }
            list.add(num);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

*/     
}