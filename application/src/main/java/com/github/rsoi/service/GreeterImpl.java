package com.github.rsoi.service;

import org.springframework.stereotype.Service;

@Service
public class GreeterImpl implements Greeter {
    @Override
    public void sayHello() {
        System.out.println("Hello world from Spring Service Bean!");
    }
}
