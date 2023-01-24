package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        String str = "abcdefd";
        char ch = 'd';
        assertEquals("dcbaefd", reversePrefix(str, ch));
    }

    @Test(timeout=500)
    public void test2(){
        String str = "xyxzxe";
        char ch = 'z';
        assertEquals("zxyxxe", reversePrefix(str, ch));
    }

    @Test(timeout=500)
    public void test3(){
        String str = "abcd";
        char ch = 'z';
        assertEquals("abcd", reversePrefix(str, ch));
    }

}