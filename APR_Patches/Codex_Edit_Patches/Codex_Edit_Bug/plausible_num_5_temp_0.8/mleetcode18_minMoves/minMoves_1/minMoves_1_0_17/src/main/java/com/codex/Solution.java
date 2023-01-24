package com.codex;

import java.util.*;

public class Solution {
class Solution {
public:
    int minMoves(vector<int>& nums) {
        // sort(nums.begin(), nums.end());
        // int moves = 0;
        // for(int i = 1; i < nums.size(); i++) {
        //     moves += nums[i] - nums[0];
        // }
        // return moves;
        int sum = 0;
        int min = *min_element(nums.begin(), nums.end());
        for(int &num : nums) {
            sum += num;
        }
        return sum - min * nums.size();
    }

};
}