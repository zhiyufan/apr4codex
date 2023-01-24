package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        String str = "aabca";
        assertEquals(3, countPalindromicSubsequence(str));
    }

    @Test(timeout=500)
    public void test2(){
        String str = "aabca";
        assertEquals(3, countPalindromicSubsequence(str));
    }

    @Test(timeout=500)
    public void test3(){
        String str = "bbcbaba";
        assertEquals(4, countPalindromicSubsequence(str));
    }

}