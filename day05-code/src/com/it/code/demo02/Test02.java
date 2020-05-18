package com.it.code.demo02;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print(sc);
    }

    public static void print(Scanner sc) {
        int a = 0;
        int b = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println("请输入第" + i + "个字符");
            int chars = sc.next().charAt(0);
//            int num = chars;
            if (chars >= 65 && chars <= 90) {
                a++;
            } else if (chars >= 97 && chars <= 122) {
                b++;
            }
        }

        System.out.println("大写字母次数" + a);
        System.out.println("小写字母次数" + b);

    }
}
