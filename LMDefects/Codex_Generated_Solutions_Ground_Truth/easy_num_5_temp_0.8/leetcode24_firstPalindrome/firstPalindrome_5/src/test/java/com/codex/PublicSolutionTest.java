package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        String arr[] = {"abc","car","ada","racecar","cool"};
        assertEquals("ada", firstPalindrome(arr));
    }

    @Test(timeout=500)
    public void test2(){
        String arr[] = {"notapalindrome","racecar"};
        assertEquals("racecar", firstPalindrome(arr));
    }

    @Test(timeout=500)
    public void test3(){
        String arr[] = {"def","ghi"};
        assertEquals("", firstPalindrome(arr));
    }


}