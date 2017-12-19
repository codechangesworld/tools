/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.algorithm
 * @file MergeSort.java
 * @author Zuo Guoqing
 * @date 2017年12月19日
 * @version 1.0
 */
package com.zuoguoqing.tools.algorithm;

/**
 * 归并排序
 * <p>
 * 时间复杂度：n*log(n)
 * <p>
 * 空间复杂度：n
 * <p>
 * 算法思想：<br>
 * 基于分治思想，递归的对数组进行划分，直到子数组只有一个元素，然后合并子数组。
 * 
 * @author Zuo Guoqing
 * @date 2017年12月19日 下午3:26:27
 * @version 1.0
 */
public class MergeSort {

    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    public static void sort(int[] array, int low, int height) {
        if (low < height) {
            sort(array, low, (low + height) / 2);
            sort(array, (low + height) / 2 + 1, height);
            merge(array, low, (low + height) / 2, height);
        }
    }

    /**
     * 合并子序列
     * 
     * @param array
     * @param low
     * @param mid
     * @param height
     */
    private static void merge(int[] array, int low, int mid, int height) {
        int[] tmp = new int[height - low + 1];  // 临时数组
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= height) {   // 依次取出两个子序列中较小的元素，放入临时数组中
            if (array[i] < array[j]) {
                tmp[k++] = array[i++];
            } else {
                tmp[k++] = array[j++];
            }
        }

        // 将为放入临时数组中的元素放入
        while (i <= mid) {
            tmp[k++] = array[i++];
        }
        while (j <= height) {
            tmp[k++] = array[j++];
        }
        
        for (k = 0; k < height - low + 1; k++) {    // 修改array数组
            array[low + k] = tmp[k];
        }
    }
}
