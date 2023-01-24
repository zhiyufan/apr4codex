package com.codex;

import java.util.*;

public class Solution {
object Solution {

    case class Pair(i: Int, j: Int) {
        def update(i: Int, j: Int) = Pair(i, j)
    }

    def solve(n: Int, a: Array[Long]): Array[Long] = {
        def loop(l: Int, r: Int, el: Int, er: Int, acc: Long): Array[Long] = if (l == r) Array(acc) else {
            val mid = (l + r) / 2
            val (e, t) = (el + mid - l, er + mid - l)
            loop(l, mid, el, e, acc) ++ loop(mid + 1, r, t, er, acc + math.abs(a(mid) - a(t)))
        }
        loop(0, a.size - 1, 0, a.size - 1, 0)
    }

    def main(args: Array[String]) {
        val in = io.Source.stdin.getLines()
        val n = in.next.toInt
        val a = in.next.split(" ").map(_.toLong)
        val ans = solve(n, a)
        println(ans.mkString(" "))
    }
}

    
}