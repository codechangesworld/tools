/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.datastructure
 * @file Stack.java
 * @author Zuo Guoqing
 * @date 2017年12月14日
 * @version 1.0
 */
package com.zuoguoqing.tools.datastructure;

import com.zuoguoqing.tools.exception.StackEmptyException;

/**
 * 栈接口
 * @author Zuo Guoqing
 * @date 2017年12月14日 下午8:55:34
 * @version 1.0
 */
public interface Stack<T> {
    
    /**
     * 栈中元素个数
     * @return
     */
    int size();
    
    /**
     * 是否是空栈
     * @return
     */
    boolean isEmpty();
    
    /**
     * 向栈顶放入元素
     * @param e
     */
    void push(T e);
    
    /**
     * 取出栈顶元素，并在栈中删除
     * @return
     */
    T pop() throws StackEmptyException;
    
    /**
     * 取出栈顶元素，但不删除
     * @return
     */
    T peek() throws StackEmptyException;
}
