package com.codex;

import java.util.*;

public class Solution {
class Solution {
  public:
    int maxProfit(vector<int>& prices) {
      int n = prices.size();
      int buy = INT_MIN;
      int sell = 0;
      for (int i = 0; i < n; i++) {
        int prevSell = sell;
        if (buy + prices[i] > sell) {
          sell = buy + prices[i];
        }
        if (-prices[i] > buy) {
          buy = -prices[i];
        }
      }
      return sell;
    }

  };
}