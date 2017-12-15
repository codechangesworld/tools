/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.exception
 * @file OutOfBoundaryException.java
 * @author Zuo Guoqing
 * @date 2017年12月14日
 * @version 1.0
 */
package com.zuoguoqing.tools.exception;

/**
 * 
 * @author Zuo Guoqing
 * @date 2017年12月14日 下午5:47:47
 * @version 1.0
 */
public class OutOfBoundaryException extends Exception {

    private static final long serialVersionUID = -4870050775062583777L;

    public OutOfBoundaryException() {
        super();
    }

    /**
     * @param message
     */
    public OutOfBoundaryException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public OutOfBoundaryException(Throwable cause) {
        super(cause);
    }

    /**
     * @param message
     * @param cause
     */
    public OutOfBoundaryException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */
    public OutOfBoundaryException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
