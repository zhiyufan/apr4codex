package com.codex;

import java.util.*;

public class Solution {
for (int j = 0; j < rectangles[0].length; j++){
    if (rectangles[i][0] < rectangles[i][1]){
        int temp = rectangles[i][0];
        rectangles[i][0] = rectangles[i][1];
        rectangles[i][1] = temp;
    }
    Double ratio = (double)rectangles[i][0] / rectangles[i][1];
    map.put(ratio, map.getOrDefault(ratio, 0L) + 1);
}
}