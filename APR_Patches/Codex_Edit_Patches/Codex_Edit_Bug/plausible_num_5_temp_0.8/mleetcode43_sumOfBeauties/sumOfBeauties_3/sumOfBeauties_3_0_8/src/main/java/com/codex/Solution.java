package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int solution(int n) {
        int answer = 0;
        int m = n;
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = m % 10;
            m /= 10;
        }
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                    answer++;
                }
            }
        }
        return answer;
    }
}


public class Solution {
    public String solution(int n) {
        String answer = "";
        int m = n;
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = m % 10;
            m /= 10;
        }
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for(int i = 0; i < n; i++) {
            answer += a[i];
        }
        return answer;
    }
}



def solution(n):
    answer = ''
    a = [i for i in str(n)]
    a.sort()
    for i in a:
        answer += i
    return answer




  public static int sumOfBeauties(int[] nums) {
        if(nums.length == 1) return 1;
        int sum = 0;
        if(nums.length == 2 && nums[0] != nums[1]) {
            sum += 2;
            return sum;
        }
        for(int i = 0; i < nums.length; i++) {
            if(i == 0) {
                if(nums[0] < nums[1]) {
                    sum += 1;
                } else {
                    int k = 1;
                    while(k < nums.length) {
                        if(nums[i] > nums[k]) {
                            break;
                        }
                        k++;
                    }
                    if(k >= nums.length) {
                        sum += 2;
                    }
                }
            } else if(i == nums.length - 1) {
                if(nums[i] > nums[i - 1]) {
                    sum += 1;
                } else {
                    int j = i - 1;
                    while(j >= 0) {
                        if(nums[i] > nums[j]) {
                            break;
                        }
                        j--;
                    }
                    if(j < 0) {
                        sum += 2;
                    }
                }
            } else {
                if(nums[i - 1] < nums[i] && nums[i] < nums[i + 1]) {
                    sum += 1;
                } else {
                    int j = i - 1;
                    int k = i + 1;
                    while(j >= 0) {
                        if(nums[i] > nums[j]) {
                            break;
                        }
                        j--;
                    }
                    while(k < nums.length) {
                        if(nums[i] > nums[k]) {
                            break;
                        }
                        k++;
                    }
                    if(j < 0 && k >= nums.length) {
                        sum += 2;
                    }
                }
            }
        }
        return sum;
    }

    
}