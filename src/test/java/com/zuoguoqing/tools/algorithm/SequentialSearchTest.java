/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.algorithm
 * @file SequentialSearchTest.java
 * @author Zuo Guoqing
 * @date 2017年12月16日
 * @version 1.0
 */
package com.zuoguoqing.tools.algorithm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import org.junit.Test;

/**
 * 
 * @author Zuo Guoqing
 * @date 2017年12月16日 下午9:02:01
 * @version 1.0
 */
public class SequentialSearchTest {

    /**
     * Test method for
     * {@link com.zuoguoqing.tools.algorithm.SequentialSearch#seqSearch(char, char[])}.
     */
    @Test
    public void testSeqSearchCharCharArray() {
        char[] array = "hello world! This is a simple test!".toCharArray();
        assertEquals(0, SequentialSearch.seqSearch('h', array));
    }

    /**
     * Test method for
     * {@link com.zuoguoqing.tools.algorithm.SequentialSearch#seqSearch(byte, byte[])}.
     */
    @Test
    public void testSeqSearchByteByteArray() {

    }

    /**
     * Test method for
     * {@link com.zuoguoqing.tools.algorithm.SequentialSearch#seqSearch(short, short[])}.
     */
    @Test
    public void testSeqSearchShortShortArray() {
    }

    /**
     * Test method for
     * {@link com.zuoguoqing.tools.algorithm.SequentialSearch#seqSearch(int, int[])}.
     */
    @Test
    public void testSeqSearchIntIntArray() {
        int[] array = IntStream.rangeClosed(1, 1_000_000).toArray();
        System.out.println("search with guard");
        long begin = System.currentTimeMillis();
        SequentialSearch.seqSearch(2, array);
        long end = System.currentTimeMillis();

        System.out.println("time cost:\t" + (end - begin) + " ms");
    }

    /**
     * Test method for
     * {@link com.zuoguoqing.tools.algorithm.SequentialSearch#seqSearch(long, long[])}.
     */
    @Test
    public void testSeqSearchLongLongArray() {
        long[] array = LongStream.rangeClosed(1, 1_000).toArray();
        assertNotEquals(-1, SequentialSearch.seqSearch(10, array));
    }

    /**
     * Test method for
     * {@link com.zuoguoqing.tools.algorithm.SequentialSearch#seqSearch(float, float[])}.
     */
    @Test
    public void testSeqSearchFloatFloatArray() {
    }

    /**
     * Test method for
     * {@link com.zuoguoqing.tools.algorithm.SequentialSearch#seqSearch(double, double[])}.
     */
    @Test
    public void testSeqSearchDoubleDoubleArray() {
        double[] array = DoubleStream.iterate(1.0, (a) -> a + 0.5).limit(10).toArray();
        assertNotEquals(-1, SequentialSearch.seqSearch(1.5, array));
    }

    /**
     * Test method for
     * {@link com.zuoguoqing.tools.algorithm.SequentialSearch#seqSearch(java.lang.Object, T[])}.
     */
    @Test
    public void testSeqSearchTTArray() {
        
    }

}
