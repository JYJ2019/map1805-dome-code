package com.it.code.dome02;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        find(sc);
    }

    public static void find(Scanner sc) {
        System.out.println("请输入一个汉字:");
        char character = sc.next().charAt(0);
        System.out.println("汉字\"" + character + "\"在Unicode表的顺序位置:" + (int)character);
    }
}
