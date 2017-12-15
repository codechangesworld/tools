/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.application
 * @file Recursion.java
 * @author Zuo Guoqing
 * @date 2017年12月14日
 * @version 1.0
 */
package com.zuoguoqing.tools.application;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Zuo Guoqing
 * @date 2017年12月14日 下午11:05:18
 * @version 1.0
 */
public class RecursionTest {

    @Test
    public void testCoding() {
        int n = 5;
        byte[] b = new byte[n];
        Recursion.coding(b, n - 1);
    }

}
