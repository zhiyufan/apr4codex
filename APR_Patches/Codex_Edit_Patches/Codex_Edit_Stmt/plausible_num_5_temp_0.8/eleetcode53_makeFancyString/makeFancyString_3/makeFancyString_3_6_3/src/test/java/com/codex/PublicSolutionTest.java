package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        String str = "leeetcode";
        assertEquals("leetcode", makeFancyString(str));
    }

    @Test(timeout=500)
    public void test2(){
        String str = "aaabaaaa";
        assertEquals("aabaa", makeFancyString(str));
    }

    @Test(timeout=500)
    public void test3(){
        String str = "aab";
        assertEquals("aab", makeFancyString(str));
    }
}