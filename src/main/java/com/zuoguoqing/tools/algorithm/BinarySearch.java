/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.algorithm
 * @file BinarySearch.java
 * @author Zuo Guoqing
 * @date 2017年12月16日
 * @version 1.0
 */
package com.zuoguoqing.tools.algorithm;

/**
 * 折半查找（二分查找）
 * <p>
 * 
 * 注：
 * <p>
 * 
 * 时间复杂度：O(log(n))
 * <p>
 * 平均查找长度 ASL = log(n+1) - 1
 * 
 * @author Zuo Guoqing
 * @date 2017年12月16日 下午9:44:08
 * @version 1.0
 */
public class BinarySearch {

    /**
     * 二分查找
     * 
     * @param key
     *            待查找数据
     * @param array
     *            数组升序排列
     * @param low
     *            查找范围下限
     * @param height
     *            查找范围上限
     * @return 返回数据索引，失败返回-1
     */
    public static int binarySearch(char key, char[] array, int low, int height) {
        while (low <= height) {
            int middle = (low + height) / 2;
            if (key == array[middle]) {
                return middle;
            } else if (key < array[middle]) {
                height = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }

    /**
     * 二分查找
     * 
     * @param key
     *            待查找数据
     * @param array
     *            数组升序排列
     * @param low
     *            查找范围下限
     * @param height
     *            查找范围上限
     * @return 返回数据索引，失败返回-1
     */
    public static int binarySearch(byte key, byte[] array, int low, int height) {
        while (low <= height) {
            int middle = (low + height) / 2;
            if (key == array[middle]) {
                return middle;
            } else if (key < array[middle]) {
                height = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }

    /**
     * 二分查找
     * 
     * @param key
     *            待查找数据
     * @param array
     *            数组升序排列
     * @param low
     *            查找范围下限
     * @param height
     *            查找范围上限
     * @return 返回数据索引，失败返回-1
     */
    public static int binarySearch(short key, short[] array, int low, int height) {
        while (low <= height) {
            int middle = (low + height) / 2;
            if (key == array[middle]) {
                return middle;
            } else if (key < array[middle]) {
                height = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }

    /**
     * 二分查找
     * 
     * @param key
     *            待查找数据
     * @param array
     *            数组升序排列
     * @param low
     *            查找范围下限
     * @param height
     *            查找范围上限
     * @return 返回数据索引，失败返回-1
     */
    public static int binarySearch(int key, int[] array, int low, int height) {
        while (low <= height) {
            int middle = (low + height) / 2;
            if (key == array[middle]) {
                return middle;
            } else if (key < array[middle]) {
                height = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }

    /**
     * 二分查找
     * 
     * @param key
     *            待查找数据
     * @param array
     *            数组升序排列
     * @param low
     *            查找范围下限
     * @param height
     *            查找范围上限
     * @return 返回数据索引，失败返回-1
     */
    public static int binarySearch(float key, float[] array, int low, int height) {
        while (low <= height) {
            int middle = (low + height) / 2;
            if (key == array[middle]) {
                return middle;
            } else if (key < array[middle]) {
                height = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }

    /**
     * 二分查找
     * 
     * @param key
     *            待查找数据
     * @param array
     *            数组升序排列
     * @param low
     *            查找范围下限
     * @param height
     *            查找范围上限
     * @return 返回数据索引，失败返回-1
     */
    public static int binarySearch(double key, double[] array, int low, int height) {
        while (low <= height) {
            int middle = (low + height) / 2;
            if (key == array[middle]) {
                return middle;
            } else if (key < array[middle]) {
                height = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }

    /**
     * 二分查找
     * 
     * @param key
     *            待查找数据
     * @param array
     *            数组升序排列
     * @param low
     *            查找范围下限
     * @param height
     *            查找范围上限
     * @return 返回数据索引，失败返回-1
     */
    public static <T extends Comparable<T>> int binarySearch(T key, T[] array, int low,
            int height) {
        while (low <= height) {
            int middle = (low + height) / 2;

            switch (key.compareTo(array[middle])) {
            case 0:
                return middle;
            case -1:
                height = middle - 1;
                break;
            case 1:
                low = middle + 1;
            }
        }
        return -1;
    }
}
