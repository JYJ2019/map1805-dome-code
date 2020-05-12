package com.it.code.dome01;

import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("书店管理系统>会员信息管理>新增客户管理");
        System.out.println("请输入会员名:");
        String name = sc.next();
        System.out.println("请输入年龄:");
        int age = sc.nextInt();
        System.out.println("请输入积分:");
        int integral = sc.nextInt();

        System.out.println("书店管理系统>会员信息管理>显示客户管理");
        System.out.println("会员号\t年龄\t积分");
        System.out.println(name + "\t" + age + "\t\t" + integral);

    }
}
