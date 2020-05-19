package com.it.code.dome01;

public class Test04 {
    public static void main(String[] args) {
        //行数,奇数
        int row = 7;
        //内容最多的一行的行数
        int maxNum = (row + 1) / 2;

        //正三角
        for (int i = 1; i <= maxNum; i++) {
            //空格
            for (int j = 1; j <= maxNum - i; j++) {
                System.out.print(" ");
            }
            //内容
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //倒三角
        for (int i = row - maxNum; i > 0 ; i--) {
            for (int j = 1; j <= maxNum - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
