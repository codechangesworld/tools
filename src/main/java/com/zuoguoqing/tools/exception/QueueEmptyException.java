/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.exception
 * @file QueueEmptyException.java
 * @author Zuo Guoqing
 * @date 2017年12月14日
 * @version 1.0
 */
package com.zuoguoqing.tools.exception;

/**
 * 
 * @author Zuo Guoqing
 * @date 2017年12月14日 下午9:05:12
 * @version 1.0
 */
public class QueueEmptyException extends Exception {

    private static final long serialVersionUID = 6304872989301006395L;

    public QueueEmptyException() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param message
     */
    public QueueEmptyException(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param cause
     */
    public QueueEmptyException(Throwable cause) {
        super(cause);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param message
     * @param cause
     */
    public QueueEmptyException(String message, Throwable cause) {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */
    public QueueEmptyException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        // TODO Auto-generated constructor stub
    }

}
