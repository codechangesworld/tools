/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.datastructure
 * @file Vertex.java
 * @author Zuo Guoqing
 * @date 2017年12月16日
 * @version 1.0
 */
package com.zuoguoqing.tools.datastructure;

import java.util.List;

/**
 * 图结构的顶点接口
 * @author Zuo Guoqing
 * @date 2017年12月16日 下午3:06:20
 * @version 1.0
 */
public interface Vertex<V> {
    V getData();
    
    void setData(V data);
    
    int getDegree();
    
    int getInDegree();
    
    int getOutDegree();
    
    List<?> getAdjacentEdges();
    
    List<?> getReAdjacentEdges();
    
    Vertex<?> getVertexPosition();
    
    boolean isVisited();
    
    void setToVisited();
    void setToUnVisited();
    
    Object getApplication();
    
    void setApplication();
    
    void resetStatus();
}
