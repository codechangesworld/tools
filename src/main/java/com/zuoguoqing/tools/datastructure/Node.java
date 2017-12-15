/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.datastructure
 * @file Node.java
 * @author Zuo Guoqing
 * @date 2017年12月15日
 * @version 1.0
 */
package com.zuoguoqing.tools.datastructure;

/**
 * 表示一个数据节点
 * @author Zuo Guoqing
 * @date 2017年12月15日 下午6:35:09
 * @version 1.0
 */
public interface Node<T> {
    
    /**
     * 设置数据
     * @param data
     */
    void setNodeData(T data);
    
    /**
     * 获取数据
     * @return
     */
    T getNodeData();
    
}
