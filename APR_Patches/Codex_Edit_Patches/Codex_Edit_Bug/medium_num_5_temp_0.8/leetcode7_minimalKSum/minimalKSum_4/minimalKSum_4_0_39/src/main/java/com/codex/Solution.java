package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);
        int curr = 1;
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > curr) {
                k--;
                sum+=curr;
                curr++;
            } else if (nums[i] == curr) curr++;
        }
        while (k > 0) {
            sum+=curr;
            curr++;
            k--;
        }
        return sum;
    }



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine().trim());
        String[] arr_arr = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i_arr = 0; i_arr < arr_arr.length; i_arr++) {
            arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
        }

        int out_ = minimalKSum(arr);
        System.out.println(out_);

        wr.close();
        br.close();
    }
}
    
}