package com.luban;

public class ClassLoaderDemo {

    public static void main(String[] args) {
        System.out.println(System.getProperties());
//        System.out.println(String.class.getClassLoader());
//        System.out.println(DESKeyFactory.class.getClassLoader().getClass().getName());
//        System.out.println(ClassLoaderDemo.class.getClassLoader().getClass().getName());
//        System.out.println(ClassLoader.getSystemClassLoader().getClass().getName());
    }

    /**
     * 执行引擎怎么执行class
     *     第一种：JIT 即时编译 出class文件
     *      第二种：字节码解释器
     */

    /**
     * 类卸载的条件
     *      系统退出
     *      没有引用
     *
     */
}
