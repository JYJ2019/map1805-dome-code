package com.it.code.demo01;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        methodYear(sc);
    }

    public static void methodYear(Scanner sc) {
        System.out.println("请输入一个年份:");
        int year = sc.nextInt();

        //1.能被4整除而不能被100整除.（如2004年就是闰年,1900年不是）
        //2.能被400整除.（如2000年是闰年）
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + "年是闰年.");
        }else{
            System.out.println(year + "年是不是闰年.");
        }
    }
}
