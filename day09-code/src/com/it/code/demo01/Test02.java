package com.it.code.demo01;

/*
2.	打印九九乘法表。（10分）
 */
public class Test02 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j <= i)
                    System.out.print(j + "*" + i + "=" + (i * j) + " \t");
            }
            System.out.println();
        }
    }
}
