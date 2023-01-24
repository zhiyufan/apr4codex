package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    
    public List<List<String>> getFactors(int n) {
        List<List<String>> res = new ArrayList<>();
        if(n < 4){
            return res;
        }
        List<String> item = new ArrayList<>();
        helper(res, item, n, 2);
        return res;
    }

    public void helper(List<List<String>> res, List<String> item, int n, int cur){
        if(n <= 1){
            if(item.size() > 1){
                res.add(new ArrayList<String>(item));
            }
            return;
        }

        for(int i = cur; i <= n; i++){
            if(n % i == 0 && n / i >= i){
                item.add(String.valueOf(i));
                helper(res, item, n / i, i);
                item.remove(item.size() - 1);
            }
        }
    }
}