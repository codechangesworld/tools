/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.datastructure
 * @file List.java
 * @author Zuo Guoqing
 * @date 2017年12月14日
 * @version 1.0
 */
package com.zuoguoqing.tools.datastructure;

import com.zuoguoqing.tools.exception.OutOfBoundaryException;

/**
 * 
 * @author Zuo Guoqing
 * @date 2017年12月14日 下午5:27:25
 * @version 1.0
 */
public interface List<T> {
    /**
     * 返回线性表元素个数
     * @return
     */
    int size();
    
    /**
     * 判断表是否为空
     * @return
     */
    boolean isEmpty();
    
    /**
     * 判断表是否包含指定元素
     * @param element
     * @return
     */
    boolean contains(T element);
    
    /**
     * 返回指定对象在表中的位置索引
     * @param element
     * @return
     */
    int indexOf(T element);
    
    /**
     * 添加元素
     * @param element
     */
    void add(T element);
    
    /**
     * 在指定位置插入元素
     * @param i
     * @param element
     */
    void insert(int index, T element) throws OutOfBoundaryException;
    
    /**
     * 在指定元素前插入元素
     * @param original
     * @param element
     * @return
     */
    boolean insertBefore(T original, T element);
    
    /**
     * 在指定元素后插入元素
     * @param original
     * @param element
     * @return
     */
    boolean insertAfter(T original, T element);

    /**
     * 获取指定位置元素
     * @param i
     * @return
     */
    T get(int index) throws OutOfBoundaryException;
    
    /**
     * 移除指定元素
     * @param element
     * @return
     */
    boolean remove(T element);
    
    /**
     * 移除指定位置元素
     * @param i
     * @return
     */
    T remove(int index) throws OutOfBoundaryException;
    
}
