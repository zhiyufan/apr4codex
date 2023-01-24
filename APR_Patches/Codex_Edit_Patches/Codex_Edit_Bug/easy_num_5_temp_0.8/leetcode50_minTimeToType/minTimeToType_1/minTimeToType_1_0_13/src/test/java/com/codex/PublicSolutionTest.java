package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {

    @Test(timeout=500)
    public void test1(){
        String str = "abc";
        assertEquals(5, minTimeToType(str));
    }

    @Test(timeout=500)
    public void test2(){
        String str = "bza";
        assertEquals(7, minTimeToType(str));
    }

    @Test(timeout=500)
    public void test3(){
        String str = "zjpc";
        assertEquals(34, minTimeToType(str));
    }

}