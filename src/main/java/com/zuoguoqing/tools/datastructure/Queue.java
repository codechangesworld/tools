/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.datastructure
 * @file Queue.java
 * @author Zuo Guoqing
 * @date 2017年12月14日
 * @version 1.0
 */
package com.zuoguoqing.tools.datastructure;

/**
 * 队列接口
 * @author Zuo Guoqing
 * @date 2017年12月14日 下午8:58:44
 * @version 1.0
 */
public interface Queue<T> {
    
    /**
     * 返回队列中元素个数
     * @return
     */
    int size();
    
    /**
     * 是否是空队列
     * @return
     */
    boolean isEmpty();
    
    /**
     * 将元素加入队列
     * @param e
     */
    void enqueue(T e);
    
    /**
     * 取出队头元素，并从队列移除
     * @return
     */
    T dequeue();
    
    /**
     * 获取队头元素，但不删除
     * @return
     */
    T peek();
}
