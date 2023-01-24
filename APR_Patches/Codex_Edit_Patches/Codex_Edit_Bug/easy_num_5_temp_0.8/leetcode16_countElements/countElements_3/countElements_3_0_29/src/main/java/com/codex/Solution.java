package com.codex;

import java.util.*;

public class Solution {
public static int countElements(int[] nums) {
    
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] < nums[j] && nums[i] + 1 == nums[j]) {
                count++;
            }
        }
    }
    return count;
}


public static int countElements(int[] nums) {

    HashSet < Integer > set = new HashSet < > ();
    int count = 0;
    for (int num: nums) {
        set.add(num);
    }
    for (int num: nums) {
        if (set.contains(num + 1)) count++;
    }
    return count;
}

// -------------------------------------------------
    public static int findMaxLength(int[] nums) {
        
        Map < Integer, Integer > map = new HashMap < > ();
        map.put(0, -1);
        int maxlength = 0, count = 0;
        for (int i = 0; i < nums.length; i++) { 
            if (nums[i] == 0) count--; 
            else count++; 
            if (map.containsKey(count)) maxlength = Math.max(maxlength, i - map.get(count));
            else map.put(count, i); 
        } 
        return maxlength;
    }

        public static int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxlen;
    }

// -------------------------------------------------

        public static String defangIPaddr(String address) {
        
        String result = "";
        
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) != '.') {
                result = result + address.charAt(i);
            } else {
                result = result + "[.]";
                }
            }
        }
        return result;
    }


        
        public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}