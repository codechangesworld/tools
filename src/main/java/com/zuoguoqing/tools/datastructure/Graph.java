/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.datastructure
 * @file Graph.java
 * @author Zuo Guoqing
 * @date 2017年12月16日
 * @version 1.0
 */
package com.zuoguoqing.tools.datastructure;

import java.util.Iterator;

/**
 * 图接口
 * 
 * @author Zuo Guoqing
 * @date 2017年12月16日 下午2:46:06
 * @version 1.0
 */
public interface Graph<V, E> {

    /**
     * 图类型枚举
     * 
     * @author Zuo Guoqing
     * @date 2017年12月16日 下午2:50:06
     * @version 1.0
     */
    public enum GraphType {
        // 无向图
        UN_DIRECTED_GRAPH,
        // 有向图
        DIRECTED_GRAPH
    }
    
    /**
     * 获取当前图类型
     * 
     * @return 返回图类型
     */
    GraphType getType();
    
    /**
     * 获取当前图中顶点个数
     * 
     * @return 返回图顶点个数
     */
    int getVertexNum();
    
    /**
     * 获取当前图边的个数
     * 
     * @return 返回边个数
     */
    int getEdgeNum();
    
    /**
     * 获取当前图中顶点的迭代器
     * 
     * @return 返回顶点迭代器
     */
    Iterator<Vertex<V>> getVertexIterator();
    
    /**
     * 获取当前图的边迭代器
     * 
     * @return 返回边迭代器
     */
    Iterator<Edge<E>> getEdgeIterator();
    
    /**
     * 向图插入新顶点
     * 
     * @param vertex 
     */
    void insertVertex(Vertex<V> vertex);
    
    /**
     * 向图插入新的边
     * @param edge
     */
    void insertEdge(Edge<E> edge);
    
    /**
     * 删除图中指定顶点
     * @param vertex
     * @return 删除成功返回true，失败或不存在该顶点返回false
     */
    boolean removeVertex(Vertex<V> vertex);
    
    /**
     * 删除图中指定边
     * @param edge
     * @return 删除成功返回true，失败或不存在该顶点返回false
     */
    void removeEdge(Edge<E> edge);
    
    /**
     * 判断second顶点是否是first顶点的邻接顶点
     * @param first
     * @param second
     * @return 是则返回true，不是则返回false
     */
    boolean areAdjacent(Vertex<V> first, Vertex<V> second);
    
    /**
     * 获取从顶点from到顶点to的边
     * @param from
     * @param to
     * @return 返回一条边
     */
    Edge<E> getEdge(Vertex<V> from, Vertex<V> to);
    
    /**
     * 获取指定顶点的所有邻接点
     * @param vertex
     * @return 返回邻接点的迭代器
     */
    Iterator<Vertex<V>> adjacentVertexs(Vertex<V> vertex);
    
    /**
     * 从指定顶点开始对图进行深度优先遍历
     * @param vertex
     * @return 返回遍历结果的迭代器
     */
    Iterator<?> dfsTraverse(Vertex<V> vertex);
    
    /**
     * 从指定顶点开始对图进行广度优先遍历
     * @param vertex
     * @return 返回遍历结果的迭代器
     */
    Iterator<?> bfsTraverse(Vertex<V> vertex);
    
    /**
     * 获取指定顶点到图中所有顶点的最短路径
     * @param vertex
     * @return 返回结果的迭代器
     */
    Iterator<?> shortestPath(Vertex<V> vertex);
    
    /**
     * 获取无向图的最小生成树，有向图不支持此操作
     * @throws UnsupportedOperationException
     */
    void gernateMST() throws UnsupportedOperationException;
    
    /**
     * 获取有向图的拓扑序列，无向图不支持此操作
     * @return 拓扑序列的迭代器
     * @throws UnsupportedOperationException
     */
    Iterator<?> topLogicalSort() throws UnsupportedOperationException;
    
    /**
     * 获取有向无环图的关键路径，无向图不支持此操作
     * @throws UnsupportedOperationException
     */
    void criticalPath() throws UnsupportedOperationException;
}
