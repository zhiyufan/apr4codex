package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        
        int[] letters = new int[26];
        int res = 0;
        for (char c : s.toCharArray()) {
            letters[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            letters[c - 'a']--;
        }
        for (int i : letters) {
            res += Math.abs(i);
        }
        return res / 2;
    }


```java
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        Arrays.sort(nums);
        helper(nums, new boolean[nums.length], new ArrayList<>(), res);
        return res;
    }

    private void helper(int[] nums, boolean[] visited, List<Integer> curr, List<List<Integer>> res) {
        if (curr.size() == nums.length) {
            res.add(new ArrayList<>(curr));
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) continue;
            curr.add(nums[i]);
            visited [i] = true;
            helper(nums, visited, curr, res);
            visited[i] = false;
            curr.remove(curr.size() - 1);
        }
    }
}
```
    
}