package com.springapp.mvc.ServiceProvider;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * Created by yjhan on 15. 1. 26..
 */
public class StaticTest {
    private Log logger = LogFactory.getLog(StaticTest.class);

    static {
        System.out.println("로드되었음!");
    }
}
