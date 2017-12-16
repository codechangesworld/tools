/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.datastructure.impl
 * @file DoubleLinkedList.java
 * @author Zuo Guoqing
 * @date 2017年12月14日
 * @version 1.0
 */
package com.zuoguoqing.tools.datastructure.impl;

import com.zuoguoqing.tools.datastructure.List;
import com.zuoguoqing.tools.exception.OutOfBoundaryException;

/**
 * 双链表
 * @author Zuo Guoqing
 * @date 2017年12月14日 下午5:29:37
 * @version 1.0
 */
public class DoubleLinkedList<T> implements List<T> {

    /**
     * 
     */
    public DoubleLinkedList() {
        // TODO Auto-generated constructor stub
    }

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
    public boolean contains(T element) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int indexOf(T element) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void add(T element) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void insert(int i, T element) throws OutOfBoundaryException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean insertBefore(T original, T element) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean insertAfter(T original, T element) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public T get(int i) throws OutOfBoundaryException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean remove(T element) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public T remove(int i) throws OutOfBoundaryException {
        // TODO Auto-generated method stub
        return null;
    }

}
