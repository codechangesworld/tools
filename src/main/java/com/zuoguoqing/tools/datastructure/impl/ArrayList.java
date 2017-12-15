/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.datastructure.impl
 * @file ArrayList.java
 * @author Zuo Guoqing
 * @date 2017年12月14日
 * @version 1.0
 */
package com.zuoguoqing.tools.datastructure.impl;

import java.util.Arrays;

import com.zuoguoqing.tools.datastructure.List;
import com.zuoguoqing.tools.exception.OutOfBoundaryException;

/**
 * 
 * @author Zuo Guoqing
 * @date 2017年12月14日 下午5:28:11
 * @version 1.0
 */
public class ArrayList<T> implements List<T> {

    /**
     * 默认容量
     */
    private static final int DAFAULT_CAPACITY = 10;

    /**
     * 元素数组
     */
    private Object[] elementData;

    /**
     * 当前元素个数
     */
    private int size;

    /**
     * 创建默认大小的数组列表
     */
    public ArrayList() {
        elementData = new Object[DAFAULT_CAPACITY];
        size = 0;
    }

    /**
     * 创建指定容量的数组列表
     * 
     * @param capacity
     */
    public ArrayList(int capacity) {
        elementData = new Object[capacity];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int indexOf(T element) {
        int index = 0;
        if (element != null) {
            for (; index < size; index++) {
                if (elementData[index].equals(element)) {
                    break;
                }
            }
        } else {
            for (; index < size; index++) {
                if (elementData[index] == element) {
                    break;
                }
            }
        }
        return index == size ? -1 : index;
    }

    @Override
    public boolean contains(T element) {
        return indexOf(element) == -1;
    }

    @Override
    public void add(T element) {
        checkAndEnlargeCapacity();
        elementData[size++] = element;
    }

    @Override
    public void insert(int index, T element) throws OutOfBoundaryException {
        if (index < 0 || index > size) {
            throw new OutOfBoundaryException();
        }

        checkAndEnlargeCapacity();
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
        elementData[index] = element;
        size++;
    }

    @Override
    public boolean insertBefore(T original, T element) {
        int index = indexOf(original);
        if (index == -1) {
            return false;
        }

        try {
            insert(index, element);
        } catch (OutOfBoundaryException e) {
            return false;
        }

        return true;
    }

    @Override
    public boolean insertAfter(T original, T element) {
        int index = indexOf(original);
        if (index == -1) {
            return false;
        }

        try {
            insert(index + 1, element);
        } catch (OutOfBoundaryException e) {
            return false;
        }

        return false;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get(int index) throws OutOfBoundaryException {
        if (!checkIndex(index)) {
            throw new OutOfBoundaryException();
        }

        return (T) elementData[index];
    }

    @Override
    public boolean remove(T element) {
        int index = indexOf(element);
        try {
            remove(index);
        } catch (OutOfBoundaryException e) {
            return false;
        }

        return true;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T remove(int index) throws OutOfBoundaryException {
        if (!checkIndex(index)) {
            throw new OutOfBoundaryException();
        }

        T obj = (T) elementData[index];
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        elementData[size] = null;
        size--;

        return obj;
    }

    /**
     * 检查索引是否溢出
     * 
     * @param index
     * @return 正常则返回true，溢出则返回false
     */
    private boolean checkIndex(int index) {
        return index >= 0 && index < size;
    }

    /**
     * 检查数组容量，若已满则扩容
     */
    private void checkAndEnlargeCapacity() {
        if (size >= elementData.length) {
            elementData = Arrays.copyOf(elementData, elementData.length * 2);
        }
    }
}
