/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.algorithm
 * @file MergeSortTest.java
 * @author Zuo Guoqing
 * @date 2017年12月19日
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
 * @date 2017年12月19日 下午3:50:11
 * @version 1.0
 */
public class MergeSortTest {

    /**
     * Test method for {@link com.zuoguoqing.tools.algorithm.MergeSort#sort(int[])}.
     */
    @Test
    public final void testSortIntArray() {
        int[] array = { 3, 4, 1, 5, 7, 2, 9 };
        int[] excepted = { 1, 2, 3, 4, 5, 7, 9 };
        
        MergeSort.sort(array);
        System.out.println(Arrays.toString(array));
        assertArrayEquals(excepted, array);
        
        Random random = new Random();
        array = IntStream.generate(() -> random.nextInt(10_000)).limit(10).toArray();
        excepted = Arrays.copyOf(array, array.length);
        MergeSort.sort(array);
        Arrays.sort(excepted);
        assertArrayEquals(excepted, array);
    }

}
