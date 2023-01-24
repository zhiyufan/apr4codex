package com.codex;

import java.util.*;

public class Solution {
/**
 * Algorithm:
 * 
 * 1) Find the middle of the linked list.
 * 2) Reverse the second half of the linked list.
 * 3) Check if the first half and second half are identical.
 * 4) Construct the original linked list by reversing the second half again and attaching it back to the first half
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
 * @author Polina Koleva
 *
 */
public class PalindromeLinkedList {

	public boolean isPalindrome(ListNode head) {

        while (high < num) {
            if (sum < num) {
                high++;
                sum += high;
            } else if (sum > num) {
                sum -= low;
                low++;
            } else {
                for (long i = low; i <= high; i++) {
                    result.add(i);
                }
                break;
            }
        }

        return result.stream().mapToLong(i -> i).toArray();
    }

    
}