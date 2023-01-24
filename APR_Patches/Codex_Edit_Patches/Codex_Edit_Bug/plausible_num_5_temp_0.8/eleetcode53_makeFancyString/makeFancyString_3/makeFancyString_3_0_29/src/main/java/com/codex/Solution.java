package com.codex;

import java.util.*;

public class Solution {
    public static String makeFancyString(String s) {
        

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char thisChar = s.charAt(i);
            if (i == 0) {
                sb.append(thisChar);
            } else {
                char lastChar = sb.charAt(sb.length() - 1);
                char lastLastChar = sb.length() >= 2 ? sb.charAt(sb.length() - 2) : ' ';
                if (lastChar != thisChar && lastLastChar != thisChar) {
                    sb.append(thisChar);
                }
            }
        }
        return sb.toString();

        public String simplifyPath(String path) {
        String[] paths = path.split("/");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < paths.length; i++) {
            String thisPath = paths[i];
            // 如果不是根路径，则判断之前的路径是否为最终的路径，如果是就加入到栈中，否则就跳过
            if (!thisPath.equals("")) {
                if (thisPath.equals(".")) {
                    continue;
                }
                // 如果是上级路径，则弹出栈中的最上级路径，如果栈为空，则继续入栈
                else if (thisPath.equals("..")) {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                } else {
                    stack.push(thisPath);
                }
            }
        }
        // 栈中如果为空，则表示是一个根路径
        if (stack.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
            sb.insert(0, "/");
        }
        return sb.toString();
    }

    
    }

    
}