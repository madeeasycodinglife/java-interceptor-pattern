package com.madeeasy;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        Interceptor loggingInterceptor = new LoggingInterceptor();

        InterceptorChain chain = new InterceptorChain(orderService);
        chain.addInterceptor(loggingInterceptor);

        chain.execute();
    }
}