/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.algorithm
 * @file DirectInsertSort.java
 * @author Zuo Guoqing
 * @date 2017年12月18日
 * @version 1.0
 */
package com.zuoguoqing.tools.algorithm;

/**
 * 直接插入排序算法
 * <p>
 * 时间复杂度：最好n，最坏n*n，平均n*n
 * <p>
 * 算法大致思想：<br>
 * 从待排序数组中第二个元素开始，依次插入前边排好序的子数组中。
 * 
 * @author Zuo Guoqing
 * @date 2017年12月18日 下午7:25:57
 * @version 1.0
 */
public class DirectInsertSort {

    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    /**
     * 升序排序
     * 
     * @param array
     *            待排序数组
     * @param low
     *            最低索引
     * @param height
     *            最高索引
     */
    public static void sort(int[] array, int low, int height) {
        int i = low + 1;
        int j = 0;
        int tmp = 0;
        for (; i <= height; i++) { // low+1后的每个元素依次插入前边
            tmp = array[i];
            j = i - 1;
            for (; j >= low; j--) { // 依次与前边元素比较
                if (tmp < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = tmp;
        }
    }
}
