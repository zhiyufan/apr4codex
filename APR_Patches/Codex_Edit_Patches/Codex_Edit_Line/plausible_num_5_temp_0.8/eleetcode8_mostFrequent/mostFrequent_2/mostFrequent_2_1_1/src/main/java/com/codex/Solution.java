package com.codex;

import java.util.*;

public class Solution {
----

**git**

git init 
git status
git add .
git commit -m "test"
git log
git remote add origin https://github.com/SnowLeopard80/HackerRank.git
git push -u origin master

**some problem**

public static int mostFrequent(int[] nums, int key) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int count = 0;
        int maxCount = 0;
        int maxTarget = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (num != key) {
                count = 0;
            } else {
                count++;
            }
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + count);
            } else {
                map.put(num, count);
            }
            if (map.get(num) > maxCount) {
                maxCount = map.get(num);
                maxTarget = num;
            }
        }
        return maxTarget;

    }
**some command**

mkdir

pwd

nano


**some code**

public static int mostFrequent(int[] nums, int key) {
        int count = 0;
        int maxCount = 0;
        int maxTarget = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (num != key) {
                count = 0;
            } else {
                count++;
            }
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + count);
            } else {
                map.put(num, count);
            }
            if (map.get(num) > maxCount) {
                maxCount = map.get(num);
                maxTarget = num;
            }
        }
        return maxTarget;
    }

---

**some code**

def mostFrequent(nums, key):
    count = 0
    maxCount = 0
    maxTarget = 0
    map = {}
    for num in nums:
        if num != key:
            count = 0
        else:
            count += 1
        if num in map:
            map[num] += count
        else:
            map[num] = count
        if map[num] > maxCount:
            maxCount = map[num]
            maxTarget = num
    return maxTarget

---


**Some command**

    sudo apt-get update
    sudo apt-get install python3
    sudo apt-get install python3-pip
    sudo apt-get install idle3
    sudo apt-get install python3-tk

---

**some code**

    public static int mostFrequent(int[] nums, int key) {
        int count = 0;
        int maxCount = 0;
        int maxTarget = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (num != key) {
                count = 0;
            } else {
                count++;
            }
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + count);
            } else {
                map.put(num, count);
            }
            if (map.get(num) > maxCount) {
                maxCount = map.get(num);
                maxTarget = num;
            }
        }
        return maxTarget;
    }

---

**some problem**

def mostFrequent(nums, key):
    count = 0
    maxCount = 0
    maxTarget = 0
    map = {}
    for num in nums:
        if num != key:
            count = 0
        else:
            count += 1
        if num in map:
            map[num] += count
        else:
            map[num] = count
        if map[num] > maxCount:
            maxCount = map[num]
            maxTarget = num
    return maxTarget

    
}