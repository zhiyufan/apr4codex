package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> maxScoreIndices(int[] nums) {
        
        int n = nums.length;
        if (n == 0) return new ArrayList<>();
        int[] leftCount = new int[n];
        int[] rightCount = new int[n];
        int cur = 0;
        for (int i = 0; i < n; i++) {
            cur += nums[i];
            leftCount[i] = cur;
        }
        cur = 0;
        for (int i = n - 1; i >= 0; i--) {
            cur += nums[i] ^ 1;
            rightCount[i] = cur;
        }
        int max = 0;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int left = i == 0 ? 0 : leftCount[i - 1];
            int right = i == n - 1 ? 0 : rightCount[i + 1];
            int sum = left + right;
            if (sum > max) {
                max = sum;
                res = new ArrayList<>();
                res.add(i);
            } else if (sum == max) {
                res.add(i);
            }
        }
        return res;
    }






import java.util.*;
//TLE
class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, List<String>> email2Account = new HashMap<>();
        int total = 0;
        for (List<String> account : accounts) {
            List<String> accountUpdate = new ArrayList<>();
            accountUpdate.add(account.get(0));
            for (int i = 1; i < account.size(); i++) {
                String email = account.get(i);
                if (email2Account.containsKey(email)) {
                    List<String> account2 = email2Account.get(email);
                    if (accountUpdate.get(0).equals(account2.get(0))) {
                        accountUpdate.addAll(account2.subList(1, account2.size()));
                        total -= account2.size() - 1;
                    } else {
                        for (int j = 1; j < account2.size(); j++) {
                            email2Account.put(account2.get(j), accountUpdate);
                        }
                        accountUpdate.addAll(account2.subList(1, account2.size()));
                        total -= account2.size();
                    }
                } else {
                    email2Account.put(email, accountUpdate);
                }
            }
            total += accountUpdate.size();
        }
        List<List<String>> res = new ArrayList<>();
        for (List<String> account : email2Account.values()) {
            List<String> uniq = new ArrayList<>();
            for (String email : account.subList(1, account.size())) {
                if (!uniq.contains(email)) {
                    uniq.add(email);
                }
            }
            Collections.sort(uniq);
            uniq.add(0, account.get(0));
            res.add(uniq);
        }
        return res;
    }
}

//Time: O(AlogA) A is the total number of accounts.
//Space: O(AlogA)
class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        DSU dsu = new DSU();
        for (List<String> account : accounts) {
            String person = account.get(0);
            for (int i = 1; i < account.size(); i++) {
                dsu.union(account.get(i), person);
            }
        }
        Map<String, List<String>> email2Account = new HashMap<>();
        for (List<String> account : accounts) {
            for (int i = 1; i < account.size(); i++) {
                String parent = dsu.find(account.get(i));
                if (!email2Account.containsKey(parent)) {
                    email2Account.put(parent, new ArrayList<>());
                }
                email2Account.get(parent).add(account.get(i));
            }
        }
        List<List<String>> res = new ArrayList<>();
        for (List<String> list : email2Account.values()) {
            Collections.sort(list);
            list.add(0, dsu.find(list.get(0)));
            res.add(list);
        }
        return res;
    }
}

class DSU {
    private Map<String, String> parents;
    
    public DSU() {
        parents = new HashMap<>();
    }
    
    public void union(String email, String person) {
        parents.put(find(email), person);
    }
    
    public String find(String email) {
        if (!parents.containsKey(email)) return email;
        while (!email.equals(parents.get(email))) {
            email = parents.get(email);
        }
        return email;
    }
}







    
}