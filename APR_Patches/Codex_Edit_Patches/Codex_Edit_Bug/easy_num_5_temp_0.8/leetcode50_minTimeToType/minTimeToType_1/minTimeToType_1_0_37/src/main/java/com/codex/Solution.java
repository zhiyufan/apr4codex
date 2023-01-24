package com.codex;

import java.util.*;

public class Solution {
    public int[] singleNumber(int[] nums) {
        
		List<Integer> res = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i])) {
				map.remove(nums[i]);
			} else {
				map.put(nums[i], nums[i]);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			res.add(entry.getValue());
		}
        
        if(res.size() == 2) {
            return new int[]{res.get(0), res.get(1)};
        }
		return res.stream().mapToInt(i -> i).toArray();
	}

    public static int minTimeToType(String word) {
        

        int[] pos = new int[26];
        int i = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            pos[ch - 'a'] = i++;
        }

        int cur = 0, res = 0;
        for (char ch : word.toCharArray()) {
            res += Math.min(Math.abs(pos[ch - 'a'] - cur), 26 - Math.abs(pos[ch - 'a'] - cur));
            cur = pos[ch - 'a'];
        }
        return res;
    }
}