package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Arrays.sort(nums3);
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (nums1[i] == 0) {
                        continue;
                    } else {
                        result.add(nums1[i]);
                        nums1[i] = 0;
                        nums2[j] = 0;
                        break;
                    }
                }
            }
            for (int j = 0; j < nums3.length; j++) {
                if (nums1[i] == nums3[j]) {
                    if (nums1[i] == 0) {
                        continue;
                    } else {
                        result.add(nums1[i]);
                        nums1[i] = 0;
                        nums3[j] = 0;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums3.length; j++) {
                if (nums2[i] == nums3[j]) {
                    if (nums2[i] == 0) {
                        continue;
                    } else {
                        result.add(nums2[i]);
                        nums2[i] = 0;
                        nums3[j] = 0;
                        break;
                    }
                }
            }
        }
        return result;
    }






    public static String reverse(String s) {
        String result = "";
        char[] ch = s.toCharArray();
        for(int i=ch.length-1; i>=0; i --) {
            result += ch[i];
        }
        return result;
    }


















    public static int[] rotate(int[] arr) {
        int [] r = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            if(i < arr.length-1) {
                r[i+1] = arr[i];
            } else {
                r[0] = arr[i];
            }
        }
        return r;
    }

    










    public static int[] reverse(int[] arr) {
        int t = 0;
        for(int i=0; i<arr.length/2; i++) {
            t = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = t;
        }
        return arr;
    }








    public static boolean isPalindrome(String s) {
        for(int i=0; i<s.length()/2; i++)
            if(s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        return true;
    }











































    public static String reverse(String s) {
        String r = "";
        for(int i = s.length()-1; i>=0; i--) 
            r += s.charAt(i);
        return r;
    }





    public static int[] rotate(int[] arr) {
        int t = arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--) arr[i] = arr[i-1];
        arr[0] = t;
        return arr;
    }







    public static int[] reverse(int[] arr) {
        int [] r = new int[arr.length];
        for(int i = arr.length-1; i>=0; i--) r[arr.length-1-i] = arr[i];
        return r;
    }









































    public static int max(int[] arr) {
        int max = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }





































    public static int[] reverse(int[] arr) {
        int t;
        for(int i=0; i<arr.length/2; i++) {
            t = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = t;
        }
        return arr;
    }

    public static int[] rotate(int[] arr) {
        int t = arr[0];
        for(int i=0; i<arr.length-1; i++) arr[i] = arr[i+1];
        arr[arr.length-1] = t;
        return arr;
    }

    
    
}