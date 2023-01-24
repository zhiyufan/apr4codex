package com.codex;

import java.util.*;

public class Solution {
void foo(int n) {
	if (n > 0) {
		printf("%d ", n);
		foo(n - 1);
		foo(n - 2);
	}
	return;
}
// foo(5) 출력 결과
// 5 3 1 2 1
}