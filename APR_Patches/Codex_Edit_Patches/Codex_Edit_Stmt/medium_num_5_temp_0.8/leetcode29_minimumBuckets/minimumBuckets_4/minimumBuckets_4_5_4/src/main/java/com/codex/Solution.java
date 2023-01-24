package com.codex;

import java.util.*;

public class Solution {
        while (i + 1 < street.length() && street.charAt(i + 1) == 'H') {
            buckets++;
            if (street.charAt(i) == 'H') {
                return -1;
            }
        }
        return buckets;
    }

    
}