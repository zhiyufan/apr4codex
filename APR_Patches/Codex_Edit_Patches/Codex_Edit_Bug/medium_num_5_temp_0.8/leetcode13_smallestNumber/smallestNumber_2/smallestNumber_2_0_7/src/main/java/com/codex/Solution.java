package com.codex;

import java.util.*;

public class Solution {
public static long smallestNumber(long num) {
    
    long n = num;
    ArrayList<Integer> nums = new ArrayList<>();
    while (n > 0) {
        nums.add((int)(n % 10));
        n = n / 10;
    }
    Collections.sort(nums);
    if (nums.get(0) == 0) {
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) != 0) {
                int temp = nums.get(0);
                nums.set(0, nums.get(i));
                nums.set(i, temp);
                break;
            }
        }
    }
    n = 0;
    for (int i = 0; i < nums.size(); i++) {
        n = 10 * n + nums.get(i);
    }
    return n;
}

public static long largestNumber(long num) {
        
        ArrayList<Integer> nums1 = new ArrayList<>();
        while (num > 0) {
            nums1.add((int)(num % 10));
            num = num / 10;
        }
        
        ArrayList<Integer> nums2 = new ArrayList<>(nums1);
        Collections.sort(nums2, Collections.reverseOrder());
        if (nums1.equals(nums2)) return -1;
        
        for (int i = 0; i < nums1.size() - 1; i++) {
            for (int j = i + 1; j < nums1.size(); j++) {
                if (nums1.get(j) > nums1.get(i)) {
                    int temp = nums1.get(i);
                    nums1.set(i, nums1.get(j));
                    nums.set(i, temp);
                    long n = 0;
                    for (int k = 0; k < nums1.size(); k++) {
                        n = 10 * n + nums1.get(k);
                    }
                    return n;
                }
            }
        }
        return -1;
    }

    public static int[] nextPermutation(int[] numbers) {
        
        //nums[i] < nums[j]
        int i = 0;
        while (i < numbers.length - 1 && numbers[i] >= numbers[i + 1]) i++;
        if (i == numbers.length - 1) {
            return numbers;
        }
        
        //nums[j] > nums[i]
        int j = numbers.length - 1;
        while (j >= 0 && numbers[j] <= numbers[i]) j--;

        //swap
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
        i++;
        j = numbers.length - 1;
        while (i < j) {
            temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
            i++;
            j--;
        }
        return numbers;
    }

    public static int[] previousPermutation(int[] numbers) {
        
        //nums[i] < nums[j]
        int i = 0;
        while (i < numbers.length - 1 && numbers[i] <= numbers[i + 1]) i++;
        if (i == numbers.length - 1) {
            return numbers;
        }
        
        //nums[j] > nums[i]
        int j = numbers.length - 1;
        while (j >= 0 && numbers[j] >= numbers[i]) j--;

        //swap
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
        i++;
        j = numbers.length - 1;
        while (i < j) {
            temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
            i++;
            j--;
        }
        return numbers;
    }

    public static String[] findMissing(int[] numbers) {
        
        String[] missingNumbers = new String[2];
        
        int n = numbers.length;
        if (n == 0) {
            missingNumbers[0] = "empty";
            missingNumbers[1] = "empty";
            return missingNumbers;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] < 0) return missingNumbers;
            sum += numbers[i];
        }
        
        int correctSum = n * (n + 1) / 2;
        if (correctSum - sum == 0) {
            missingNumbers[0] = "";
            missingNumbers[1] = "";
            return missingNumbers;
        }
        if (correctSum - sum == 1) {
            for (int i = 0; i < n; i++) {
                if (numbers[i] != i + 1) {
                    missingNumbers[0] = "";
                    missingNumbers[1] = Integer.toString(i + 1);
                    return missingNumbers;
                }
            }
        }
        
        int a = correctSum - sum;
        int x = (int)Math.sqrt(2 * a);
        int b = x * (x + 1) / 2;
        if (a == b) {
            missingNumbers[0] = missingNumbers[1] = Integer.toString(x);
        } else {
            for (int i = 0; i < n - 1; i++) {
                if (numbers[i + 1] - numbers[i] != 1) {
                    int c = i + 1;
                    int d = c + numbers[i];
                    missingNumbers[0] = Integer.toString(c);
                    missingNumbers[1] = Integer.toString(d);
                    break;
                }
            }
        }
        return missingNumbers;
    }
}