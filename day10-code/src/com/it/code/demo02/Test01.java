package com.it.code.demo02;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        new
        print();
        System.out.println("请输入你想要进行的操作");
        int add = sc.nextInt();
        switch (add) {
            case 1:
                addTea();
                break;
            case 2:
                showTea();
                break;
            case 3:
                findTeaById();
                break;
            default:
                System.out.println("数据异常");
        }

    }

    public static void addTea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品序号");
        int num = sc.nextInt();
        System.out.println("请输入商品名称");
        String name = sc.next();
        System.out.println("请输入商品价格");
        int price = sc.nextInt();


    }

    public static void showTea() {

    }

    public static void  findTeaById() {

    }

    public static void print() {
        System.out.println("===============");
        System.out.println("1.添加商品信息");
        System.out.println("2.显示所有商品信息");
        System.out.println("3.根据序列号查询对应的商品信息");
        System.out.println("===============");
    }
}
