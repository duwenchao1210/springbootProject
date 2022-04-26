package com.example.demo.demo;

import java.util.Date;

public class Clock implements TimeShow{
    @Override
    public void showTime() {
        System.out.println("报时了----"+new Date());
    }

    @Override
    public void hello() {
        System.out.println("我也报时");
    }
}
