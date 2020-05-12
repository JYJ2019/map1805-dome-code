package com.it.code.dome02;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printInterface(sc);
    }

    public static void printInterface() {
        System.out.println("--------------欢 迎 进 入 游 戏 世 界-------------");
        System.out.println("\t\t\t******************");
        System.out.println("\t\t\t** 猜拳,开始 \t**");
        System.out.println("\t\t\t******************");
        System.out.println("出拳规则:1.剪刀 2.石头 3.布");
    }

    public static void printInterface(Scanner sc) {
        printInterface();
        System.out.println("请选择对方角色名(刘备 ,孙权 ,曹操):");
        String name = sc.next();
        System.out.println("请输入你的姓名:");
        String name2 = sc.next();
        System.out.println(name2 + " VS " + name + "对战");
    }
}
