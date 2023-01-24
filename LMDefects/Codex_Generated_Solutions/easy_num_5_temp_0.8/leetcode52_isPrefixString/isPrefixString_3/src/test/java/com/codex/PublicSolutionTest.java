package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        String arr[] = {"i","love","leetcode","apples"};
        String str = "iloveleetcode";
        assertTrue(isPrefixString(str, arr));
    }

    @Test(timeout=500)
    public void test2(){
        String arr[] = {"apples","i","love","leetcode"};
        String str = "iloveleetcode";
        assertFalse(isPrefixString(str, arr));
    }
}