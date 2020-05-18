package com.it.code.dome01;

import java.util.Scanner;

/*
1.	用户登录系统，如果用户名和密码正确，则输出登陆成功，
如果用户名或密码不正确，则登陆失败，并显示还有2次机会（共3次机会），
如果三次都错误，则退出程序。（10分）
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("用户名:");
            String user = sc.next();
            System.out.print("密码:");
            int pwd = sc.nextInt();

            if ("admin".equals(user) && pwd == 123) {
                System.out.println("登录成功");
                break;
            } else {
                if (i < 2) {
                    System.out.println("登录失败!还剩" + (2 - i) + "次机会.");
                } else {
                    System.out.println("次数用完");
                }
            }
        }


    }
}
