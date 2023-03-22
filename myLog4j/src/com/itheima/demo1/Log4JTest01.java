package com.itheima.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4JTest01 {
    // 使用log4j的api来获取日志对象
    // 弊端：如果以后更改日志的实现类，那么下面的代码需要跟着改 不推荐
    // private static final Logger LOGGER = Logger.getLogger(Log4JTest01.class);

    // 使用slf4j里面的api来获取日志对象
    // 如果以后更改日志的实现类 不需要修改代码 推荐
    private static final Logger LOGGER = LoggerFactory.getLogger(Log4JTest01.class);

    public static void main(String[] args) {
        LOGGER.debug("Debug级别的日志");
        LOGGER.warn("warn级别的日志");
        LOGGER.info("info级别的日志");
        LOGGER.error("error级别的日志");
    }
}
