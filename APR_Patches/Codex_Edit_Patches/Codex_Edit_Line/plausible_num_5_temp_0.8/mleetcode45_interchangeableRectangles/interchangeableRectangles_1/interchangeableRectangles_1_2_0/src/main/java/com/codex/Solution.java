package com.codex;

import java.util.*;

public class Solution {
// Example solution for Interchangeable Rectangles problem
#include <iostream>
#include <vector>
#include <algorithm>
#include <unordered_map>

using namespace std;

//< count interchangeable rectangles by ratio
    public static long interchangeableRectangles(int[][] rectangles) {
        
        unordered_map<double, long> map;
        for (int i = 0; i < rectangles.length; i++){
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
        long res = 0;
        for (long l : map.values()){
            res += l * (l - 1) / 2;
        }
        return res;
    }

int main()
{
    int arr[4][2] = {{1,1},{2,2},{2,2},{1,1}};
    int res = interchangeableRectangles(arr);
    cout << "Number of interchangeable rectangles: " << res << endl;
    return res;
}
}