package com.codex;

import java.util.*;

public class Solution {
function humanReadable(seconds) {
    var pad = function(x) { return (x < 10) ? "0"+x : x; }
    return pad(parseInt(seconds / (60*60))) + ":" +
           pad(parseInt(seconds / 60 % 60)) + ":" + 
           pad(seconds % 60)
}

console.log(humanReadable(0));
console.log(humanReadable(5));
console.log(humanReadable(60));
console.log(humanReadable(86399));
console.log(humanReadable(359999));


/**
 * @param {number[]} nums
 * @return {number}
 */
var firstMissingPositive = function(nums) {
    nums.push(0);
    let n = nums.length;
    for(let i=0;i<n;i++){
       if(nums[i]<0 || nums[i]>=n){
           nums[i]=0;
       }
    }
    for(let i=0;i<n;i++){
        nums[nums[i] %n] +=n;
    }
    for(let i=1;i<n;i++){
        if(nums[i]/n===0){
            return i;
        }
    }
    
    return n;
};


var firstMissingPositive = function(nums) {
    let n = nums.length;
    let hasOne = false;
    for(let i=0;i<n;i++){
        if(nums[i]===1){
            hasOne = true;
            break;
        }
    }
    if(!hasOne){
        return 1;
    }
    if(n===1){
        return 2;
    }
    for(let i=0;i<n;i++){
        if(nums[i]<=0 || nums[i]>n){
            nums[i]=1;
        }
    }
    for(let i=0;i<n;i++){
        let index = Math.abs(nums[i]);
        if(index===n){
            nums[0] = -Math.abs(nums[0]);
        }else{
            nums[index] = -Math.abs(nums[index]);
            }
        }
    for(let i=1;i<n;i++){
        if(nums[i]>0){
            return i;
        }
        
    }
    if(nums[0]>0){
        return n;
    }
    return n+1;
    }


}