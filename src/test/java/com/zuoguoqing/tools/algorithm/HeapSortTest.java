/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.algorithm
 * @file HeapSortTest.java
 * @author Zuo Guoqing
 * @date 2017年12月19日
 * @version 1.0
 */
package com.zuoguoqing.tools.algorithm;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

import org.junit.Test;

/**
 * 
 * @author Zuo Guoqing
 * @date 2017年12月19日 下午3:07:40
 * @version 1.0
 */
public class HeapSortTest {

    /**
     * Test method for {@link com.zuoguoqing.tools.algorithm.HeapSort#sort(int[])}.
     */
    @Test
    public final void testSort() {
        int[] array = { 0, 3, 4, 1, 5, 7, 2, 9 };
        int[] excepted = {0, 1, 2, 3, 4, 5, 7, 9 };
        
        HeapSort.sort(array);
        assertArrayEquals(excepted, array);
        
        Random random = new Random();
        array = IntStream.generate(() -> random.nextInt(10_000)).limit(10).toArray();
        excepted = Arrays.copyOf(array, array.length + 1);
        excepted[excepted.length - 1] = excepted[0];
        excepted[0] = 0;
        array = Arrays.copyOf(excepted, excepted.length);
        HeapSort.sort(array);
        Arrays.sort(excepted);
        assertArrayEquals(excepted, array);
    }

}
