package com.it.code.demo02;

import java.util.Scanner;

//任两边之和大于第三边，任两边之差小于第三边。
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int j1 = sc.nextInt();
        System.out.println("请输入第二个数:");
        int j2 = sc.nextInt();
        System.out.println("请输入第三个数:");
        int j3 = sc.nextInt();
        print(j1, j2, j3);

    }

    public static void print(int j1, int j2, int j3) {
        if (j1 + j2 > j3 && j1 + j3 > j2 && j2 + j3 > j1 && j1 - j2 < j3 && j1 - j3 < j2 && j2 - j3 < j1) {
            System.out.println("能组成三角形!");
        } else {
            System.out.println("不能");
        }
    }
}
