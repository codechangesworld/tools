/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.datastructure.impl
 * @file BinaryTreeNode.java
 * @author Zuo Guoqing
 * @date 2017年12月16日
 * @version 1.0
 */
package com.zuoguoqing.tools.datastructure.impl;

import com.zuoguoqing.tools.datastructure.BinaryTreeNode;

/**
 * 链式存储二叉树节点实现类
 * @author Zuo Guoqing
 * @date 2017年12月16日 下午2:01:58
 * @version 1.0
 */
public class LinkedBinaryTreeNode<T> implements BinaryTreeNode<T> {
    // 节点数据
    private T data;
    // 父节点
    private LinkedBinaryTreeNode<T> parent;
    // 左孩子节点
    private LinkedBinaryTreeNode<T> leftChild;
    // 右孩子节点
    private LinkedBinaryTreeNode<T> rightChild;
    // 以该节点为根的子树高度
    private int height;
    // 以该节点为根的子树节点个数
    private int size;
    
    public LinkedBinaryTreeNode() {
        this(null);
    }

    public LinkedBinaryTreeNode(T data) {
        this.data = data;
        this.parent = null;
        this.leftChild = null;
        this.rightChild = null;
        this.height = 0;
        this.size = 1;
    }

    /*************************  Node接口方法   ******************************/
    @Override
    public void setNodeData(T data) {
        this.data = data;
    }

    @Override
    public T getNodeData() {
        return this.data;
    }
    
    /*************************  辅助方法    *****************************/
    
    /**
     * 是否有父节点
     * @return
     */
    public boolean hasParent() {
        return parent != null;
    }
    
    /**
     * 是否有左孩子节点
     * @return
     */
    public boolean hasLeftChild() {
        return leftChild != null;
    }
    
    /**
     * 是否有右孩子节点
     * @return
     */
    public boolean hasRight() {
        return rightChild != null;
    }

    @Override
    public boolean isLeaf() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isLeftChild() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isRightChild() {
        // TODO Auto-generated method stub
        return false;
    }

    /************************** Height相关 ****************************/
    
    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public void updateHeight() {
        // TODO Auto-generated method stub
        
    }
    
    /************************** Size相关 *********************************/

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void updateSize() {
        // TODO Auto-generated method stub
        
    }
    
    /************************** 父节点相关 *********************************/

    @Override
    public BinaryTreeNode<T> getParent() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void sever() {
        // TODO Auto-generated method stub
        
    }

    /************************** 左孩子节点相关 ******************************/
    
    @Override
    public BinaryTreeNode<T> getLeftChild() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BinaryTreeNode<T> setLeftChild(BinaryTreeNode<T> newLeftChild) {
        // TODO Auto-generated method stub
        return null;
    }
    
    /************************** 右孩子节点相关 ******************************/

    @Override
    public BinaryTreeNode<T> getRightChild() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BinaryTreeNode<T> setRightChild(BinaryTreeNode<T> newRightChild) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
