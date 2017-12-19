/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.algorithm
 * @file HeapSort.java
 * @author Zuo Guoqing
 * @date 2017年12月19日
 * @version 1.0
 */
package com.zuoguoqing.tools.algorithm;

/**
 * 堆排序
 * <p>
 * 时间复杂度：任何情况下都是n*log(n)
 * <p>
 * 算法思想：<br>
 * 建立大顶堆（即完全二叉树），每次输出栈顶元素（即树的根节点），<br>
 * 将最后一个元素换入栈顶，再调整堆结构，进行n次即可排好序。
 * 
 * @author Zuo Guoqing
 * @date 2017年12月19日 下午2:50:22
 * @version 1.0
 */
public class HeapSort {

    public static void sort(int[] array) {
        int n = array.length - 1;
        for (int i = n / 2; i >= 1; i--) { // 建立初始堆
            heapAdjust(array, i, n);
        }

        for (int i = n; i > 1; i--) { // 依次输出最大的元素
            array[n] = array[i] + array[n];
            array[i] = array[n] - array[i];
            array[n] = array[n] - array[i];

            heapAdjust(array, 1, i - 1);
        }
    }

    /**
     * 调整堆
     * 
     * @param array
     * @param low
     * @param height
     */
    private static void heapAdjust(int[] array, int low, int height) {
        int tmp = array[low];   // 要调整的元素
        for (int j = low * 2; j <= height; j *= 2) {    // 沿着子树依次向下
            if (j < height && array[j] < array[j+1]) {
                j++;    // j指向左右孩子中较大的一个
            }
            if (array[j] < tmp) {   // 若较大的孩子小于要调整的元素，则整个树已调整好，直接跳出循环
                break;
            }
            array[low] = array[j];  // 交互父节点与大的孩子节点
            low = j;    // 继续调整子树
        }
        array[low] = tmp;   // 最终位置
    }
}
