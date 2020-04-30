package com.luban;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author chenqiang
 * @create 2020-04-24 10:55
 */
public class GCTest {
    public static void main(String[] args) {

        byte[] allocation1,allocation2,allocation3;
        allocation1 = new byte[380000 * 1024];
        allocation1 = new byte[40000 * 1024];
//        allocation1 = new byte[1000 * 1024];

        /**
         * 新生的对象，如果大于新生代内存，会直接放入老年代
         * 如果新生代eden区发生轻GC时，存活的对象大于
         */

        List<Object> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (true){
            list.add(new User(i++, UUID.randomUUID().toString()));
            new User(j--,UUID.randomUUID().toString());
        }




    }
}
