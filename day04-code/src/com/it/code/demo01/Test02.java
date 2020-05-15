package com.it.code.demo01;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请现在对方角色(1:刘备 2:孙权 3:曹操)");
        int num = sc.nextInt();
        System.out.print("请输入你的姓名:");
        String rose = sc.next();
        judge(num, rose);
    }

    public static void judge(int num, String rose) {
        String name = null;
        switch (num) {
            case 1:
                name = "刘备";
                break;
            case 2:
                name = "孙权";
                break;
            case 3:
                name = "曹操";
                break;
            default:
                System.out.println("数据非法!");
        }

        if (name != null) {
            System.out.println(rose + "\tVS\t" + name + "对战");
        }


    }
}
