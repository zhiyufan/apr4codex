package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        char arr[][] = {
            {'.','.','.','B','.','.','.','.'},
            {'.','.','.','W','.','.','.','.'},
            {'.','.','.','W','.','.','.','.'},
            {'.','.','.','W','.','.','.','.'},
            {'W','B','B','.','W','W','W','B'},
            {'.','.','.','B','.','.','.','.'},
            {'.','.','.','B','.','.','.','.'},
            {'.','.','.','W','.','.','.','.'}
        };
        assertTrue(checkMove(arr, 4, 3, 'B'));
    }

    @Test(timeout=500)
    public void test2(){
        char arr[][] = {
            {'.','.','.','.','.','.','.','.'},
            {'.','B','.','.','W','.','.','.'},
            {'.','.','W','.','.','.','.','.'},
            {'.','.','.','W','B','.','.','.'},
            {'.','.','.','.','.','.','.','.'},
            {'.','.','.','.','B','W','.','.'},
            {'.','.','.','.','.','.','W','.'},
            {'.','.','.','.','.','.','.','B'}
            };
        assertFalse(checkMove(arr, 4, 4, 'W'));
    }
}