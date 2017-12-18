/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools
 * @file StaticLoadTest.java
 * @author Zuo Guoqing
 * @date 2017年12月17日
 * @version 1.0
 */
package com.zuoguoqing.tools;

/**
 * 
 * @author Zuo Guoqing
 * @date 2017年12月17日 下午2:38:54
 * @version 1.0
 */
public class StaticLoadTest {
    private static StaticLoadTest object;
    
    static {
        System.out.println("static code block");
        init();
    }

    private static void init() {
        object = new StaticLoadTest();
        System.out.println("init() method");
    }
    
    public StaticLoadTest() {
        System.out.println("public constructor");
    }
    
    public static void display() {
        System.out.println("static method\t" + object.toString());
    }
}

class StaticLoadTest2 {
    private static StaticLoadTest2 object = new StaticLoadTest2();
    
    private StaticLoadTest2() {
        System.out.println("private constructor");
    }
    
    public static StaticLoadTest2 getInstance() {
        return object;
    }
}
