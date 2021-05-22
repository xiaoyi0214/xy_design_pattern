package com.xiaoyi.factory_method;

/**
 * Created on 2021/2/23.
 *
 * @author 小逸
 * @description 具体产品
 */
public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("文件日志记录。");
    }
}
