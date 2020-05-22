package com.it.code.dome01;

import java.util.Scanner;

/*
5.	使用二维数组存储3位客户信息，
客户信息有：会员号，年龄，积分。
存储完成后打印刚才输入的客户信息（以表格形式）（30分）
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("输入第" + (i + 1) + "个会员号,年龄,积分.");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("会员号\t年龄\t积分");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
}
