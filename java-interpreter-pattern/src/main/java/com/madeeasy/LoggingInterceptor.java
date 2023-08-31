package com.madeeasy;

public class LoggingInterceptor implements Interceptor{
    @Override
    public void before() {
        System.out.println("Before method execution: Logging...");
    }

    @Override
    public void after() {
        System.out.println("After method execution: Logging...");
    }
}
