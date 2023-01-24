package com.codex;

import java.util.*;

public class Solution {
function pivotArray(arr, pivot){
    let i = 0;
    let j = arr.length - 1;
    while (i < j) {
        if (arr[i] < pivot) {
            i++;
            continue;
        }
        if (arr[j] > pivot) {
            j--;
            continue;
        }
        [arr[i], arr[j]] = [arr[j], arr[i]];
        i++;
        j--;
    }

    return arr;
}
}