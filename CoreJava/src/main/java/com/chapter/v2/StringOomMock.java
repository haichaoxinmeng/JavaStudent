//package com.chapter.v2;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @author chenqiang
// * @create 2020-04-23 13:53
// */
//public class StringOomMock {
//        static String  base = "string";
//
//        public static void main(String[] args) {
//            List<String> list = new ArrayList<String>();
//            for (int i=0;i< Integer.MAX_VALUE;i++){
//                String str = base + base;
//                base = str;
//                list.add(str.intern());
//            }
//        }
//}
