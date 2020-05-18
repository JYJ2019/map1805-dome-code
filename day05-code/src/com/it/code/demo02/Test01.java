package com.it.code.demo02;

import java.util.Scanner;
//亦即n!=1×2×3×...×(n-1)×n。阶乘亦可以递归方式定义：0!=1，n!=(n-1)!×n。
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数:");
        int num = sc.nextInt();
        int calculation = calculation(num);
        System.out.println(num +  "的阶乘为" + calculation);
    }

    public static int calculation(int num) {
        if (num <= 1)
            return 1;
        else
            return num * calculation(num - 1);
    }
}
