package com.it.code.demo01;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = null;
        do {
            print();
            System.out.println("请输入你想进行的操作");
            int num = sc.nextInt();
            if (num == 1) {
                System.out.println("余额查询");
            }
            System.out.println("返回主菜单按U或者u");
            String str = sc.next();
            string = str;
        } while ("u".equals(string) || "U".equals(string));


    }

    public static void print() {
        System.out.println("1.余额查询");
    }
}
