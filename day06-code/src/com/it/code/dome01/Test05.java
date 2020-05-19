package com.it.code.dome01;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num = sc.nextInt();
            if (num == 1) {
                System.out.println("余额查询");
                System.out.println("返回主菜单按U或者u");
                int c = sc.next().charAt(0);
                if (c == 85 || c == 117) {
                    print();
                }
            } else if (num == 6) {
                System.out.println("退卡");
                break;
            }
        }

    }

    public static void print() {
        System.out.println("1.余额查询");
        System.out.println("6.退卡");
        System.out.println("请输入你想进行的操作");
    }
}
