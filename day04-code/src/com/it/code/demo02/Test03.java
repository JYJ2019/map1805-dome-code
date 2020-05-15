package com.it.code.demo02;

import java.util.Scanner;

/*
所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
请输入一个三位数，判断该数是否是水仙花数
改进(3到7位)
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 153 370 371 407 1634....
        System.out.println("你想输入一个几位数(3~7)");
        int num = sc.nextInt();
        System.out.println("请输入这个数(一定要与位数匹配)");
        int number = sc.nextInt();
        judge(num, number);
    }

    public static void judge(int num, int number) {
        int temp = number;
        int sum = 0;
        do {
            int d = temp % 10;
            temp /= 10;
            int p = d;
            int j = 1;
            while (j < num) {
                p *= d;
                j++;
            }
            sum += p;
        } while (temp > 0);
        if (sum == number){
            System.out.println("水仙花数是:" + number);
        }else {
            System.out.println("请重新输入!");
        }
    }
}

