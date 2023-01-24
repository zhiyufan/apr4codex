package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i] + 1)) {
                count += 1;
            }
        }
        return count;
    }

        public static int stringToInteger(String num) {
        return Integer.parseInt(num);
    }

    public static double stringToDouble(String num) {
        return Double.parseDouble(num);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String[] s = line.split(", ");
            int[] nums = new int[s.length];
            for (int i = 0; i < s.length; i++) {
                nums[i] = stringToInteger(s[i]);
            }
            
            int ret = countElements(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }

    
}