package com.it.code.demo01;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("欢迎使用");
            System.out.println("================");
            System.out.print("账号:");
            String username = sc.next();
            System.out.print("密码:");
            String userpwd = sc.next();

            if (login(username, userpwd)) {
                System.out.println("登录成功!");
                choiseOperate();
                break;
            } else {
                if (i < 2)
                    System.out.println("你还有" + (2 - i) + "次机会");
                else
                    System.out.println("次数用尽");
            }
        }
    }

    public static boolean login(String username, String userpwd) {
        if ("admin".equals(username) && "admin".equals(userpwd)) {
            return true;
        } else {
            return false;
        }
    }

    public static void choiseOperate() {
        System.out.println("=======================");
        System.out.println("操作");
        System.out.println("=======================");
    }
}
