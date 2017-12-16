/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.datastructure.impl
 * @file DirectGraph.java
 * @author Zuo Guoqing
 * @date 2017年12月16日
 * @version 1.0
 */
package com.zuoguoqing.tools.datastructure.impl;

import java.util.Iterator;

import com.zuoguoqing.tools.datastructure.Edge;
import com.zuoguoqing.tools.datastructure.Vertex;

/**
 * 有向图的实现类
 * @author Zuo Guoqing
 * @date 2017年12月16日 下午3:45:52
 * @version 1.0
 */
public class DirectGraph<V, E> extends AbstractGraph<V, E> {

    @Override
    public boolean removeVertex(Vertex<V> vertex) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void removeEdge(Edge<E> edge) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Edge<E> getEdge(Vertex<V> from, Vertex<V> to) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterator<Vertex<V>> adjacentVertexs(Vertex<V> vertex) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void gernateMST() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<?> topologicalSort() throws UnsupportedOperationException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void criticalPath() throws UnsupportedOperationException {
        // TODO Auto-generated method stub
        
    }
    
}
