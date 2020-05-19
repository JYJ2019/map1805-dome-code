package com.it.code.dome02;

import java.util.Scanner;

/*
编写一个程序，输入一个不大于 26 的正整数，
然后使用循环输出下列图形，行数取决于输入的数字。
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int con = -1;
        if (num >= 0 && num <= 26) {
            for (int i = 0; i < num; i++) {
                con++;
                for (int j = 0; j < num; j++) {
                    if (j <= i) {
                        System.out.print((char) (65 + con));
                    }
                }
                System.out.println();
            }

        } else {
            System.out.println("数据异常");
        }
    }
}
