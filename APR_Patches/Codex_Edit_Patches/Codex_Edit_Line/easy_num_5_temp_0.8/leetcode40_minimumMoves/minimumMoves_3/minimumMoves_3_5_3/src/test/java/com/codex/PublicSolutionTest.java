package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        String str = "XXX";
        assertEquals(1, minimumMoves(str));
    }

    @Test(timeout=500)
    public void test2(){
        String str = "XXOX";
        assertEquals(2, minimumMoves(str));
    }

    @Test(timeout=500)
    public void test3(){
        String str = "OOOO";
        assertEquals(0, minimumMoves(str));
    }

}