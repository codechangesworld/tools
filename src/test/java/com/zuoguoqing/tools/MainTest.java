/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools
 * @file MainTest.java
 * @author Zuo Guoqing
 * @date 2017年12月17日
 * @version 1.0
 */
package com.zuoguoqing.tools;

/**
 * 
 * @author Zuo Guoqing
 * @date 2017年12月17日 下午2:38:25
 * @version 1.0
 */
public class MainTest {

    /**
     * @param args
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // StaticLoadTest.class.getClass();
        Class<?> cls = Class.forName("com.zuoguoqing.tools.StaticLoadTest", false,
                ClassLoader.getSystemClassLoader());
        System.out.println(cls.getName());
        
        StaticLoadTest.display();
    }

}
