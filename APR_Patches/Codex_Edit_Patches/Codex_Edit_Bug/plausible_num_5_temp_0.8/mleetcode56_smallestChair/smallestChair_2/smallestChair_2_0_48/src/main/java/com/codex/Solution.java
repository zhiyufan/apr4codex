package com.codex;

import java.util.*;

public class Solution {
package coderust

type Node struct {
	data int
	next *Node
}

func getNthNodeFromEnd(head *Node, n int) int {
	slow := head
	fast := head
	for i := 0; i < n; i++ {
		fast = fast.next
	}
	for fast != nil {
		slow = slow.next
		fast = fast.next
	}
	return slow.data
}
}