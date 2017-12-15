/**
 * Copyright (C) zuoguoqing All Right Reserved
 *
 * @description 
 * @package com.zuoguoqing.tools.db
 * @file DataSourceManagerDbcp.java
 * @author Zuo Guoqing
 * @date 2017年12月14日
 * @version 1.0
 */
package com.zuoguoqing.tools.database;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 使用Apache dbcp建立数据库连接池
 * @author Zuo Guoqing
 * @date 2017年12月14日 下午4:54:48
 * @version 1.0
 */
public class DataSourceManagerDbcp {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataSourceManagerDbcp.class);
    
    private static DataSource dataSource;
    
    static {
        initDataSource();
    }

    /**
     * 初始化数据库连接池
     */
    private static void initDataSource() {
        InputStream inputStream = DataSourceManagerDbcp.class.getClassLoader().getResourceAsStream("dbcp.properties");
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
            dataSource = BasicDataSourceFactory.createDataSource(properties);
        } catch (IOException e) {
            LOGGER.warn("加载dbcp.properties出现文件异常！");
            e.printStackTrace();
        } catch (Exception e) {
            LOGGER.warn("创建数据库连接池异常！");
            e.printStackTrace();
        }
        
        LOGGER.info("成功初始化数据库连接池！");
    }
    
    /**
     * 获取数据库连接池
     * @return 数据库连接池引用
     */
    public static DataSource getDataSource() {
        return dataSource;
    }
    
    /**
     * 从数据库连接池获取数据库连接
     * @return 一个数据库连接
     * @throws SQLException 获取连接出现异常
     */
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
