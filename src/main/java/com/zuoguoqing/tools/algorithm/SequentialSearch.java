/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.algorithm
 * @file SequentialSearch.java
 * @author Zuo Guoqing
 * @date 2017年12月16日
 * @version 1.0
 */
package com.zuoguoqing.tools.algorithm;

/**
 * 顺序查找算法<p>
 * 
 * 注：<p>
 * 
 * 时间复杂度：O(n)<p>
 * 平均查找长度ASL = (n+1)/2
 * 
 * @author Zuo Guoqing
 * @date 2017年12月16日 下午8:15:01
 * @version 1.0
 */
public class SequentialSearch {

    /**
     * 顺序查找
     * 
     * @param key
     *            要查找的数据元素
     * @param array
     *            目标查找数组，数据从0开始
     * @return 查找成功则返回元素的数组下标，否则返回-1
     */
    public static int seqSearch(char key, char[] array) {
        if (array[0] == key) {
            return 0;
        }
        char tmp = array[0];
        array[0] = key; // 0号元素设为哨兵
        
        int i = array.length - 1;
        for (; array[i] != key; --i) {
        }
        array[0] = tmp; // 改回原值
        
        return i != 0 ? i : -1;
    }

    /**
     * 顺序查找
     * 
     * @param key
     *            要查找的数据元素
     * @param array
     *            目标查找数组，数据从0开始
     * @return 查找成功则返回元素的数组下标，否则返回-1
     */
    public static int seqSearch(byte key, byte[] array) {
        if (array[0] == key) {
            return 0;
        }
        byte tmp = array[0];
        array[0] = key; // 0号元素设为哨兵
        
        int i = array.length - 1;
        for (; array[i] != key; --i) {
        }
        array[0] = tmp; // 改回原值
        
        return i != 0 ? i : -1;
    }

    /**
     * 顺序查找
     * 
     * @param key
     *            要查找的数据元素
     * @param array
     *            目标查找数组，数据从0开始
     * @return 查找成功则返回元素的数组下标，否则返回-1
     */
    public static int seqSearch(short key, short[] array) {
        if (array[0] == key) {
            return 0;
        }
        short tmp = array[0];
        array[0] = key; // 0号元素设为哨兵
        
        int i = array.length - 1;
        for (; array[i] != key; --i) {
        }
        array[0] = tmp; // 改回原值
        
        return i != 0 ? i : -1;
    }

    /**
     * 顺序查找
     * 
     * @param key
     *            要查找的数据元素
     * @param array
     *            目标查找数组，数据从0开始
     * @return 查找成功则返回元素的数组下标，否则返回-1
     */
    public static int seqSearch(int key, int[] array) {
        if (array[0] == key) {
            return 0;
        }
        int tmp = array[0];
        array[0] = key; // 0号元素设为哨兵
        
        int i = array.length - 1;
        for (; array[i] != key; --i) {
        }
        array[0] = tmp; // 改回原值
        
        return i != 0 ? i : -1;
    }

    /**
     * 顺序查找
     * 
     * @param key
     *            要查找的数据元素
     * @param array
     *            目标查找数组，数据从0开始
     * @return 查找成功则返回元素的数组下标，否则返回-1
     */
    public static int seqSearch(long key, long[] array) {
        if (array[0] == key) {
            return 0;
        }
        long tmp = array[0];
        array[0] = key; // 0号元素设为哨兵
        
        int i = array.length - 1;
        for (; array[i] != key; --i) {
        }
        array[0] = tmp; // 改回原值
        
        return i != 0 ? i : -1;
    }

    /**
     * 顺序查找
     * 
     * @param key
     *            要查找的数据元素
     * @param array
     *            目标查找数组，数据从0开始
     * @return 查找成功则返回元素的数组下标，否则返回-1
     */
    public static int seqSearch(float key, float[] array) {
        if (array[0] == key) {
            return 0;
        }
        float tmp = array[0];
        array[0] = key; // 0号元素设为哨兵
        
        int i = array.length - 1;
        for (; array[i] != key; --i) {
        }
        array[0] = tmp; // 改回原值
        
        return i != 0 ? i : -1;
    }

    /**
     * 顺序查找
     * 
     * @param key
     *            要查找的数据元素
     * @param array
     *            目标查找数组，数据从0开始
     * @return 查找成功则返回元素的数组下标，否则返回-1
     */
    public static int seqSearch(double key, double[] array) {
        if (array[0] == key) {
            return 0;
        }
        double tmp = array[0];
        array[0] = key; // 0号元素设为哨兵
        
        int i = array.length - 1;
        for (; array[i] != key; --i) {
        }
        array[0] = tmp; // 改回原值
        
        return i != 0 ? i : -1;
    }

    /**
     * 顺序查找
     * 
     * @param key
     *            要查找的数据元素
     * @param array
     *            目标查找数组，数据从0开始
     * @return 查找成功则返回元素的数组下标，否则返回-1
     */
    public static <T> int seqSearch(T key, T[] array) {
        if (array[0].equals(key)) {
            return 0;
        }
        T tmp = array[0];
        array[0] = key; // 0号元素设为哨兵
        
        int i = array.length - 1;
        for (; !array[i].equals(key); --i) {
        }
        array[0] = tmp; // 改回原值
        
        return i != 0 ? i : -1;
    }

}
