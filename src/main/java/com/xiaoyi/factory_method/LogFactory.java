package com.xiaoyi.factory_method;

/**
 * Created on 2021/2/23.
 *
 * @author 小逸
 * @description
 */
public interface LogFactory {
    public Logger createLogger();
    public Logger createLogger(String args);
    public Logger createLogger(Object object);
}
