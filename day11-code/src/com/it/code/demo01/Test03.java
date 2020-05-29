package com.it.code.demo01;

import java.util.Scanner;

/*
编写zhuanZhang(String user1,String user2,int money)方法实现ATM转账
不写,麻烦
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("用户\t密码\t余额");
        String[][] array = {
                {"百里半", "111"},
                {"admin", "admin"},
                {"002", "123"},
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == array[i].length - 1)
                    System.out.println(array[i][j]);
                else
                    System.out.print(array[i][j] + "\t");
            }
        }
    }
}
