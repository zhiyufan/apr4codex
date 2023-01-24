package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        String str = "hello world";
        String str2 = "ad";
        assertEquals(1, canBeTypedWords(str, str2));
    }

    @Test(timeout=500)
    public void test2(){
        String str = "leet code";
        String str2 = "lt";
        assertEquals(1, canBeTypedWords(str, str2));
    }

    @Test(timeout=500)
    public void test3(){
        String str = "leet code";
        String str2 = "e";
        assertEquals(0, canBeTypedWords(str, str2));
    }
}