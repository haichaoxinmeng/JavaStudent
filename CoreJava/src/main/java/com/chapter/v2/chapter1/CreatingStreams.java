//package com.chapter.v2.chapter1;
//
//import org.springframework.util.ResourceUtils;
//
//import java.io.IOException;
//import java.math.BigInteger;
//import java.nio.charset.StandardCharsets;
//import java.nio.file.Files;
//import java.util.List;
//import java.util.regex.Pattern;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
///**
// * 创建流
// * @author chenqiang
// * @create 2020-04-17 7:09
// */
//public class CreatingStreams {
//
//    public static <T> void show(String title,Stream<T> stream){
//
//        final int SIZE = 10;
//        List<T> firstElements = stream
//                .limit(SIZE + 1)
//                .collect(Collectors.toList());
//        System.out.println(title + "：");
//
//        for (int i = 0; i < firstElements.size(); i++) {
//
//            if (i > 0) {
//                System.out.println(",");
//            }
//            if (i < SIZE) {
//                System.out.println(firstElements.get(i));
//            } else {
//                System.out.println("......");
//            }
//        }
//        System.out.println();
//    }
//
//
//    public static void main(String[] args) throws IOException {
//        String contents = new String(Files.readAllBytes(ResourceUtils.getFile("classpath:static/alice.txt").toPath()),
//                StandardCharsets.UTF_8);
//
//        Stream<String> words = Stream.of(contents.split("o"));
//        show("words",words);
//
//        Stream<String> song = Stream.of("gently","down","the","stream");
//        show("song",song);
//        Stream<Integer> sng = Stream.of(1,2,3,4);
//        show("sng",sng);
//
//        Stream<String> silence = Stream.empty();
//        show("silence",silence);
//
//        Stream<String> echos = Stream.generate(() -> "Echo");
//        show("echos",echos);
//
//        Stream<Double> randoms = Stream.generate(Math::random);
//        show("randoms",randoms);
//
//        Stream<BigInteger> integerStream = Stream.iterate(BigInteger.ONE,n -> n.add(BigInteger.ONE));
//        show("integerStrem",integerStream);
//
//        Stream<String> wordsAnotherWay = Pattern.compile("o").splitAsStream(contents);
//        show("wordsAnotherWay",wordsAnotherWay);
//
//
//        int arr[][] = {{1,2,3},{4,5,6,7},{9}};
//        boolean found = false;
//        for(int i=0;i<arr.length && !found;i++)	{
//            for(int j=0;j<arr[i].length;j++){
//                System.out.println("i=" + i + ",j=" + j);
//                if(arr[i][j]  == 5) {
//                    found = true;
//                    break;
//                }
//            }
//        }
//    }
//
//
//
//}
