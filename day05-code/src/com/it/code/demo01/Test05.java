package com.it.code.demo01;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print(sc);
    }

    public static void print(Scanner sc) {
        for (int i = 0; i < 3; i++) {
            System.out.print("账号:");
            String user = sc.next();
            System.out.print("密码:");
            int pwd = sc.nextInt();

            if ("admin".equals(user) && pwd == 111) {
                System.out.println("登录成功!");
                break;
            } else {
                if (i < 2) {
                    System.out.println("登录失败!你还有" + (2 - i) + "次机会.");
                } else {
                    System.out.println("今日次数用完,请明日重试!");
                }

            }
        }

    }


}
