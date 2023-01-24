package com.codex;

import java.util.*;

public class Solution {
    public static int[] sortJumbled(int[] mapping, int[] nums) {
        
        ArrayList<Integer> buf = new ArrayList<Integer>();
        
        int[] res = new int[nums.length];

        	buf.add(nums[i]);
        }
        
        Collections.sort(buf);
        res = new int[buf.size()];
        
        for (int i = 0; i < buf.size(); i++) {
        	res[i] = buf.get(i);
        }
        
        for (int i = 0; i < res.length; i++) {
        	int val = res[i];
        	int repVal = mapping[val];
        	buf.add(repVal);
        }
        
        Collections.sort(buf);
        
        for (int i = 0; i < buf.size(); i++) {
        	res[i] = buf.get(i);
        }

        /*int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
        }
        Arrays.sort(res);

        int[] map = new int[10];
        for (int i = 0; i < 10; i++) {
            map[mapping[i]] = i;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = map[nums[i]];
        }

        Arrays.sort(nums);
        return nums;
    }

    
}