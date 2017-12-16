/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.datastructure
 * @file BinaryTree.java
 * @author Zuo Guoqing
 * @date 2017年12月15日
 * @version 1.0
 */
package com.zuoguoqing.tools.datastructure;

/**
 * 二叉树接口
 * @author Zuo Guoqing
 * @date 2017年12月15日 下午6:31:58
 * @version 1.0
 */
public interface BinaryTree<T> {
    
    /**
     * 返回树节点个数
     * @return
     */
    int getSize();
    
    /**
     * 是否是空树
     * @return
     */
    boolean isEmpty();
    
    /**
     * 返回树的高度
     * @return
     */
    int getHeight();
    
    /**
     * 返回树的根节点
     * @return
     */
    BinaryTreeNode<T> getRoot();
    
    /**
     * 返回节点的父节点
     * @param node
     * @return
     */
    BinaryTreeNode<T> getParent(BinaryTreeNode<T> node);
    
    /**
     * 返回节点的左孩子节点
     * @param node
     * @return
     */
    BinaryTreeNode<T> getLeftChild(BinaryTreeNode<T> node);
    
    /**
     * 返回节点的右孩子节点
     * @param node
     * @return
     */
    BinaryTreeNode<T> getRightChild(BinaryTreeNode<T> node);
    
    /**
     * 将数据插入树中
     * @param data
     * @return
     */
    boolean insert(T data);
    
    /**
     * 删除指定数据的节点
     * @param data
     * @return
     */
    boolean delete(T data);
    
    /**
     * 查找指定数据所在的树节点
     * @param data
     * @return
     */
    BinaryTreeNode<T> find(T data);

    /**
     * 先序遍历树中节点
     * @param visitor 对节点的访问者
     * @return
     */
    Object preOrder(Visitor visitor);
    
    /**
     * 中序遍历树中节点
     * @param visitor 对节点的访问者
     * @return
     */
    Object inOrder(Visitor visitor);
    
    /**
     * 后序遍历树中节点
     * @param visitor 对节点的访问者
     * @return
     */
    Object postOrder(Visitor visitor);
    
    /**
     * 层次遍历树中节点
     * @param visitor 对节点的访问者
     * @return
     */
    Object levelOrder(Visitor visitor);
}
