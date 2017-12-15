/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.datastructure
 * @file Visit.java
 * @author Zuo Guoqing
 * @date 2017年12月15日
 * @version 1.0
 */
package com.zuoguoqing.tools.datastructure;

/**
 * 
 * @author Zuo Guoqing
 * @date 2017年12月15日 下午7:15:14
 * @version 1.0
 */
public interface Visitor {
    
    /**
     * 访问者所执行的操作
     * @param args
     * @return
     */
    Object visit(Object ... args);
}
