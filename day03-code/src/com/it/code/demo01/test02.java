package com.it.code.demo01;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area = calculation(sc);
        System.out.println("长方形的面积为:" + area);
    }

    public static double calculation(Scanner sc) {
        System.out.println("请输入长方形的长:");
        int rectangleLong = sc.nextInt();
        System.out.println("请输入长方形的宽:");
        int rectangleWidth = sc.nextInt();
        return rectangleLong * rectangleWidth;
    }
}
