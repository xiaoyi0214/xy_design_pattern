package com.xiaoyi.factory_method;

/**
 * Created on 2021/2/23.
 *
 * @author 小逸
 * @description
 * 引入XMLUtil类和XML配置文件后，如果要增加新的日志记录方式，只需要执行如下几个步骤：
 *
 * (1) 新的日志记录器需要继承抽象日志记录器Logger；
 *
 * (2) 对应增加一个新的具体日志记录器工厂，继承抽象日志记录器工厂LoggerFactory，并实现其中的工厂方法createLogger()，设置好初始化参数和环境变量，返回具体日志记录器对象；
 *
 * (3) 修改配置文件config.xml，将新增的具体日志记录器工厂类的类名字符串替换原有工厂类类名字符串；
 *
 * (4) 编译新增的具体日志记录器类和具体日志记录器工厂类，运行客户端测试类即可使用新的日志记录方式，而原有类库代码无须做任何修改，完全符合“开闭原则”。
 */
public class LoggerClient {
    public static void main(String[] args) {
        LogFactory factory;
        Logger logger;
        factory = (LogFactory)XmlUtil.getBean(); //getBean()的返回类型为Object，需要进行强制类型转换
        logger = factory.createLogger();
        logger.writeLog();
    }
}
