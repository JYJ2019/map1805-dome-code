package com.it.code.dome01;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("书店管理系统>会员信息管理>显示客户信息");
        System.out.println("会员号\t年龄\t积分");
        int[][] array = {
                {1100, 18, 100},
                {1101, 24, 834},
                {1102, 13, 20000},
                {1103, 20, 2938},
                {1104, 22, 500},
                {1105, 22, 3569},
                {1106, 45, 45},
                {1107, 6, 459},
        };

        cycle(array);
    }
    public static void cycle(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == array[i].length - 1) {
                    System.out.println("\t" + array[i][j]);
                } else {
                    System.out.print(array[i][j] + "\t");
                }
            }
        }
    }
}
