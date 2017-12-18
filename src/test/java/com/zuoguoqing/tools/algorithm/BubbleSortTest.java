/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.algorithm
 * @file BubbleSortTest.java
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
 * @date 2017年12月18日 下午10:02:37
 * @version 1.0
 */
public class BubbleSortTest {

    /**
     * Test method for
     * {@link com.zuoguoqing.tools.algorithm.BubbleSort#sort(int[])}.
     */
    @Test
    public final void testSortIntArray() {
        int[] array = { 3, 5, 2, 7, 1 };
        int[] excepted = { 1, 2, 3, 5, 7 };
        BubbleSort.sort(array);
        assertArrayEquals(excepted, array);
        
        Random random = new Random();
        array = IntStream.generate(() -> random.nextInt(100_000)).limit(1000).toArray();
        excepted = Arrays.copyOf(array, array.length);
        Arrays.sort(excepted);
        BubbleSort.sort(array);
        assertArrayEquals(excepted, array);
    }

}
