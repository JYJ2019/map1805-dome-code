package com.it.code.demo01;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.显示所有客户信息");
        System.out.println("2.添加客户信息");
        System.out.println("************************");
        System.out.println("请选择:");
        int num = sc.nextInt();
        judge(num);
    }

    public static void judge(int num) {
        String name = null;
        switch (num) {
            case 1:
                name = "显示所有客户信息";
                break;
            case 2:
                name = "添加客户信息";
                break;
            default:
                System.out.println("数据非法!");
        }
        if (name != null) {
            System.out.println(name);
        }
    }
}
