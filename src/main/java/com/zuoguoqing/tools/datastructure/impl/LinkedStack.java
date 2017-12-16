/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.datastructure.impl
 * @file LinkedStack.java
 * @author Zuo Guoqing
 * @date 2017年12月16日
 * @version 1.0
 */
package com.zuoguoqing.tools.datastructure.impl;

import com.zuoguoqing.tools.datastructure.Stack;
import com.zuoguoqing.tools.exception.StackEmptyException;

/**
 * 链式存储栈
 * @author Zuo Guoqing
 * @date 2017年12月16日 下午2:38:20
 * @version 1.0
 */
public class LinkedStack<T> implements Stack<T> {

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void push(T e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public T pop() throws StackEmptyException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T peek() throws StackEmptyException {
        // TODO Auto-generated method stub
        return null;
    }

}
