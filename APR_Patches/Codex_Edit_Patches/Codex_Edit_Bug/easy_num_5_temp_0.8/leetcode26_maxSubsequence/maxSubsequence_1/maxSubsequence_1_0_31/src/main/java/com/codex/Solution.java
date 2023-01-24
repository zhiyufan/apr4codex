package com.codex;

import java.util.*;

public class Solution {
#include <iostream>
#include <vector>
#include <string>
#include <stack>
#include <queue>
#include <math.h>
#include <stack>
#include <queue>
#include <utility>
#include <map>

using namespace std;

class Solution 
{
public:
    int trapRainWater(vector<vector<int>>& heightMap) 
    {
        if( heightMap.size() < 3 || heightMap[0].size() < 3 )
            return 0;
        
        int width = heightMap[0].size();
        int height = heightMap.size();
        vector<int> arr( width, 0 );
        
        for( int i = 1; i < height - 1; i++ )
        {
            vector<int> temp(arr);
            for( int j = 1; j < width - 1; j++ )
            {
                int minSide = min( heightMap[i - 1][j], heightMap[i + 1][j] );
                int minOneSide = min( heightMap[i][j - 1], heightMap[i][j + 1] );
                int minValue = min( minOneSide, minSide );
                temp[j] = minValue < heightMap[i][j] ? minValue - heightMap[i][j] : 0;
            }
            arr = temp;
        }
        
        int total = 0;
        for( auto item : arr )
            total += item;
        
        return total;
    }

};


int main()
{
    vector<int> v1{1,4,3,1,3,2};
    vector<int> v2{3,2,1,3,2,4};
    vector<int> v3{2,3,3,2,3,1};

    vector<vector<int>> input;
    input.push_back( v1 );
    input.push_back( v2 );
    input.push_back( v3 );

    Solution s;
    cout << s.trapRainWater( input ) << endl;

    return 0;
}
}