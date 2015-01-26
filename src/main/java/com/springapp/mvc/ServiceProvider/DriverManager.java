package com.springapp.mvc.ServiceProvider;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by yjhan on 15. 1. 26..
 */
public class DriverManager {
    private DriverManager() { }

    private static final Map<String,Driver> drivers = new ConcurrentHashMap<String, Driver>();
    public static final String DEFAULT_DRIVER_NAME = "DEFAULT";

    public static void registerDefaultPrivider(Driver d) {
        System.out.println("Driver 등록");
        registerDriver(DEFAULT_DRIVER_NAME, d);
    }

    public static void registerDriver(String name, Driver d) {
        drivers.put(name, d);
    }

    public static Connection getConnection() {
        return getConnection(DEFAULT_DRIVER_NAME);
    }

    public static Connection getConnection(String name) {
        Driver d = drivers.get(name);
        if(d==null)
            throw new IllegalArgumentException();
        return d.getConnection();
    }

}
