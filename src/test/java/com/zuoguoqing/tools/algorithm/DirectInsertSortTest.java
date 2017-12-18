/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.algorithm
 * @file DirectInsertSortTest.java
 * @author Zuo Guoqing
 * @date 2017年12月18日
 * @version 1.0
 */
package com.zuoguoqing.tools.algorithm;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

import org.junit.Test;

/**
 * 
 * @author Zuo Guoqing
 * @date 2017年12月18日 下午7:37:54
 * @version 1.0
 */
public class DirectInsertSortTest {

    /**
     * Test method for
     * {@link com.zuoguoqing.tools.algorithm.DirectInsertSort#sort(int[])}.
     */
    @Test
    public final void testSortIntArray() {
        int[] array = { 3, 2, 4, 1 };
        int[] expected = { 1, 2, 3, 4 };

        DirectInsertSort.sort(array);
        assertArrayEquals(expected, array);
    }

    /**
     * Test method for
     * {@link com.zuoguoqing.tools.algorithm.DirectInsertSort#sort(int[], int, int)}.
     */
    @Test
    public final void testSortIntArrayIntInt() {
        Random random = new Random();
        int[] array = IntStream.generate(() -> random.nextInt(10000)).limit(10_000).toArray();
        int[] excepted = Arrays.copyOf(array, array.length);
        Arrays.sort(excepted);
        DirectInsertSort.sort(array, 0, array.length - 1);
        assertArrayEquals(excepted, array);
    }

}
