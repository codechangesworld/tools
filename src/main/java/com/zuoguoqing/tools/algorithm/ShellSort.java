/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.algorithm
 * @file ShellSort.java
 * @author Zuo Guoqing
 * @date 2017年12月18日
 * @version 1.0
 */
package com.zuoguoqing.tools.algorithm;

/**
 * 希尔排序
 * <p>
 * 时间复杂度：约为n的3/2次方
 * <p>
 * 空间复杂度：1
 * <p>
 * 算法思想：<br>
 * 将待排序数组分割成多个子序列分别进行直接插入排序，<br>
 * 待子序列基本有序时，在对整个数组使用直接插入排序。
 * 
 * @author Zuo Guoqing
 * @date 2017年12月18日 下午9:07:16
 * @version 1.0
 */
public class ShellSort {
    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    public static void sort(int[] array, int low, int height) {
        // 不同的数据规模选择不同的步长序列，此处是自定义的
        int[] delta = null;
        if (height - low < 1000) {
            delta = new int[] { 5, 3, 1 };
        } else if (height - low < 10_000) {
            delta = new int[] { 19, 11, 5, 1 };
        } else if (height - low < 100_000) {
            delta = new int[] { 49, 19, 11, 5, 1 };
        } else {
            delta = new int[] { 101, 49, 19, 11, 5, 1 };
        }

        for (int i = 0; i < delta.length; i++) {
            shellSort(array, low, height, delta[i]);
        }
    }

    private static void shellSort(int[] array, int low, int height, int delta) {
        for (int i = low + delta; i <= height; i++) {   // 分成delta个子序列，每个子序列进行插入排序
            int tmp = array[i];
            int j = i - delta;
            for (; j >= low; j -= delta) {  // 同一个子序列中，一次元素移动步长为delta
                if (tmp < array[j]) {
                    array[j + delta] = array[j];
                } else {
                    break;
                }
            }
            array[j + delta] = tmp;
        }
    }
}
