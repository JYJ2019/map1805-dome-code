package com.it.code.dome01;

import java.util.Random;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int num = random.nextInt(100) + 1; // 1 ~ 100


        while (true) {
            System.out.println("请输入你猜的数:");
            int nextInt = sc.nextInt();
            if (num < nextInt) {
                System.out.println("猜大了");
            } else if (num > nextInt) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜对了");
                break;
            }
        }
    }
}
