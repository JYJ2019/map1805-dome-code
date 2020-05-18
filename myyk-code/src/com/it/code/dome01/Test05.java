package com.it.code.dome01;

import java.util.Scanner;

/*
5.	使用二维数组存储3位客户信息，
客户信息有：会员号，年龄，积分。
存储完成后打印刚才输入的客户信息（以表格形式）（30分）
 */
public class Test05 {
    public static void main(String[] args) {
        String[][] array = new String[3][4];
        Scanner sc = new Scanner(System.in);
        array[0][0] = "会员号";
        array[1][0] = "年龄";
        array[2][0] = "积分";

        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                array[j][i] = sc.next();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[j][i] + "\t");
            }
            System.out.println();
        }
    }
}
