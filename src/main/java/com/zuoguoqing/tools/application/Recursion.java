/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.application
 * @file Recursion.java
 * @author Zuo Guoqing
 * @date 2017年12月14日
 * @version 1.0
 */
package com.zuoguoqing.tools.application;

/**
 * 
 * @author Zuo Guoqing
 * @date 2017年12月14日 下午10:59:02
 * @version 1.0
 */
public class Recursion {

    /**
     * 问题：输出所有n个布尔量的所有可能组合
     * 思路：使用递归
     * @param b
     * @param n
     */
    public static void coding(byte[] b, int n) {
        if (n == 0) {
            b[n] = 0;
            outBn(b);
            b[n] = 1;
            outBn(b);
        } else {
            b[n] = 0;
            coding(b, n - 1);
            b[n] = 1;
            coding(b, n - 1);
        }
    }

    private static void outBn(byte[] b) {
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
        System.out.println();
    }
}
