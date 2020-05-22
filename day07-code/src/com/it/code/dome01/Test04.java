package com.it.code.dome01;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] arrayStr = {
                {"admin", "admin"},
                {"百里半", "111"},
                {"002", "123"},
        };
        cycle(sc,arrayStr);

    }

    public static void cycle(Scanner sc, String[][] arrayStr) {
        System.out.println("欢迎使用");
        System.out.print("账号:");
        String user = sc.next();
        System.out.print("密码:");
        String pwd = sc.next();

        int temp = 0;
        for (int i = 0; i < arrayStr.length; i++) {

            if (arrayStr[i][0].equals(user) && arrayStr[i][1].equals(pwd)) {
                System.out.println("登录成功!");
                break;
            } else {
                temp++;
            }


        }
        if (temp == 3) {
            System.out.println("登录失败!");
            cycle(sc,arrayStr);
        }


    }

}
