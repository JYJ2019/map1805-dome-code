package com.it.code.demo02;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        print(sc);
    }

    public static void print(Scanner sc) {
        System.out.println("输入一个整数");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + "是偶数");
        } else {
            System.out.println(num + "是奇数");
        }
        System.out.println("是否继续?继续请按y或者Y");
        int c = sc.next().charAt(0);
        if (c == 121 || c == 89) {
            print(sc);
        } else {
            System.out.println("结束!");
        }
    }
}
