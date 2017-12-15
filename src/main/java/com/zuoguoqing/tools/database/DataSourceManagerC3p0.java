/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.db
 * @file DataSourceManagerC3p0.java
 * @author Zuo Guoqing
 * @date 2017年12月14日
 * @version 1.0
 */
package com.zuoguoqing.tools.database;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 使用C3P0建立数据库连接池
 * @author Zuo Guoqing
 * @date 2017年12月14日 下午4:55:25
 * @version 1.0
 */
public class DataSourceManagerC3p0 {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataSourceManagerC3p0.class);
    
    private static DataSource dataSource;

    static {
        initDataSource();
    }

    /**
     * 初始化数据库连接池
     */
    private static void initDataSource() {

        // 使用c3p0.properties文件初始化c3p0数据库连接池
        dataSource = new ComboPooledDataSource();

        // 使用c3p0-config.xml文件初始化c3p0数据库连接池
        // dataSource = new ComboPooledDataSource("c3p0-user-config");
        
        LOGGER.info("成功初始化数据库连接池！");
    }

    /**
     * 获取数据连接池
     * @return
     */
    public static DataSource getDataSource() {
        return dataSource;
    }

    /**
     * 从连接池获取数据库连接
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
