package com.codex;

import java.util.*;

public class Solution {
def addRungs(rungs, dist)
  count = 0
  for i in 1..rungs.size-1
    diff = rungs[i] - rungs[i-1]
    count += diff/dist
    count += 1 if diff % dist > 0 
  end
  count
    }

    
}