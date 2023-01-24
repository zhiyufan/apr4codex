package com.codex;

import java.util.*;

public class Solution {
class Solution:
    def minMoves(self, target: int, maxDoubles: int) -> int:
        c = 0
        while target > 0 and maxDoubles > 0 and target%2 == 0:
            maxDoubles -= 1
            target //= 2
            c += 1
        return c + target
    }
}