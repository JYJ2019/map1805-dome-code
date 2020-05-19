package com.it.code.dome02;

import java.util.Scanner;

/*
编写一个程序，输出 N 行 '*'，第 N 行 N 个。（N 使用键盘输入）
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n");
        int num = sc.nextInt();
        int temp = num;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < temp; j++) {
                if ( j <= i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
