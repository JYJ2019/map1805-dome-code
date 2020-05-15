package com.it.code.demo01;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符");
        char chars = sc.next().charAt(0);
        judge(chars);
    }

    public static void judge(char chars) {
        int num = (int) chars;
        if (num >= 48 && num <= 57) {
            System.out.println("该字符为数字");
        } else if (num >= 65 && num <= 90 ) {
            System.out.println("该字符为大写字母");
        } else if (num >= 97 && num <= 122 ) {
            System.out.println("该字符为小写字母");
        } else {
            System.out.println("该字符为其他字符");
        }
    }
}
