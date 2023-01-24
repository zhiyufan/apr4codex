package com.codex;

import java.util.*;

public class Solution {
if (nums[i] == key && nums[i + 1] != key) {
        int count = map.getOrDefault(nums[i + 1], 0);
        map.put(nums[i + 1], count + 1);
        if (count + 1 > maxCount) {
            maxCount = count + 1;
            maxNum = nums[i + 1];
        }
}
                }
            }
        }

        return maxNum;
    }

    
}