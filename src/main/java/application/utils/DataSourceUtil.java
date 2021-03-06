package application.utils;


import application.mybatis.cfg.MybatisConfiguration;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 用于创建数据源的工具类
 */
public class DataSourceUtil {

    /**
     * 用于获取一个连接
     */
    public static Connection getConnection(MybatisConfiguration cfg) {
        try {
            Class.forName(cfg.getDriver());
            return DriverManager.getConnection(cfg.getUrl(), cfg.getUsername(), cfg.getPassword());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
