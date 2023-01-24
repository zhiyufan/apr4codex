package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set2.add(nums[i]);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!set2.contains(i)) {
                ans.add(i);
            }
        }

        return ans;
    }

}
}