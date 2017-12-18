/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.algorithm
 * @file BinaryInsertSort.java
 * @author Zuo Guoqing
 * @date 2017年12月18日
 * @version 1.0
 */
package com.zuoguoqing.tools.algorithm;

/**
 * 折半插入排序
 * <p>
 * 时间复杂度：n*n
 * <p>
 * 大致思想：<br>
 * 在直接插入排序的基础上，每次向前边有序子数组中插入元素时，<br>
 * 先使用折半排序法找出要插入的位置，然后一次性移动数组元素。
 * 
 * @author Zuo Guoqing
 * @date 2017年12月18日 下午8:03:54
 * @version 1.0
 */
public class BinaryInsertSort {

    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    public static void sort(int[] array, int low, int height) {
        for (int i = low + 1; i <= height; i++) {
            int tmp = array[i]; // 待插入元素
            int insert = i; // 待插入位置

            int l = low;
            int h = i - 1;
            int mid = 0;
            while (l <= h) {
                mid = (l + h) / 2;
                if (tmp < array[mid]) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            insert = h + 1; // 最终插入位置是h+1

            for (int j = i - 1; j >= insert; j--) {
                array[j + 1] = array[j];
            }
            array[insert] = tmp;
        }
    }
}
