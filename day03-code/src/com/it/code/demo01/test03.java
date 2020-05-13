package com.it.code.demo01;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入顾客交的费用:");
        int i = sc.nextInt();
        double sum = sum();
        double c = i - sum;
        if (c >= 0) {
            System.out.println(c);
        } else {
            System.out.println("钱不够");
        }

        int b = (int) (sum / 100) * 3;
        System.out.println(b);


    }

    public static double calculation(double price, int quantity) {
        double sum = price * quantity;//金额
        return sum;
    }

    public static double sum() {
        double calculation = calculation(25.0, 20);
        double calculation1 = calculation(3.0, 10);
        double calculation2 = calculation(10.0, 5);
        double max;
        return max = calculation + calculation1 + calculation2;
    }

}
