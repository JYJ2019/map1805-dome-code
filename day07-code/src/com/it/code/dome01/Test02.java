package com.it.code.dome01;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("书店管理系统>会员信息管理>新增客户信息");
        System.out.println("请输入会员名:");
        int vip = sc.nextInt();
        System.out.println("请输入年龄:");
        int age = sc.nextInt();
        System.out.println("请输入积分:");
        int integral = sc.nextInt();

        int[][] array = {
                {1100, 18, 100},
                {1101, 24, 834},
                {1102, 13, 20000},
                {1103, 20, 2938},
                {1104, 22, 500},
                {1105, 22, 3569},
                {1106, 45, 45},
                {1107, 6, 450},
                {0, 0, 0},
        };
        array[8][0] = vip;
        array[8][1] = age;
        array[8][2] = integral;

        System.out.println("书店管理系统>会员信息管理>新增客户信息");
        System.out.println("会员号\t年龄\t积分");

        cycle(array);
    }

    public static void cycle(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == array[i].length - 1) {
                    System.out.println("\t" + array[i][j]);
                } else {
                    System.out.print(array[i][j] + "\t");
                }
            }
        }
    }
}
