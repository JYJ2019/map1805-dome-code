package com.it.code.demo01;

import java.util.Scanner;

/*
求1+2+3…..+n的和，数字n由用户输入
编写带参的有返回值的getSum(int n) 实现
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n的值:");
        int n = sc.nextInt();
        System.out.println("结果为" + getSum(n));
    }

    public static int getSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
