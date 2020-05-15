package com.it.code.demo01;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("账号:");
        String user = sc.next();
        System.out.print("密码:");
        String pwd = sc.next();
        judge(user, pwd);
    }

    public static void judge(String user, String pwd) {
        if ("0123".equals(user) && "1234".equals(pwd)) {
            System.out.println("登录成功!");
        } else {
            System.out.println("登录失败!");
        }
    }
}
