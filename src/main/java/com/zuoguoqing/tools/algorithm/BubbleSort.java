/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.algorithm
 * @file BubbleSort.java
 * @author Zuo Guoqing
 * @date 2017年12月18日
 * @version 1.0
 */
package com.zuoguoqing.tools.algorithm;

/**
 * 冒泡排序
 * <p>
 * 时间复杂度：最好n，最坏n*n，平均n*n
 * <p>
 * 算法思想：<br>
 * 对n个元素的数组进行n-1次排序，每次排序将未排序的数组中的最大的元素放入上次排好序的子数组的最前边。
 * 
 * @author Zuo Guoqing
 * @date 2017年12月18日 下午9:47:25
 * @version 1.0
 */
public class BubbleSort {
    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    public static void sort(int[] array, int low, int height) {
        int n = height - low + 1;
        boolean flag = false;   // 标志符号，表示一次排序过程中有没有交换元素
        for (int i = 1; i < n; i++) { // n个元素，排序n-1次
            for (int j = low; j <= height - i; j++) {
                if (array[j] > array[j+1]) {    // 交换两个元素
                    array[j] = array[j] + array[j+1];
                    array[j+1] = array[j] - array[j+1];
                    array[j] = array[j] - array[j+1];
                    flag = true;
                }
            }
            if (!flag) {    // 若中间有一次排序没有交换元素，则表示所有元素有序，可以结束排序
                break;  
            }
            flag = false;
        }// end outer for
    }
    
    
}
