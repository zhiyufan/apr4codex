package com.codex;

import java.util.*;

public class Solution {
class Solution:

    def findKthLargest(self, nums, k):
        nums = sorted(nums, reverse=True)
        return nums[k-1]


test = Solution()
nums = [3,2,1,5,6,4]
print(test.findKthLargest(nums, 2))
    }
}