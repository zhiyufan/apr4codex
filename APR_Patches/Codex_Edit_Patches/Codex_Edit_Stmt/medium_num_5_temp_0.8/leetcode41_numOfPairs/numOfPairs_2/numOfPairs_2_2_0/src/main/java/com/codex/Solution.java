package com.codex;

import java.util.*;

public class Solution {
        int count = 0;
        for (int i = 0; i < nums.length; i++)
            for (int j = 0; j < nums.length; j++)
                if (j != i)
                    if ((nums[i] + nums[j]).equals(target)) {
                        count += 2;
                        nums[i] = "";
                        nums[j] = "";
                    }    
        return count;
    
}