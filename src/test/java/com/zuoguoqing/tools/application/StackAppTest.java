/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.application
 * @file StackAppTest.java
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
 * @date 2017年12月14日 下午9:59:14
 * @version 1.0
 */
public class StackAppTest {
    
    @Test
    public void testBaseConvertion() {
        assertEquals("14", StackApp.baseConvertion(12, 8));
        assertEquals("C", StackApp.baseConvertion(12, 16));
    }
    
    @Test
    public void testBracketMatch() {
        assertTrue(StackApp.bracketMatch("2*(1+1)"));
        
        assertFalse(StackApp.bracketMatch("{hello[123]world"));
    }
}
