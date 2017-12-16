/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.datastructure
 * @file BinaryTreeNode.java
 * @author Zuo Guoqing
 * @date 2017年12月16日
 * @version 1.0
 */
package com.zuoguoqing.tools.datastructure;

/**
 * 二叉树节点接口
 * @author Zuo Guoqing
 * @date 2017年12月16日 下午2:19:58
 * @version 1.0
 */
public interface BinaryTreeNode<T> extends Node<T> {

    /************************* 辅助方法 *****************************/

    /**
     * 是否有父节点
     * 
     * @return
     */
    boolean hasParent();

    /**
     * 是否有左孩子节点
     * 
     * @return
     */
    boolean hasLeftChild();

    /**
     * 是否有右孩子节点
     * 
     * @return
     */
    boolean hasRight();

    /**
     * 判断节点是否是叶节点
     * 
     * @return
     */
    boolean isLeaf();

    /**
     * 判断节点是否是某个节点的左孩子节点
     * 
     * @return
     */
    boolean isLeftChild();

    /**
     * 判断节点是否是某个节点的右孩子节点
     * 
     * @return
     */
    boolean isRightChild();

    /************************** Height相关 ****************************/

    /**
     * 获取高度
     * 
     * @return
     */
    int getHeight();

    /**
     * 更新高度
     */
    void updateHeight();

    /************************** Size相关 *********************************/

    /**
     * 获取子孙节点个数
     * 
     * @return
     */
    int getSize();

    /**
     * 更新节点个数
     */
    void updateSize();

    /************************** 父节点相关 *********************************/

    /**
     * 获取父节点
     * 
     * @return
     */
    BinaryTreeNode<T> getParent();

    /**
     * 断开与父节点的关系
     */
    void sever();

    /************************** 左孩子节点相关 ******************************/

    /**
     * 获取左孩子节点
     * 
     * @return
     */
    BinaryTreeNode<T> getLeftChild();

    /**
     * 设置当前左孩子节点
     * 
     * @return 返回原左孩子节点
     */
    BinaryTreeNode<T> setLeftChild(BinaryTreeNode<T> newLeftChild);

    /************************** 右孩子节点相关 ******************************/

    /**
     * 获取右孩子节点
     * 
     * @return
     */
    BinaryTreeNode<T> getRightChild();

    /**
     * 设置当前右孩子节点
     * 
     * @return 返回原右孩子节点
     */
    BinaryTreeNode<T> setRightChild(BinaryTreeNode<T> newRightChild);

}
