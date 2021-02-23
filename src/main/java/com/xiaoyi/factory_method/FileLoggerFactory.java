package com.xiaoyi.factory_method;

/**
 * Created on 2021/2/23.
 *
 * @author 小逸
 * @description
 */
public class FileLoggerFactory implements LogFactory {
    @Override
    public Logger createLogger() {
        //创建文件日志记录器对象
        Logger logger = new FileLogger();
        //创建文件，代码省略
        return logger;
    }

    @Override
    public Logger createLogger(String args) {
        //使用参数args作为连接字符串来连接数据库，代码省略
        Logger logger = new FileLogger();
        //初始化数据库日志记录器，代码省略
        return logger;
    }

    @Override
    public Logger createLogger(Object object) {
        //使用封装在参数obj中的连接字符串来连接数据库，代码省略
        Logger logger = new FileLogger();
        //使用封装在参数obj中的数据来初始化数据库日志记录器，代码省略
        return logger;
    }
}
