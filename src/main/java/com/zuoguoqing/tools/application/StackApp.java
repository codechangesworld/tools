/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.application
 * @file StackApp.java
 * @author Zuo Guoqing
 * @date 2017年12月14日
 * @version 1.0
 */
package com.zuoguoqing.tools.application;

import com.zuoguoqing.tools.datastructure.Stack;
import com.zuoguoqing.tools.datastructure.impl.ArrayStack;
import com.zuoguoqing.tools.exception.StackEmptyException;

/**
 * 
 * @author Zuo Guoqing
 * @date 2017年12月14日 下午9:51:49
 * @version 1.0
 */
public class StackApp {

    /**
     * 进制转换
     * @param num
     * @param radix
     * @return
     */
    public static String baseConvertion(int num, int radix) {
        if (radix <= 0 || radix > 16) {
            return null;
        }
        
        Stack<Integer> stack = new ArrayStack<>();
        while (num != 0) {
            stack.push(num % radix);
            num /= radix;
        }

        String result = new String();
        int tmp = 0;
        try {
            while (!stack.isEmpty()) {
                tmp = stack.pop();
                if (tmp < 10) {
                    result += tmp;
                } else {
                    switch (tmp) {
                    case 10:
                        result += 'A';
                        break;
                    case 11:
                        result += 'B';
                        break;
                    case 12:
                        result += 'C';
                        break;
                    case 13:
                        result += 'D';
                        break;
                    case 14:
                        result += 'E';
                        break;
                    case 15:
                        result += 'F';
                        break;
                    }
                } // end else
            }
        } catch (StackEmptyException e) {
            e.printStackTrace();
        }

        return result;
    }
    
    /**
     * 括号匹配
     * @param string
     */
    public static boolean bracketMatch(String string) {
        Stack<Character> stack = new ArrayStack<>();
        char tmp = ' ';
        try {
            for (int i = 0; i < string.length(); i++) {
                tmp = string.charAt(i);
                switch (tmp) {
                case '(':
                case '[':
                case '{':
                    stack.push(tmp);
                    break;
                case ')':
                    if (!stack.isEmpty() && stack.pop().equals('(')) {
                        break;
                    } else {
                        return false;
                    }
                case ']':
                    if (!stack.isEmpty() && stack.pop().equals('[')) {
                        break;
                    } else {
                        return false;
                    }
                case '}':
                    if (!stack.isEmpty() && stack.pop().equals('{')) {
                        break;
                    } else {
                        return false;
                    }
                }
            }
        } catch (StackEmptyException e) {
            e.printStackTrace();
        }
        
        if (stack.isEmpty()) {
            return true;
        }
        
        return false;
    }
}
