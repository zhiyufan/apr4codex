package com.codex;

import java.util.*;

public class Solution {
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		int t = sc.nextInt();
		while(--t != -1) {
			String str = sc.next();
			HashSet<Character> set = new HashSet<>();
			set.add('a');
			set.add('e');
			set.add('i');
			set.add('o');
			set.add('u');
			int count = 0;
			for(int i = 0; i < str.length(); i++) {
				if(set.contains(str.charAt(i))) {
					count++;
					set.clear();
				}
				else {
					count = 0;
					set.clear();
				}
				if(count == 3)
					break;
			}
			if(count == 3)
				builder.append("OK\n");
			else
				builder.append("not OK\n");
			
		}
		System.out.print(builder);
	}

	static class Scanner {

		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public boolean ready() throws IOException {
			return br.ready();
		}
	}
}
}