package com.it.code.dome02;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printInterface(sc);
    }

    public static void printInterface(Scanner sc) {
        System.out.println("请输入商品序号");
        int num = sc.nextInt();
        System.out.println("请输入商品名称");
        String name = sc.next();
        System.out.println("请输入商品价格");
        double price = sc.nextDouble();
        printInterface(num, name, price);
    }

    public static void printInterface(int num, String name, double price) {
        System.out.println("序号\t奶茶名称\t价格");
        System.out.println(num + "\t" + name + "\t" + price);
    }


}
