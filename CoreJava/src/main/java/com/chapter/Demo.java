package com.chapter;

/**
 * @author chenqiang
 * @create 2020-04-23 10:00
 */
public class Demo {

    public Integer show(){
        int a = 1;
        int b = 2;
        int c = (a + b) * 10;
        return c;
    }

    public static void main(String[] args) {
        System.out.println(new Demo().show());
    }
}
