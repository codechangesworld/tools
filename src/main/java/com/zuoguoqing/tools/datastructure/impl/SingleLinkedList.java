/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.datastructure.impl
 * @file SingleLinkedList.java
 * @author Zuo Guoqing
 * @date 2017年12月14日
 * @version 1.0
 */
package com.zuoguoqing.tools.datastructure.impl;

import com.zuoguoqing.tools.datastructure.List;
import com.zuoguoqing.tools.exception.OutOfBoundaryException;

/**
 * 单链表
 * @author Zuo Guoqing
 * @date 2017年12月14日 下午5:29:13
 * @version 1.0
 */
public class SingleLinkedList<T> implements List<T> {

    /**
     * 
     */
    public SingleLinkedList() {
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
    public void insert(int index, T element) throws OutOfBoundaryException {
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
    public T get(int index) throws OutOfBoundaryException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean remove(T element) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public T remove(int index) throws OutOfBoundaryException {
        // TODO Auto-generated method stub
        return null;
    }

}
