package com.it.code.demo02;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        System.out.println("*************************");
        System.out.println("1.添加商品信息\n2.显示所有商品信息\n3.根据序列号查询对应的商品信息");
        System.out.println("*************************");
        System.out.println("请输入你想要进行的操作:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("你输入的操作是:" + num);

    }
}
