package com.it.code.dome01;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你的姓名:");
        String name = sc.next();
        System.out.println("请输入你的年龄:");
        int age = sc.nextInt();
        System.out.println("请输入你的性别:");
        char sex = sc.next().charAt(0);
        System.out.println("请输入你的身高:");
        double height = sc.nextDouble();
        System.out.println("请输入你的体重:");
        double weight = sc.nextDouble();
        System.out.println("请输入你所在的地址:");
        String address = sc.next();

        System.out.println(name + "个人信息" + "\n\t姓名:" + name + "\n\t年龄:" + age + "\n\t性别:" + sex + "\n\t身高:" + height + "CM" + "\n\t体重:" + weight + "KG" + "\n\t地址:" + address);
    }
}
