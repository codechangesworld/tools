/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.algorithm
 * @file QuickSort.java
 * @author Zuo Guoqing
 * @date 2017年12月14日
 * @version 1.0
 */
package com.zuoguoqing.tools.algorithm;

/**
 * 快速排序算法
 * <p>
 * 时间复杂度：最大n*n，最小n*log(n)，平均n*log(n)
 * <p>
 * 空间复杂度：最大n，最小log(n)
 * <p>
 * 算法思想：<br>
 * 通过一个轴点元素a将待排序数组分为两个子数组，左边的数小于a，右边的大于a，<br>
 * 然后递归的对左右子数组进行快速排序，直到子数组中仅有一个元素，此时整个数组排好序。
 * 
 * @author Zuo Guoqing
 * @date 2017年12月14日 下午4:52:20
 * @version 1.0
 */
public class QuickSort {

    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    public static void sort(int[] array, int low, int height) {
        if (low < height) {
            int pivot = partition(array, low, height);
            sort(array, low, pivot - 1);
            sort(array, pivot + 1, height);
        }
    }

    /**
     * 分区算法
     * 
     * @param array
     * @param low
     * @param height
     * @return 返回轴点位置
     */
    private static int partition(int[] array, int low, int height) {
        int pivot = array[low];
        while (low < height) {
            while (low < height && array[height] >= pivot) { // 从高位开始，寻找第一个小于pivot的元素
                height--;
            }
            array[low] = array[height]; // 将小数放左边
            while (low < height && array[low] <= pivot) { // 从低位开始，寻找第一个大于pivot的元素
                low++;
            }
            array[height] = array[low]; // 将大数放右边
        }
        array[low] = pivot; // 将轴点元素放在最终位置

        return low;
    }

}
