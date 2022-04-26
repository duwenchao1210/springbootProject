package com.example.demo.demo;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class demo01 {
    public static void main(String[] args) {
        //左位移 该数乘以2的n次幂
        System.out.println(2<<2);
        //右位移 改数除以2的n次幂
        System.out.println(6<<1);

        System.out.println(ToStringBuilder.reflectionToString("abc"));

    }
}
