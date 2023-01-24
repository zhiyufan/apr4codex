package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        String str = "cat and  dog";
        assertEquals(3, countValidWords(str));
    }

    @Test(timeout=500)
    public void test2(){
        String str = "!this  1-s b8d!";
        assertEquals(0, countValidWords(str));
    }

    @Test(timeout=500)
    public void test3(){
        String str = "alice and  bob are playing stone-game10";
        assertEquals(5, countValidWords(str));
    }

}