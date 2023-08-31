package com.madeeasy;

import java.util.ArrayList;
import java.util.List;

public class InterceptorChain {
    private List<Interceptor> interceptors = new ArrayList<>();
    private Object target;

    public InterceptorChain(Object target) {
        this.target = target;
    }

    public void addInterceptor(Interceptor interceptor) {
        interceptors.add(interceptor);
    }

    public void execute() {
        interceptors.forEach(Interceptor::before);
        // Execute target method
        if (target instanceof OrderService) {
            ((OrderService) target).placeOrder();
        }
        interceptors.forEach(Interceptor::after);
    }
}
