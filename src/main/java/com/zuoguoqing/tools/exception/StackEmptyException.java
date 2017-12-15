/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.exception
 * @file StackEmptyException.java
 * @author Zuo Guoqing
 * @date 2017年12月14日
 * @version 1.0
 */
package com.zuoguoqing.tools.exception;

/**
 * 
 * @author Zuo Guoqing
 * @date 2017年12月14日 下午9:04:16
 * @version 1.0
 */
public class StackEmptyException extends Exception {

    private static final long serialVersionUID = 3151901595664282760L;

    public StackEmptyException() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param message
     */
    public StackEmptyException(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param cause
     */
    public StackEmptyException(Throwable cause) {
        super(cause);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param message
     * @param cause
     */
    public StackEmptyException(String message, Throwable cause) {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */
    public StackEmptyException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        // TODO Auto-generated constructor stub
    }

}
