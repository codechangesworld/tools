/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.algorithm
 * @file BinaryInsertSort.java
 * @author Zuo Guoqing
 * @date 2017年12月18日
 * @version 1.0
 */
package com.zuoguoqing.tools.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Zuo Guoqing
 * @date 2017年12月18日 下午8:26:25
 * @version 1.0
 */
public class BinaryInsertSortTest {

    /**
     * Test method for
     * {@link com.zuoguoqing.tools.algorithm.BinaryInsertSort#sort(int[])}.
     */
    @Test
    public final void testSortIntArray() {
        int[] array = { 3, 4, 2, 1, 5 };
        int[] excepted = { 1, 2, 3, 4, 5 };
        BinaryInsertSort.sort(array);
        
        assertArrayEquals(excepted, array);
    }

}
