package com.it.code.dome01;

/*
2.	打印九九乘法表。（10分）
 */
public class Test02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j <= i) {
                    System.out.print(j + "*" + i + "=" + (j * i) + " \t");
                }
            }
            System.out.println();
        }
    }
}
