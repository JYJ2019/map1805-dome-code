package com.it.code.demo01;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = null;
        do {
            print();
            System.out.println("请输入你想要的菜品序号");
            int num = sc.nextInt();
            System.out.println("是否继续选择?(继续请按Y或者y)");
            String str = sc.next();
            string = str;
        }while (!("N".equals(string)));

    }

    public static void print() {
        System.out.println("**********************");
        System.out.println("1.鱼香肉丝");
        System.out.println("2.红烧狮子头");
        System.out.println("3.红烧肉");
        System.out.println("4.清炒小白菜");
        System.out.println("5.佛跳墙");
        System.out.println("**********************");
    }
}
