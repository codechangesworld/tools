/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.datastructure
 * @file Edge.java
 * @author Zuo Guoqing
 * @date 2017年12月16日
 * @version 1.0
 */
package com.zuoguoqing.tools.datastructure;

/**
 * 图结构的边接口
 * 
 * @author Zuo Guoqing
 * @date 2017年12月16日 下午3:06:58
 * @version 1.0
 */
public interface Edge<E> {
    
    E getData();

    void setData(E data);
    
    double getWeight();
    
    void setWeight(double weight);
    
    Vertex<?> getFirstVertex();
    
    Vertex<?> getSecondVertex();
    
    Vertex<?> getFirstVertexPosition();
    
    Vertex<?> getSecondVertexPosition();
    
    Edge<?> getEdgePositionInFirst();
    
    Edge<?> getEdgePostionInSecond();
    
    Edge<?> getEdgePosition();
    
    void setToMST();
    
    void setToCritical();
    
    boolean isMSTEdge();
    
    boolean isCriticalEdge();
    
    void resetType();
}
