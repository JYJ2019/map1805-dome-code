package com.it.code.dome01;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        String[] arrayName = new String[10];
        double[] arrayScore = new double[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arrayName.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位学生姓名");
            arrayName[i] = sc.next();
            System.out.println("请输入第" + (i + 1) + "位学生成绩");
            arrayScore[i] = sc.nextDouble();
        }

        for (int i = 0; i < arrayName.length; i++) {
            System.out.println((i + 1) + "\t" + arrayName[i] + "\t" + arrayScore[i]);
        }

    }
}
