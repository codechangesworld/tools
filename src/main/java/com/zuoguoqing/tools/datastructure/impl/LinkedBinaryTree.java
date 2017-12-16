/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.datastructure.impl
 * @file LinkedBinaryTree.java
 * @author Zuo Guoqing
 * @date 2017年12月16日
 * @version 1.0
 */
package com.zuoguoqing.tools.datastructure.impl;

import com.zuoguoqing.tools.datastructure.BinaryTree;
import com.zuoguoqing.tools.datastructure.BinaryTreeNode;
import com.zuoguoqing.tools.datastructure.Visitor;

/**
 * 
 * @author Zuo Guoqing
 * @date 2017年12月16日 下午2:35:01
 * @version 1.0
 */
public class LinkedBinaryTree<T> implements BinaryTree<T> {

    @Override
    public int getSize() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int getHeight() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public BinaryTreeNode<T> getRoot() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BinaryTreeNode<T> getParent(BinaryTreeNode<T> node) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BinaryTreeNode<T> getLeftChild(BinaryTreeNode<T> node) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BinaryTreeNode<T> getRightChild(BinaryTreeNode<T> node) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean insert(T data) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean delete(T data) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public BinaryTreeNode<T> find(T data) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object preOrder(Visitor visitor) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object inOrder(Visitor visitor) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object postOrder(Visitor visitor) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object levelOrder(Visitor visitor) {
        // TODO Auto-generated method stub
        return null;
    }

}
