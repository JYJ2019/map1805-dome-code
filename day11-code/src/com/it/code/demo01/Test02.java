package com.it.code.demo01;

import java.util.Scanner;
import java.util.jar.JarEntry;

/*
编写带数组参数的updatePsd(String user[][],String username,String psd)方法实现用户密码修改
输入要修改的用户以及修改后的密码
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] array = {
                {"百里半", "111"},
                {"admin", "admin"},
                {"002", "123"},
        };

        print(array);

        System.out.println("请输入你要修改的用户:");
        String userName = sc.next();
        System.out.println("请输入修改后的密码:");
        String pwd = sc.next();
        updatePwd(array, userName, pwd);
    }

    public static void updatePwd(String[][] array, String userName, String pwd) {
        for (int i = 0; i < array.length; i++) {
            if (userName.equals(array[i][0])) {
                array[i][1] = pwd;
                print(array);
                break;
            } else {
                System.out.println("数据异常!");
            }
        }


    }

    public static void print(String[][] array) {
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
