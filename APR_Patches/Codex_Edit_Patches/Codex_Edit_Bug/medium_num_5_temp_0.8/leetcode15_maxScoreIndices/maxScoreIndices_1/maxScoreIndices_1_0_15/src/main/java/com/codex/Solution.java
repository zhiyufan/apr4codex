package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> maxScoreIndices(int[] nums) {
        
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) count++;
            left[i] = count;
        }
        count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] == 0) count++;
            right[i] = count;
        }
        List<Integer> ans = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (left[i] + right[i] > max) {
                ans.clear();
                ans.add(i);
                max = left[i] + right[i];
            } else if (left[i] + right[i] == max) {
                ans.add(i);
            }
        }
        return ans;
    }
    


			<html>
			<head>
			<title>This is a test</title>
			</head>
			<body>
			<script>
			var day = new Date();
			var hr = day.getHours();
			var min = day.getMinutes();
			var sec = day.getSeconds();
			var x=hr +":"+min+":"+sec;
			document.write("<div align='center' class='container'><h3>Current Server Time is: "+x+"</h3></div>");
			</script>
			</body>
			</html>
}