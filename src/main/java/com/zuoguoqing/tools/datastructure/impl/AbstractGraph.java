/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.datastructure.impl
 * @file AbstractGraph.java
 * @author Zuo Guoqing
 * @date 2017年12月16日
 * @version 1.0
 */
package com.zuoguoqing.tools.datastructure.impl;

import java.util.Iterator;

import com.zuoguoqing.tools.datastructure.Edge;
import com.zuoguoqing.tools.datastructure.Graph;
import com.zuoguoqing.tools.datastructure.Vertex;

/**
 * 图接口的抽象实现类。<p>
 * 
 * 该类中实现了无向图和有向图都支持并且实现方式相同的接口方法，<p>
 * 两种图都支持但实现方式不同的方法和各自特有的方法需要继承该类并在子类中实现。
 * 
 * @author Zuo Guoqing
 * @date 2017年12月16日 下午3:37:04
 * @version 1.0
 */
public abstract class AbstractGraph<V, E> implements Graph<V, E> {

    @Override
    public GraphType getType() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getVertexNum() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getEdgeNum() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Iterator<Vertex<V>> getVertexIterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterator<Edge<E>> getEdgeIterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void insertVertex(Vertex<V> vertex) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void insertEdge(Edge<E> edge) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean areAdjacent(Vertex<V> first, Vertex<V> second) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Iterator<?> dfsTraverse(Vertex<V> vertex) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterator<?> bfsTraverse(Vertex<V> vertex) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterator<?> shortestPath(Vertex<V> vertex) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
