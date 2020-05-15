package com.it.code.demo02;

import java.util.Scanner;

/*
编写程序，从键盘输入一个整数，判断该数的奇偶性。
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = sc.nextInt();
        judge(number);
    }

    public static void judge(int number) {
        int temp = number;
        if (number >= 0) {
            judgeTwo(number, temp);
        } else {
           number *= -1;
            judgeTwo(number, temp);
        }
    }

    public static void judgeTwo(int number, int temp) {
        if (number % 2 == 0) {
            System.out.println(temp + "是偶数");
        } else {
            System.out.println(temp + "是奇数");
        }
    }

}
