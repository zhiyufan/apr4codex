package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=-1;
         for(i=0;i<nums.length;i++){
             if(nums[i]!=0){
                 if(j>=0)
                 {
                 swap(nums,i,++j);
                 }
                 else{
                     j=i;
                 }
             }
             
        }
    }
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    } 
}
}