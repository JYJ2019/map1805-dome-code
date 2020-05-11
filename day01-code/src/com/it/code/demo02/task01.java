package com.it.code.demo02;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        System.out.println("--------------欢 迎 进 入 游 戏 世 界-------------");
        System.out.println("\t\t\t******************");
        System.out.println("\t\t\t** 猜拳,开始 \t**");
        System.out.println("\t\t\t******************");
        System.out.println("出拳规则:1.剪刀 2.石头 3.布");
        System.out.println("请选择对方角色(1:刘备 2:孙权 3:曹操:):");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("选择的结果是:" + num);
    }
}
