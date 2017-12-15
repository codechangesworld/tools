/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.datastructure.impl
 * @file ArrayStack.java
 * @author Zuo Guoqing
 * @date 2017年12月14日
 * @version 1.0
 */
package com.zuoguoqing.tools.datastructure.impl;

import com.zuoguoqing.tools.datastructure.Stack;
import com.zuoguoqing.tools.exception.StackEmptyException;

/**
 * 
 * @author Zuo Guoqing
 * @date 2017年12月14日 下午9:36:47
 * @version 1.0
 */
public class ArrayStack<T> implements Stack<T> {

    private static final int DEFAULT_CAPACITY = 10;

    private Object[] elements;
    private int top;

    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayStack(int capacity) {
        elements = new Object[capacity];
        top = -1;
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public void push(T e) {
        if (top + 1 == elements.length) {
            expandSpace();
        }
        elements[++top] = e;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException();
        }
        
        return (T) elements[top--];
    }

    @SuppressWarnings("unchecked")
    @Override
    public T peek() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException();
        }
        return (T) elements[top];
    }
    
    private void expandSpace() {
        Object[] newElements = new Object[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

}
