package com.springapp.mvc.ServiceProvider;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by yjhan on 15. 1. 26..
 */
public class MyDriver implements Driver {
    private Log logger = LogFactory.getLog(MyDriver.class);

    private static Driver defaultDriver;
    static {
        defaultDriver = new MyDriver();
        DriverManager.registerDefaultPrivider(defaultDriver);
    }

    @Override
    public Connection getConnection() {
        System.out.println("MyDriver Connection return");
        return null;
    }
}
