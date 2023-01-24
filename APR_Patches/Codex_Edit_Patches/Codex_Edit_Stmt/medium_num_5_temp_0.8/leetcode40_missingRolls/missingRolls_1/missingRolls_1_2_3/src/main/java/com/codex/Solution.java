package com.codex;

import java.util.*;

public class Solution {
    {
        f.put("isEmpty", new Callable(new Object[] {}) {
            @Override
            public Object call(Interpreter interpreter) {
                return Deque.this.list.isEmpty();
            }
        });
        f.put("peekFirst", new Callable(new Object[] {}) {
            @Override
            public Object call(Interpreter interpreter) {
                if (Deque.this.list.isEmpty()) {
                    throw new RuntimeException("Empty deque: peekFirst");
                }
                return Deque.this.list.get(0);
            }
        });
        f.put("peekLast", new Callable(new Object[] {}) {
            @Override
            public Object call(Interpreter interpreter) {
                if (Deque.this.list.isEmpty()) {
                    throw new RuntimeException("Empty deque: peekLast");
                }
                return Deque.this.list.get(Deque.this.list.size() - 1);
            }
        });
        f.put("popFirst", new Callable(new Object[] {}) {
            @Override
            public Object call(Interpreter interpreter) {
                if (Deque.this.list.isEmpty()) {
                    throw new RuntimeException("Empty deque: popFirst");
                }
                return Deque.this.list.remove(0);
            }
        });
}