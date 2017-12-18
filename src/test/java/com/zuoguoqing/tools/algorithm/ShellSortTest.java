/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.algorithm
 * @file ShellSortTest.java
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
 * @date 2017年12月18日 下午9:32:50
 * @version 1.0
 */
public class ShellSortTest {

    /**
     * Test method for
     * {@link com.zuoguoqing.tools.algorithm.ShellSort#sort(int[])}.
     */
    @Test
    public final void testSortIntArray() {
        int[] array = { 4, 6, 2, 1, 7, 9, 3, 8, 5 };
        int[] excepted = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        
        ShellSort.sort(array);
        assertArrayEquals(excepted, array);
    }

}
