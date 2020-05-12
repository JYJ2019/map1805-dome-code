package com.it.code.dome01;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printInterface(sc);
    }

    public static void printInterface(Scanner sc) {
        for (int i = 0; i < 3; i++) {
            System.out.println("账号:");
            String account = sc.next();
            System.out.println("密码:");
            int pwd = sc.nextInt();
            if (account.equals("admin") && pwd == 123456) {
                System.out.println("登录成功!");
                printInterface();
                break;
            } else {
                System.out.println("登录失败!");
                if (i >= 0 && i < 2) {
                    System.out.println("还可以登录" + (2 - i) + "次");
                } else if (i == 2) {
                    System.out.println("次数用完,明天再来!");
                }
            }
        }
    }

    public static void printInterface() {
        System.out.println("************************************************");
        System.out.println("**********请输入你想要的操作类型:****************");
        System.out.println("**********1.余额查询\t\t2.取款*************");
        System.out.println("**********3.转账\t\t4.存款*************");
        System.out.println("**********5.修改密码\t\t6.退卡*************");
        System.out.println("************************************************");
    }
}
