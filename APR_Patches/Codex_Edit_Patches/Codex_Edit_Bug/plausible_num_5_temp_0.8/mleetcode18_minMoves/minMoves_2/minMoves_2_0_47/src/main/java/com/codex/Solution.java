package com.codex;

import java.util.*;

public class Solution {
def rearrange_digits(input_list):
    if not input_list:
        return [0, 0]
    res = []
    if len(input_list) == 1:
        for i in input_list:
            res.append(i)
            res.append(0)
        return res
    for i in range(len(input_list)-1):
        max_item_index = i
        for j in range(i+1, len(input_list)):
            if input_list[max_item_index] < input_list[j]:
                max_item_index = j
        input_list[i], input_list[max_item_index] = input_list[max_item_index], input_list[i]
    first = ""
    second = ""
    for j in range(len(input_list)):
        if j % 2 == 0:
            first += str(input_list[j])
        else:
            second += str(input_list[j])
    res.append(int(first))
    res.append(int(second))
    return res
}