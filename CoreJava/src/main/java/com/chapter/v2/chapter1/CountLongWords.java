//package com.chapter.v2.chapter1;
//
//import org.springframework.util.ResourceUtils;
//
//import java.io.IOException;
//import java.nio.charset.StandardCharsets;
//import java.nio.file.Files;
//import java.util.Arrays;
//import java.util.List;
//
///**
// * @author chenqiang
// * @create 2020-04-17 6:44
// */
//public class CountLongWords {
//    public static void main(String[] args) throws IOException {
//
//        //String contents = new String(Files.readAllBytes(Paths.get("../static/alice.txt")), StandardCharsets.UTF_8);
//        String contents = new String(Files.readAllBytes(ResourceUtils.getFile("classpath:static/alice.txt").toPath()),
//                StandardCharsets.UTF_8);
//        String userName = "";//new String(request.getParamter("userName").getBytes("ISO8859-1"),"utf-8");
//        List<String> words = Arrays.asList(contents.split("o"));
//
//        long count = 0;
//
//        // 循环方式
//        for (String word : words) {
//            if (word.length() > 12) {
//                count++;
//            }
//        }
//        System.out.println("count=" + count);
//
//        // 流的方式
//        count = words.stream()
//                .filter(s -> s.length() > 12)
//                .count();
//        System.out.println("count=" + count);
//
//        // 并行流
//        count = words.parallelStream()
//                .filter(s -> s.length() > 12)
//                .count();
//        System.out.println("count=" + count);
//    }
//}
