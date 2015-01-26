package com.springapp.mvc;

import com.springapp.mvc.ServiceProvider.Connection;
import com.springapp.mvc.ServiceProvider.DriverManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yjhan on 15. 1. 26..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/applicationContext.xml")
public class StaticFieldTest {

    private StringBuilder sb = new StringBuilder("com.springapp.mvc.ServiceProvider.");

    @Test
    public void testStatic() throws ClassNotFoundException {

        sb.append("StaticTest");

        Class.forName(sb.toString());
        Class.forName(sb.toString());
        Class.forName(sb.toString());
        Class.forName(sb.toString());
    }


    @Test
    public void testDriverManager() throws ClassNotFoundException {
        sb.append("MyDriver");
        Class.forName(sb.toString());
        Connection connection = DriverManager.getConnection();
    }
}
