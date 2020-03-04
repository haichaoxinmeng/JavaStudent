package corejava;

import java.util.Arrays;

/**
 * @author chenqiang
 * @create 2020-03-02 16:13
 */
public class Example1 {

    public static void main(String[] args) {

        int[] num1 = {1,2,3};
        int[] num2 = num1;
        System.out.println(num1 == num2);


        int[] num3 = Arrays.copyOf(num1,num1.length);
        System.out.println(num1 == num3);
//        out:
//        for (int i = 0; i < 10; i++){
//            System.out.println(i);
//            for (int j = 0 ; j < 10; j++){
//                System.out.println(j);
//
//                if (i == 3)
//                    break out;
//            }
//        }
//        System.out.println("kkkkkkkk");
//        Scanner scanner = new Scanner(Paths.get(""),);

//        String str1 = "abc";
//
//        String str2 = "abc";
//
//        System.out.println(str1 == str2);
//        System.out.println("abc"== str1);
//
//        System.out.println(str1.substring(0,1) == "a");
//
//
//        Scanner in  = new Scanner(System.in);
//        System.out.println("你的姓名？");
//        String name = in.nextLine();
//
//        System.out.println(name);
//
//        Console cs = System.console();
//        name = cs.readLine("你的姓名是？");
//        char[] pass = cs.readPassword("密码：");
//
//        System.out.println(name);
//        System.out.println(pass);
    }
}
