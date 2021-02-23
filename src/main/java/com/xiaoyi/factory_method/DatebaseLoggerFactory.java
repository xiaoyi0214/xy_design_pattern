package com.xiaoyi.factory_method;

/**
 * Created on 2021/2/23.
 *
 * @author 小逸
 * @description
 */
public class DatebaseLoggerFactory implements LogFactory {
    @Override
    public Logger createLogger() {
        //连接数据库，代码省略
        //创建数据库日志记录器对象
        Logger logger = new DatebaseLogger();
        //初始化数据库日志记录器，代码省略
        return logger;
    }

    @Override
    public Logger createLogger(String args) {
        return null;
    }

    @Override
    public Logger createLogger(Object object) {
        return null;
    }
}
