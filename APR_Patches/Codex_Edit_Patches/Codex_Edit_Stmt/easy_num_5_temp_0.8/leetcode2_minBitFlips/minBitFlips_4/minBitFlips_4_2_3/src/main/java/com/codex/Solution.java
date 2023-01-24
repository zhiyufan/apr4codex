package com.codex;

import java.util.*;

public class Solution {
public static int minBitFlips(int start, int goal) {
    
    int n = start;
    int m = goal;
    int ans = 0;
    int count = 0;
    while (n > 0 || m > 0) {
        int b1 = n % 2;
        int b2 = m % 2;
        if (b1 != b2) {
            count++;
        } else {
            ans += count / 2;
            count = 0;
        }
        if (!(m == 0 && count % 2 == 1)) {
            n /= 2;
            m /= 2;
        }
    }
    if (count % 2 != 0)
        return -1;
    return ans + count / 2;
}




public static List<Integer> rearrangeList(List<Integer> list) {
    
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < list.size(); i++) {
        map.put(i, list.get(i));
    }
    List<Integer> newList = new ArrayList<Integer>();
    int i;
    for (i = 0; i < list.size(); i++) {
        if (i >= map.get(i))
            break;
    }
    i--;
    while (i >= 0) {
        newList.add(map.get(i));
        i--;
    }
    i = list.size() - 1;
    while (i >= 0) {
        if (map.get(i) >= i)
            i--;
        else
            break;
    }
    while (i >= 0) {
        newList.add(map.get(i));
        i--;
    }
    return newList;
}



public static int digitSum(String s) {
    
    int sum = 0;
    for (int i = 0; i < s.length(); i++) {
        int num = s.charAt(i) - '0';
        if (num % 2 == 0)
            sum += num;
    }
    return sum;
}



public static int digitSum2(String s) {
    
    int sum = 0;
    for (int i = 0; i < s.length(); i++) {
        int num = s.charAt(i) - '0';
        if (num % 2 == 1)
            sum += num;
    }
    return sum;
}



public static int digitSum3(String s) {
    
    int sum = 0;
    for (int i = 0; i < s.length(); i++) {
        int num = s.charAt(i) - '0';
        if (num % 2 == 0)
            sum += num;
    }
    return sum;
}




class Trie {
    
    TrieNode root;
    
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0;i < word.length(); i++) {
            char c = word.charAt(i);
            if (node.arr[c - 'a'] == null) {
                node.arr[c - 'a'] = new TrieNode();
            }
            node = node.arr[c - 'a'];
        }
        node.isEnd = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (node.arr[c - 'a'] == null)
                return false;
            node = node.arr[c - 'a'];
        }
        return node.isEnd;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if (node.arr[c - 'a'] == null)
                return false;
            node = node.arr[c - 'a'];
        }
        return true;
    }

}



public int search(int[] nums, int target) {
    
    if (nums == null || nums.length == 0)
        return -1;
    int i = 0;
    int j = nums.length - 1;
    while (i <= j) {
        int mid = (i + j) / 2;
        if (nums[mid] == target)
            return mid;
        if (nums[i] <= nums[mid]) {
            if (nums[i] <= target && target < nums[mid]) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        } else {
            if (nums[mid] < target && target <= nums[j]) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
    }
    return -1;
}



public class Solution {
    
    public int search(int[] nums, int target) {
        
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target) {
                return mid;
            } 
            if (nums[i] <= nums[mid]) {
                if (nums[i] <= target && target < nums[mid]) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            } else {
                if (nums[j] >= target && target > nums[mid]) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }
            }
        }
        return -1;
    }
}
}