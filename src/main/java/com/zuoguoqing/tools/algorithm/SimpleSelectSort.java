/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.algorithm
 * @file SimpleSelectSort.java
 * @author Zuo Guoqing
 * @date 2017年12月19日
 * @version 1.0
 */
package com.zuoguoqing.tools.algorithm;

/**
 * 简单选择排序
 * <p>
 * 时间复杂度：n*n
 * <p>
 * 空间复杂度：1
 * <p>
 * 算法思想：<br>
 * 对n个元素的数组进行n-1次选择，每次选出最小的元素放到前边排好序的子数组后边。
 * 
 * @author Zuo Guoqing
 * @date 2017年12月19日 下午2:00:56
 * @version 1.0
 */
public class SimpleSelectSort {

    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    public static void sort(int[] array, int low, int height) {
        for (int i = low; i < height - 1; i++) { // n - 1次排序
            int min = i;
            for (int j = i + 1; j <= height; j++) { // 在剩余的元素中选择最小的
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                // 交换最小元素到前边有序子数组
                array[i] = array[min] + array[i];
                array[min] = array[i] - array[min];
                array[i] = array[i] - array[min];
            }
        }
    }
}
