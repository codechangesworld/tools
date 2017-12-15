/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.datastructure
 * @file ArrayListTest.java
 * @author Zuo Guoqing
 * @date 2017年12月14日
 * @version 1.0
 */
package com.zuoguoqing.tools.datastructure;

import static org.junit.Assert.*;

import org.junit.Test;

import com.zuoguoqing.tools.datastructure.impl.ArrayList;

/**
 * 
 * @author Zuo Guoqing
 * @date 2017年12月14日 下午6:31:11
 * @version 1.0
 */
public class ArrayListTest {
    
    @Test
    public void testSize() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        assertEquals(0, arrayList.size());
        
        arrayList.add(1);
        arrayList.add(2);
        assertEquals(2, arrayList.size());
    }
    
    @Test
    public void testIsEmpty() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        assertTrue(arrayList.isEmpty());
        
        arrayList.add(1);
        assertFalse(arrayList.isEmpty());
    }
}
