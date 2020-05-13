package com.it.code.demo02;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("基本工资");
        int i = sc.nextInt();
        System.out.println("销售额");
        int i2 = sc.nextInt();
        System.out.println("提成利率");
        double i3 = sc.nextDouble();
        print(i, i2, i3);

    }

    public static void print(int i, int i2, double i3) {
        final int a = 100;
        System.out.println("工资" + (i + (i2 * i3 / a)));
    }
}
