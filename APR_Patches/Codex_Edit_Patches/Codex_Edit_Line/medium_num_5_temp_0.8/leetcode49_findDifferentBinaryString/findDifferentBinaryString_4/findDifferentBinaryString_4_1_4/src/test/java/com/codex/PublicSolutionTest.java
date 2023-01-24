package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        String arr[] = {"01","10"};
        assertEquals("11", findDifferentBinaryString(arr));
    }

    @Test(timeout=500)
    public void test2(){
        String arr[] = {"00","01"};
        assertEquals("11", findDifferentBinaryString(arr));
    }

    @Test(timeout=500)
    public void test3(){
        String arr[] = {"111","011","001"};
        assertEquals("101", findDifferentBinaryString(arr));
    }

}